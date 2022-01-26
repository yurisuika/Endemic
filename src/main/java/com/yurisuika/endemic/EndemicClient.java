package com.yurisuika.endemic;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;

public class EndemicClient implements ClientModInitializer {

    public static final String MOD_ID = "endemic";

    public static final Logger LOGGER = LogManager.getLogger("Endemic");

    private static KeyBinding keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "endemic.endemicconfig.title",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_G,
            "endemic.endemicconfig.endemic"
    ));

    @Override
    public void onInitializeClient() {
        LOGGER.info("Loading Endemic Client!");

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (keyBinding.wasPressed())
                client.setScreen(new EndemicConfig().getScreen(null, MOD_ID));
        });
    }

}
