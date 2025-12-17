package dev.yurisuika.endemic.data.sapling;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import dev.yurisuika.endemic.Endemic;
import dev.yurisuika.endemic.core.registries.EndemicRegistries;
import dev.yurisuika.endemic.world.level.sapling.Sapling;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;

import java.util.Map;

public class SaplingManager extends SimpleJsonResourceReloadListener {

    public static final Map<ResourceLocation, Sapling> SAPLINGS = Maps.newHashMap();
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    public static final String DATA_DIRECTORY = EndemicRegistries.SAPLING.location().getNamespace() + "/" + EndemicRegistries.SAPLING.location().getPath();

    public SaplingManager() {
        super(GSON, DATA_DIRECTORY);
    }

    @Override
    public void apply(Map<ResourceLocation, JsonElement> jsonElementMap, ResourceManager resourceManager, ProfilerFiller profiler) {
        SAPLINGS.clear();

        jsonElementMap.forEach((location, jsonElement) -> {
            try {
                SAPLINGS.put(location, Sapling.CODEC.parse(JsonOps.INSTANCE, jsonElement).getOrThrow(false, Endemic.LOGGER::error));
            } catch (Exception e) {
                Endemic.LOGGER.error("Failed to parse sapling JSON for {}: {}", location, e.getMessage());
            }
        });
    }

}