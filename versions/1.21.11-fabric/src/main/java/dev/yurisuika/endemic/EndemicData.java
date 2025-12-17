package dev.yurisuika.endemic;

import dev.yurisuika.endemic.core.registries.EndemicRegistries;
import dev.yurisuika.endemic.data.EndemicDatapackProvider;
import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import dev.yurisuika.endemic.world.level.sapling.Saplings;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class EndemicData implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        generator.createPack().addProvider(EndemicDatapackProvider::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder builder) {
        builder.add(Registries.CONFIGURED_FEATURE, EndemicTreeFeatures::bootstrap).add(EndemicRegistries.SAPLING, Saplings::bootstrap);
    }

}