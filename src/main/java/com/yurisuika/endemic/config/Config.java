package com.yurisuika.endemic.config;

/*
 * Copyright (c) 2020 MidnightDust
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.Selectable;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ScreenTexts;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.ElementListWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

@SuppressWarnings("unchecked")
public abstract class Config {
    private static final Pattern INTEGER_ONLY = Pattern.compile("(-?[0-9]*)");
    private static final Pattern DECIMAL_ONLY = Pattern.compile("-?([\\d]+\\.?[\\d]*|[\\d]*\\.?[\\d]+|\\.)");

    private static final List<EntryInfo> entries = new ArrayList<>();

    protected static class EntryInfo {
        Field field;
        Object widget;
        int width;
        int max;
        Map.Entry<TextFieldWidget,Text> error;
        Object defaultValue;
        Object value;
        String tempValue;
        boolean inLimits = true;
        String id;
        TranslatableText name;
        int index;
    }

    public static final Map<String,Class<?>> configClass = new HashMap<>();
    private static Path path;

    private static final Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).excludeFieldsWithModifiers(Modifier.PRIVATE).addSerializationExclusionStrategy(new HiddenAnnotationExclusionStrategy()).setPrettyPrinting().create();

    public static void init(String modid, Class<?> config) {
        path = FabricLoader.getInstance().getConfigDir().resolve(modid + ".json");
        configClass.put(modid, config);

        for (Field field : config.getFields()) {
            EntryInfo info = new EntryInfo();
            if (field.isAnnotationPresent(Entry.class) || field.isAnnotationPresent(Comment.class))
                if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) initClient(modid, field, info);
            if (field.isAnnotationPresent(Entry.class))
                try {
                    info.defaultValue = field.get(null);
                } catch (IllegalAccessException ignored) {}
        }
        try { gson.fromJson(Files.newBufferedReader(path), config); }
        catch (Exception e) { write(modid); }

        for (EntryInfo info : entries) {
            if (info.field.isAnnotationPresent(Entry.class))
                try {
                    info.value = info.field.get(null);
                    info.tempValue = info.value.toString();
                } catch (IllegalAccessException ignored) {
                }
        }
    }
    @Environment(EnvType.CLIENT)
    private static void initClient(String modid, Field field, EntryInfo info) {
        Class<?> type = field.getType();
        Entry e = field.getAnnotation(Entry.class);
        info.width = e != null ? e.width() : 0;
        info.field = field;
        info.id = modid;

        if (e != null) {
            if (!e.name().equals("")) info.name = new TranslatableText(e.name());
            if (type == int.class) textField(info, Integer::parseInt, INTEGER_ONLY, e.min(), e.max(), true);
            else if (type == double.class) textField(info, Double::parseDouble, DECIMAL_ONLY, e.min(), e.max(), false);
            else if (type == String.class || type == List.class) {
                info.max = e.max() == Double.MAX_VALUE ? Integer.MAX_VALUE : (int) e.max();
                textField(info, String::length, null, Math.min(e.min(), 0), Math.max(e.max(), 1), true);
            } else if (type == boolean.class) {
                Function<Object, Text> func = value -> new LiteralText((Boolean) value ? "True" : "False").formatted((Boolean) value ? Formatting.GREEN : Formatting.RED);
                info.widget = new AbstractMap.SimpleEntry<ButtonWidget.PressAction, Function<Object, Text>>(button -> {
                    info.value = !(Boolean) info.value;
                    button.setMessage(func.apply(info.value));
                }, func);
            } else if (type.isEnum()) {
                List<?> values = Arrays.asList(field.getType().getEnumConstants());
                Function<Object, Text> func = value -> new TranslatableText(modid + ".endemicconfig." + "enum." + type.getSimpleName() + "." + info.value.toString());
                info.widget = new AbstractMap.SimpleEntry<ButtonWidget.PressAction, Function<Object, Text>>(button -> {
                    int index = values.indexOf(info.value) + 1;
                    info.value = values.get(index >= values.size() ? 0 : index);
                    button.setMessage(func.apply(info.value));
                }, func);
            }
        }
        entries.add(info);
    }

    private static void textField(EntryInfo info, Function<String,Number> f, Pattern pattern, double min, double max, boolean cast) {
        boolean isNumber = pattern != null;
        info.widget = (BiFunction<TextFieldWidget, ButtonWidget, Predicate<String>>) (t, b) -> s -> {
            s = s.trim();
            if (!(s.isEmpty() || !isNumber || pattern.matcher(s).matches())) return false;

            Number value = 0;
            boolean inLimits = false;
            info.error = null;
            if (!(isNumber && s.isEmpty()) && !s.equals("-") && !s.equals(".")) {
                value = f.apply(s);
                inLimits = value.doubleValue() >= min && value.doubleValue() <= max;
                info.error = inLimits? null : new AbstractMap.SimpleEntry<>(t, new LiteralText(value.doubleValue() < min ?
                        "§cMinimum " + (isNumber? "value" : "length") + (cast? " is " + (int)min : " is " + min) :
                        "§cMaximum " + (isNumber? "value" : "length") + (cast? " is " + (int)max : " is " + max)));
            }

            info.tempValue = s;
            t.setEditableColor(inLimits? 0xFFFFFFFF : 0xFFFF7777);
            info.inLimits = inLimits;
            b.active = entries.stream().allMatch(e -> e.inLimits);

            if (inLimits && info.field.getType() != List.class)
                info.value = isNumber? value : s;
            else if (inLimits) {
                if (((List<String>) info.value).size() == info.index) ((List<String>) info.value).add("");
                ((List<String>) info.value).set(info.index, Arrays.stream(info.tempValue.replace("[", "").replace("]", "").split(", ")).toList().get(0));
            }

            return true;
        };
    }

    public static void write(String modid) {
        path = FabricLoader.getInstance().getConfigDir().resolve(modid + ".json");
        try {
            if (!Files.exists(path)) Files.createFile(path);
            Files.write(path, gson.toJson(configClass.get(modid).getDeclaredConstructor().newInstance()).getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Environment(EnvType.CLIENT)
    public static Screen getScreen(Screen parent, String modid) {
        return new EndemicConfigScreen(parent, modid);
    }
    @Environment(EnvType.CLIENT)
    private static class EndemicConfigScreen extends Screen {
        protected EndemicConfigScreen(Screen parent, String modid) {
            super(new TranslatableText(modid + ".endemicconfig." + "title"));
            this.parent = parent;
            this.modid = modid;
            this.translationPrefix = modid + ".endemicconfig.";
        }
        private final String translationPrefix;
        private final Screen parent;
        private final String modid;
        private EndemicConfigListWidget list;
        private boolean reload = false;

        // Real Time config update //
        @Override
        public void tick() {
            super.tick();
            for (EntryInfo info : entries) {
                try {info.field.set(null, info.value);} catch (IllegalAccessException ignored) {}
            }
        }
        private void loadValues() {
            try { gson.fromJson(Files.newBufferedReader(path), configClass.get(modid)); }
            catch (Exception e) { write(modid); }

            for (EntryInfo info : entries) {
                if (info.field.isAnnotationPresent(Entry.class))
                    try {
                        info.value = info.field.get(null);
                        info.tempValue = info.value.toString();
                    } catch (IllegalAccessException ignored) {}
            }
        }
        @Override
        protected void init() {
            super.init();
            if (!reload) loadValues();

            this.addDrawableChild(new ButtonWidget(this.width / 2 - 154, this.height - 28, 150, 20, ScreenTexts.CANCEL, button -> {
                loadValues();
                Objects.requireNonNull(client).setScreen(parent);
            }));

            ButtonWidget done = this.addDrawableChild(new ButtonWidget(this.width / 2 + 4, this.height - 28, 150, 20, ScreenTexts.DONE, (button) -> {
                for (EntryInfo info : entries)
                    if (info.id.equals(modid)) {
                        try {
                            info.field.set(null, info.value);
                        } catch (IllegalAccessException ignored) {}
                    }
                write(modid);
                Objects.requireNonNull(client).setScreen(parent);
            }));

            this.list = new EndemicConfigListWidget(this.client, this.width, this.height, 32, this.height - 32, 25);
            if (this.client != null && this.client.world != null) this.list.setRenderBackground(false);
            this.addSelectableChild(this.list);
            for (EntryInfo info : entries) {
                if (info.id.equals(modid)) {
                    TranslatableText name = Objects.requireNonNullElseGet(info.name, () -> new TranslatableText(translationPrefix + info.field.getName()));
                    ButtonWidget resetButton = new ButtonWidget(width - 205, 0, 40, 20, new LiteralText("Reset").formatted(Formatting.RED), (button -> {
                        info.value = info.defaultValue;
                        info.tempValue = info.defaultValue.toString();
                        info.index = 0;
                        double scrollAmount = list.getScrollAmount();
                        this.reload = true;
                        Objects.requireNonNull(client).setScreen(this);
                        list.setScrollAmount(scrollAmount);
                    }));

                    if (info.widget instanceof Map.Entry) {
                        Map.Entry<ButtonWidget.PressAction, Function<Object, Text>> widget = (Map.Entry<ButtonWidget.PressAction, Function<Object, Text>>) info.widget;
                        if (info.field.getType().isEnum()) widget.setValue(value -> new TranslatableText(translationPrefix + "enum." + info.field.getType().getSimpleName() + "." + info.value.toString()));
                        this.list.addButton(new ButtonWidget(width - 160, 0,150, 20, widget.getValue().apply(info.value), widget.getKey()),resetButton, null,name);
                    } else if (info.field.getType() == List.class) {
                        if (!reload) info.index = 0;
                        TextFieldWidget widget = new TextFieldWidget(textRenderer, width - 160, 0, 150, 20, null);
                        widget.setMaxLength(info.width);
                        if (info.index < ((List<String>)info.value).size()) widget.setText((String.valueOf(((List<String>)info.value).get(info.index))));
                        else widget.setText("");
                        Predicate<String> processor = ((BiFunction<TextFieldWidget, ButtonWidget, Predicate<String>>) info.widget).apply(widget, done);
                        widget.setTextPredicate(processor);
                        resetButton.setWidth(20);
                        resetButton.setMessage(new LiteralText("R").formatted(Formatting.RED));
                        ButtonWidget cycleButton = new ButtonWidget(width - 185, 0, 20, 20, new LiteralText(String.valueOf(info.index)).formatted(Formatting.GOLD), (button -> {
                            ((List<String>)info.value).remove("");
                            double scrollAmount = list.getScrollAmount();
                            this.reload = true;
                            info.index = info.index + 1;
                            if (info.index > ((List<String>)info.value).size()) info.index = 0;
                            Objects.requireNonNull(client).setScreen(this);
                            list.setScrollAmount(scrollAmount);
                        }));
                        this.list.addButton(widget, resetButton, cycleButton, name);
                    } else if (info.widget != null) {
                        TextFieldWidget widget = new TextFieldWidget(textRenderer, width - 160, 0, 150, 20, null);
                        widget.setMaxLength(info.width);
                        widget.setText(info.tempValue);
                        Predicate<String> processor = ((BiFunction<TextFieldWidget, ButtonWidget, Predicate<String>>) info.widget).apply(widget, done);
                        widget.setTextPredicate(processor);
                        this.list.addButton(widget, resetButton, null, name);
                    } else {
                        this.list.addButton(null,null,null,name);
                    }
                }
            }

        }
        @Override
        public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
            this.renderBackground(matrices);
            this.list.render(matrices, mouseX, mouseY, delta);
            drawCenteredText(matrices, textRenderer, title, width / 2, 15, 0xFFFFFF);

            for (EntryInfo info : entries) {
                if (info.id.equals(modid)) {
                    if (list.getHoveredButton(mouseX,mouseY).isPresent()) {
                        ClickableWidget buttonWidget = list.getHoveredButton(mouseX,mouseY).get();
                        Text text = ButtonEntry.buttonsWithText.get(buttonWidget);
                        TranslatableText name = new TranslatableText(this.translationPrefix + info.field.getName());
                        String key = translationPrefix + info.field.getName() + ".tooltip";

                        if (info.error != null && text.equals(name)) renderTooltip(matrices, info.error.getValue(), mouseX, mouseY);
                        else if (I18n.hasTranslation(key) && text.equals(name)) {
                            List<Text> list = new ArrayList<>();
                            for (String str : I18n.translate(key).split("\n"))
                                list.add(new LiteralText(str));
                            renderTooltip(matrices, list, mouseX, mouseY);
                        }
                    }
                }
            }
            super.render(matrices,mouseX,mouseY,delta);
        }
    }
    @Environment(EnvType.CLIENT)
    public static class EndemicConfigListWidget extends ElementListWidget<ButtonEntry> {
        TextRenderer textRenderer;

        public EndemicConfigListWidget(MinecraftClient minecraftClient, int i, int j, int k, int l, int m) {
            super(minecraftClient, i, j, k, l, m);
            this.centerListVertically = false;
            textRenderer = minecraftClient.textRenderer;
        }
        @Override
        public int getScrollbarPositionX() { return this.width -7; }

        public void addButton(ClickableWidget button, ClickableWidget resetButton, ClickableWidget indexButton, Text text) {
            this.addEntry(ButtonEntry.create(button, text, resetButton, indexButton));
        }
        @Override
        public int getRowWidth() { return 10000; }
        public Optional<ClickableWidget> getHoveredButton(double mouseX, double mouseY) {
            for (ButtonEntry buttonEntry : this.children()) {
                if (buttonEntry.button != null && buttonEntry.button.isMouseOver(mouseX, mouseY)) {
                    return Optional.of(buttonEntry.button);
                }
            }
            return Optional.empty();
        }
    }
    public static class ButtonEntry extends ElementListWidget.Entry<ButtonEntry> {
        private static final TextRenderer textRenderer = MinecraftClient.getInstance().textRenderer;
        public final ClickableWidget button;
        private final ClickableWidget resetButton;
        private final ClickableWidget indexButton;
        private final Text text;
        private final List<ClickableWidget> children = new ArrayList<>();
        public static final Map<ClickableWidget, Text> buttonsWithText = new HashMap<>();

        private ButtonEntry(ClickableWidget button, Text text, ClickableWidget resetButton, ClickableWidget indexButton) {
            buttonsWithText.put(button,text);
            this.button = button;
            this.resetButton = resetButton;
            this.text = text;
            this.indexButton = indexButton;
            if (button != null) children.add(button);
            if (resetButton != null) children.add(resetButton);
            if (indexButton != null) children.add(indexButton);
        }
        public static ButtonEntry create(ClickableWidget button, Text text, ClickableWidget resetButton, ClickableWidget indexButton) {
            return new ButtonEntry(button, text, resetButton, indexButton);
        }
        public void render(MatrixStack matrices, int index, int y, int x, int entryWidth, int entryHeight, int mouseX, int mouseY, boolean hovered, float tickDelta) {
            if (button != null) {
                button.y = y;
                button.render(matrices, mouseX, mouseY, tickDelta);
            }
            if (resetButton != null) {
                resetButton.y = y;
                resetButton.render(matrices, mouseX, mouseY, tickDelta);
            }
            if (indexButton != null) {
                indexButton.y = y;
                indexButton.render(matrices, mouseX, mouseY, tickDelta);
            }
            if (text != null && (!text.getString().contains("spacer") || button != null))
                DrawableHelper.drawTextWithShadow(matrices,textRenderer, text,12,y+5,0xFFFFFF);
        }
        public List<? extends Element> children() {return children;}
        public List<? extends Selectable> selectableChildren() {return children;}
    }
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface Entry {
        int width() default 100;
        double min() default Double.MIN_NORMAL;
        double max() default Double.MAX_VALUE;
        String name() default "";
    }
    @Retention(RetentionPolicy.RUNTIME) @Target(ElementType.FIELD) public @interface Comment {}

    public static class HiddenAnnotationExclusionStrategy implements ExclusionStrategy {
        public boolean shouldSkipClass(Class<?> clazz) { return false; }
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
            return fieldAttributes.getAnnotation(Entry.class) == null;
        }
    }
}