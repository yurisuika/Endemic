package dev.yurisuika.endemic.data.sapling;

import com.google.common.collect.Maps;
import com.mojang.serialization.JsonOps;
import dev.yurisuika.endemic.Endemic;
import dev.yurisuika.endemic.core.registries.EndemicRegistries;
import dev.yurisuika.endemic.world.level.sapling.Sapling;
import dev.yurisuika.endemic.world.level.sapling.Saplings;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class SaplingProvider implements DataProvider {

    public static final Map<ResourceLocation, Sapling> DATA = Maps.newHashMap();
    public static final String DATA_DIRECTORY = EndemicRegistries.SAPLING.location().getNamespace() + "/" + EndemicRegistries.SAPLING.location().getPath();
    public final DataGenerator generator;
    public final DataGenerator.PathProvider pathProvider;

    public SaplingProvider(DataGenerator generator) {
        this.generator = generator;
        this.pathProvider = generator.createPathProvider(DataGenerator.Target.DATA_PACK, DATA_DIRECTORY);
    }

    public void addSaplings() {
        Saplings.bootstrap();
    };

    public Path getPath(ResourceLocation location) {
        return pathProvider.json(location);
    }

    @Override
    public void run(CachedOutput cache) {
        addSaplings();
        save(cache);
    }

    @Override
    public String getName() {
        return "Endemic Saplings";
    }

    public void save(CachedOutput cache) {
        DATA.forEach((key, value) -> {
            try {
                DataProvider.saveStable(cache, Sapling.CODEC.encodeStart(JsonOps.INSTANCE, value).getOrThrow(false, Endemic.LOGGER::error), getPath(key));
            } catch (IOException e) {
                Endemic.LOGGER.error("Failed to encode sapling JSON for {}: {}", key, e.getMessage());
            }
        });
    }

    public static void add(ResourceKey<Sapling> resourceKey, Sapling sapling) {
        if (DATA.put(resourceKey.location(), sapling) != null) {
            throw new IllegalStateException("Duplicate sapling key " + resourceKey.location());
        }
    }

}