package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import dev.yurisuika.endemic.server.commands.EndemicCommand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;

public class Endemic implements ModInitializer {

    public static void registerConfiguredFeatures() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "oak_bush"), EndemicTreeFeatures.OAK_BUSH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "spruce_bush"), EndemicTreeFeatures.SPRUCE_BUSH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "birch_bush"), EndemicTreeFeatures.BIRCH_BUSH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "jungle_bush"), EndemicTreeFeatures.JUNGLE_BUSH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "acacia_bush"), EndemicTreeFeatures.ACACIA_BUSH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "dark_oak_bush"), EndemicTreeFeatures.DARK_OAK_BUSH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "mangrove_bush"), EndemicTreeFeatures.MANGROVE_BUSH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "azalea_bush"), EndemicTreeFeatures.AZALEA_BUSH);
    }

    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(EndemicCommand::register);
    }

    @Override
    public void onInitialize() {
        Config.loadConfig();

        registerConfiguredFeatures();
        registerCommands();
    }

}