package dev.yurisuika.endemic.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.yurisuika.endemic.world.level.Group;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.stream.Stream;

public class SaplingConfig {

    public File file;
    public static Gson gson = new GsonBuilder().enableComplexMapKeySerialization().setPrettyPrinting().disableHtmlEscaping().create();
    public ResourceLocation name;
    public Group[] groups;

    public SaplingConfig(ResourceLocation name, Group[] groups) {
        this.name = name;
        this.groups = groups;
        this.file = new File(new File(new File(FMLPaths.CONFIGDIR.get().toFile(), "endemic"), name.getNamespace()), name.getPath() + ".json");
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group... groups) {
        this.groups = groups;
    }

    public void saveConfig() {
        try {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, false), StandardCharsets.UTF_8));
            bufferedWriter.write(gson.toJson(getGroups()));
            bufferedWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void loadConfig() {
        if (file.exists()) {
            try {
                StringBuilder contentBuilder = new StringBuilder();
                try (Stream<String> stream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
                    stream.forEach(s -> contentBuilder.append(s).append("\n"));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                setGroups(gson.fromJson(contentBuilder.toString(), Group[].class));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            saveConfig();
        }
    }

}