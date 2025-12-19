package dev.yurisuika.endemic;

import dev.yurisuika.endemic.data.sapling.SaplingManager;
import dev.yurisuika.endemic.data.worldgen.EndemicFeatures;
import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(Endemic.MOD_ID)
public class Endemic {

    public static final String MOD_ID = "endemic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class GameEvents {

        @SubscribeEvent
        public static void registerReloadListeners(AddReloadListenerEvent event) {
            event.addListener(new SaplingManager());
        }

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {

        @SubscribeEvent
        public static void registerConfiguredFeatures(FMLCommonSetupEvent event) {
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
        }

    }

    public Endemic() {}

}