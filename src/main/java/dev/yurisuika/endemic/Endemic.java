package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.data.EndemicDatapackProvider;
import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import dev.yurisuika.endemic.server.commands.EndemicCommand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class Endemic implements ModInitializer {

    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(EndemicCommand::register);
    }

    @Override
    public void onInitialize() {
        Config.loadConfig();

        registerCommands();
    }

    public static class Data implements DataGeneratorEntrypoint {

        @Override
        public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
            fabricDataGenerator.createPack().addProvider(EndemicDatapackProvider::new);
        }

        @Override
        public void buildRegistry(RegistrySetBuilder registrySetBuilder) {
            registrySetBuilder.add(Registries.CONFIGURED_FEATURE, EndemicTreeFeatures::bootstrap);
        }

    }

}