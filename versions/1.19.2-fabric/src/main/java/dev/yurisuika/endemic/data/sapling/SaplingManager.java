package dev.yurisuika.endemic.data.sapling;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import dev.yurisuika.endemic.Endemic;
import dev.yurisuika.endemic.core.registries.EndemicRegistries;
import dev.yurisuika.endemic.world.level.sapling.Sapling;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class SaplingManager implements SimpleSynchronousResourceReloadListener {

    public static final Map<ResourceLocation, Sapling> SAPLINGS = Maps.newHashMap();
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    public static final String DATA_DIRECTORY = EndemicRegistries.SAPLING.location().getNamespace() + "/" + EndemicRegistries.SAPLING.location().getPath();

    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
        SAPLINGS.clear();

        resourceManager.listResources(DATA_DIRECTORY, path -> path.toString().endsWith(".json")).forEach((location, resource) -> {
            location = new ResourceLocation(location.getNamespace(), location.getPath().replace(DATA_DIRECTORY + "/", "").replace(".json", ""));
            try (InputStream stream = resource.open()) {
                SAPLINGS.put(location, Sapling.CODEC.parse(JsonOps.INSTANCE, GSON.fromJson(new InputStreamReader(stream, StandardCharsets.UTF_8), JsonElement.class)).getOrThrow(false, Endemic.LOGGER::error));
            } catch (Exception e) {
                Endemic.LOGGER.error("Failed to parse sapling JSON for {}: {}", location, e.getMessage());
            }
        });
    }

    @Override
    public ResourceLocation getFabricId() {
        return EndemicRegistries.SAPLING.location();
    }

}