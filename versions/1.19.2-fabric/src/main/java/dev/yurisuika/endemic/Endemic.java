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
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SWAMP_OAK, EndemicFeatures.SWAMP_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SWAMP_OAK_WITH_BEE_NEST, EndemicFeatures.SWAMP_OAK_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.FANCY_OAK, EndemicFeatures.FANCY_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.FANCY_OAK_WITH_BEE_NEST, EndemicFeatures.FANCY_OAK_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.OAK, EndemicFeatures.OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.OAK_WITH_BEE_NEST, EndemicFeatures.OAK_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_SWAMP_OAK, EndemicFeatures.DWARF_SWAMP_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_FANCY_OAK, EndemicFeatures.DWARF_FANCY_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_OAK, EndemicFeatures.DWARF_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SHRUB_OAK, EndemicFeatures.SHRUB_OAK);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.MEGA_PINE_SPRUCE, EndemicFeatures.MEGA_PINE_SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.MEGA_PINE_SPRUCE_WITH_BEE_NEST, EndemicFeatures.MEGA_PINE_SPRUCE_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.MEGA_SPRUCE, EndemicFeatures.MEGA_SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.MEGA_SPRUCE_WITH_BEE_NEST, EndemicFeatures.MEGA_SPRUCE_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.PINE_SPRUCE, EndemicFeatures.PINE_SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.PINE_SPRUCE_WITH_BEE_NEST, EndemicFeatures.PINE_SPRUCE_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SPRUCE, EndemicFeatures.SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SPRUCE_WITH_BEE_NEST, EndemicFeatures.SPRUCE_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_MEGA_PINE_SPRUCE, EndemicFeatures.DWARF_MEGA_PINE_SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_MEGA_SPRUCE, EndemicFeatures.DWARF_MEGA_SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_PINE_SPRUCE, EndemicFeatures.DWARF_PINE_SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_SPRUCE, EndemicFeatures.DWARF_SPRUCE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SHRUB_SPRUCE, EndemicFeatures.SHRUB_SPRUCE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.TALL_BIRCH, EndemicFeatures.TALL_BIRCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.TALL_BIRCH_WITH_BEE_NEST, EndemicFeatures.TALL_BIRCH_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.BIRCH, EndemicFeatures.BIRCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.BIRCH_WITH_BEE_NEST, EndemicFeatures.BIRCH_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_TALL_BIRCH, EndemicFeatures.DWARF_TALL_BIRCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_BIRCH, EndemicFeatures.DWARF_BIRCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SHRUB_BIRCH, EndemicFeatures.SHRUB_BIRCH);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.MEGA_JUNGLE, EndemicFeatures.MEGA_JUNGLE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.MEGA_JUNGLE_WITH_BEE_NEST, EndemicFeatures.MEGA_JUNGLE_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.JUNGLE, EndemicFeatures.JUNGLE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.JUNGLE_WITH_BEE_NEST, EndemicFeatures.JUNGLE_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_MEGA_JUNGLE, EndemicFeatures.DWARF_MEGA_JUNGLE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_JUNGLE, EndemicFeatures.DWARF_JUNGLE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SHRUB_JUNGLE, EndemicFeatures.SHRUB_JUNGLE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.ACACIA, EndemicFeatures.ACACIA);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.ACACIA_WITH_BEE_NEST, EndemicFeatures.ACACIA_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_ACACIA, EndemicFeatures.DWARF_ACACIA);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SHRUB_ACACIA, EndemicFeatures.SHRUB_ACACIA);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DARK_OAK, EndemicFeatures.DARK_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DARK_OAK_WITH_BEE_NEST, EndemicFeatures.DARK_OAK_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_DARK_OAK, EndemicFeatures.DWARF_DARK_OAK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SHRUB_DARK_OAK, EndemicFeatures.SHRUB_DARK_OAK);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.AZALEA, EndemicFeatures.AZALEA);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.AZALEA_WITH_BEE_NEST, EndemicFeatures.AZALEA_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_AZALEA, EndemicFeatures.DWARF_AZALEA);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SHRUB_AZALEA, EndemicFeatures.SHRUB_AZALEA);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.TALL_MANGROVE, EndemicFeatures.TALL_MANGROVE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.TALL_MANGROVE_WITH_BEE_NEST, EndemicFeatures.TALL_MANGROVE_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.MANGROVE, EndemicFeatures.MANGROVE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.MANGROVE_WITH_BEE_NEST, EndemicFeatures.MANGROVE_WITH_BEE_NEST);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_TALL_MANGROVE, EndemicFeatures.DWARF_TALL_MANGROVE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.DWARF_MANGROVE, EndemicFeatures.DWARF_MANGROVE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EndemicTreeFeatures.SHRUB_MANGROVE, EndemicFeatures.SHRUB_MANGROVE);
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