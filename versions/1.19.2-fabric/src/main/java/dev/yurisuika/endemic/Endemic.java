package dev.yurisuika.endemic;

import dev.yurisuika.endemic.data.sapling.SaplingManager;
import dev.yurisuika.endemic.data.worldgen.EndemicFeatures;
import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.server.packs.PackType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Endemic implements ModInitializer {

    public static final String MOD_ID = "endemic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void registerConfiguredFeatures() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_SWAMP_OAK, EndemicFeatures.STUNTED_SWAMP_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_FANCY_OAK, EndemicFeatures.STUNTED_FANCY_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_OAK, EndemicFeatures.STUNTED_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.OAK_SHRUB, EndemicFeatures.OAK_SHRUB);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_MEGA_PINE, EndemicFeatures.STUNTED_MEGA_PINE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_MEGA_SPRUCE, EndemicFeatures.STUNTED_MEGA_SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_PINE, EndemicFeatures.STUNTED_PINE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_SPRUCE, EndemicFeatures.STUNTED_SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SPRUCE_SHRUB, EndemicFeatures.SPRUCE_SHRUB);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_SUPER_BIRCH, EndemicFeatures.STUNTED_SUPER_BIRCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_BIRCH, EndemicFeatures.STUNTED_BIRCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.BIRCH_SHRUB, EndemicFeatures.BIRCH_SHRUB);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_MEGA_JUNGLE, EndemicFeatures.STUNTED_MEGA_JUNGLE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_JUNGLE, EndemicFeatures.STUNTED_JUNGLE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.JUNGLE_SHRUB, EndemicFeatures.JUNGLE_SHRUB);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_ACACIA, EndemicFeatures.STUNTED_ACACIA);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.ACACIA_SHRUB, EndemicFeatures.ACACIA_SHRUB);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_DARK_OAK, EndemicFeatures.STUNTED_DARK_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DARK_OAK_SHRUB, EndemicFeatures.DARK_OAK_SHRUB);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_AZALEA, EndemicFeatures.STUNTED_AZALEA);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.AZALEA_SHRUB, EndemicFeatures.AZALEA_SHRUB);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_TALL_MANGROVE, EndemicFeatures.STUNTED_TALL_MANGROVE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.STUNTED_MANGROVE, EndemicFeatures.STUNTED_MANGROVE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.MANGROVE_SHRUB, EndemicFeatures.MANGROVE_SHRUB);
    }

    public static void registerReloadListeners() {
        ResourceManagerHelper.get(PackType.SERVER_DATA).registerReloadListener(new SaplingManager());
    }

    @Override
    public void onInitialize() {
        registerConfiguredFeatures();
        registerReloadListeners();
    }

}