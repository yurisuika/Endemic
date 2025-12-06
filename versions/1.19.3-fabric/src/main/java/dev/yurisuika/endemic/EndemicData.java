package dev.yurisuika.endemic;

import dev.yurisuika.endemic.data.EndemicDatapackProvider;
import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class EndemicData implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.createPack().addProvider(EndemicDatapackProvider::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registrySetBuilder) {
        registrySetBuilder.add(Registries.CONFIGURED_FEATURE, EndemicTreeFeatures::bootstrap);
    }

}