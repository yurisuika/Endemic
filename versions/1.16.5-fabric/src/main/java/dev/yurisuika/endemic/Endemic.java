package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import dev.yurisuika.endemic.registry.SaplingRegistry;
import dev.yurisuika.endemic.server.commands.EndemicCommand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;

public class Endemic implements ModInitializer {

    public static void loadConfiguration() {
        Config.loadConfig();
    }

    public static void registerConfiguredFeatures() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_swamp_oak"), EndemicTreeFeatures.STUNTED_SWAMP_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_fancy_oak"), EndemicTreeFeatures.STUNTED_FANCY_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_oak"), EndemicTreeFeatures.STUNTED_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_mega_pine"), EndemicTreeFeatures.STUNTED_MEGA_PINE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_mega_spruce"), EndemicTreeFeatures.STUNTED_MEGA_SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_pine"), EndemicTreeFeatures.STUNTED_PINE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_spruce"), EndemicTreeFeatures.STUNTED_SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_super_birch"), EndemicTreeFeatures.STUNTED_SUPER_BIRCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_birch"), EndemicTreeFeatures.STUNTED_BIRCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_mega_jungle"), EndemicTreeFeatures.STUNTED_MEGA_JUNGLE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_jungle"), EndemicTreeFeatures.STUNTED_JUNGLE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_acacia"), EndemicTreeFeatures.STUNTED_ACACIA);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "stunted_dark_oak"), EndemicTreeFeatures.STUNTED_DARK_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "oak_shrub"), EndemicTreeFeatures.OAK_SHRUB);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "spruce_shrub"), EndemicTreeFeatures.SPRUCE_SHRUB);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "birch_shrub"), EndemicTreeFeatures.BIRCH_SHRUB);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "jungle_shrub"), EndemicTreeFeatures.JUNGLE_SHRUB);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "acacia_shrub"), EndemicTreeFeatures.ACACIA_SHRUB);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "dark_oak_shrub"), EndemicTreeFeatures.DARK_OAK_SHRUB);
    }

    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(EndemicCommand::register);
    }

    public static void registerSaplings() {
        SaplingRegistry.bootstrap();
        SaplingRegistry.loadAllSaplingConfigs();
    }

    @Override
    public void onInitialize() {
        loadConfiguration();
        registerConfiguredFeatures();
        registerCommands();
        registerSaplings();
    }

}