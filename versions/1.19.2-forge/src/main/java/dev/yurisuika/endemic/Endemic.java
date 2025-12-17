package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.data.sapling.SaplingManager;
import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import dev.yurisuika.endemic.server.commands.EndemicCommand;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(Endemic.MOD_ID)
public class Endemic {

    public static final String MOD_ID = "endemic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void loadConfiguration() {
        Config.loadConfig();
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class GameEvents {

        @SubscribeEvent
        public static void registerCommands(RegisterCommandsEvent event) {
            EndemicCommand.register(event.getDispatcher(), event.getBuildContext(), event.getCommandSelection());
        }

        @SubscribeEvent
        public static void registerReloadListeners(AddReloadListenerEvent event) {
            event.addListener(new SaplingManager());
        }

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {

        @SubscribeEvent
        public static void registerConfiguredFeatures(FMLCommonSetupEvent event) {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_swamp_oak"), EndemicTreeFeatures.STUNTED_SWAMP_OAK);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_fancy_oak"), EndemicTreeFeatures.STUNTED_FANCY_OAK);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_oak"), EndemicTreeFeatures.STUNTED_OAK);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_mega_pine"), EndemicTreeFeatures.STUNTED_MEGA_PINE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_mega_spruce"), EndemicTreeFeatures.STUNTED_MEGA_SPRUCE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_pine"), EndemicTreeFeatures.STUNTED_PINE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_spruce"), EndemicTreeFeatures.STUNTED_SPRUCE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_super_birch"), EndemicTreeFeatures.STUNTED_SUPER_BIRCH);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_birch"), EndemicTreeFeatures.STUNTED_BIRCH);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_mega_jungle"), EndemicTreeFeatures.STUNTED_MEGA_JUNGLE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_jungle"), EndemicTreeFeatures.STUNTED_JUNGLE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_acacia"), EndemicTreeFeatures.STUNTED_ACACIA);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_dark_oak"), EndemicTreeFeatures.STUNTED_DARK_OAK);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_tall_mangrove"), EndemicTreeFeatures.STUNTED_TALL_MANGROVE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_mangrove"), EndemicTreeFeatures.STUNTED_MANGROVE);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "stunted_azalea"), EndemicTreeFeatures.STUNTED_AZALEA);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "oak_shrub"), EndemicTreeFeatures.OAK_SHRUB);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "spruce_shrub"), EndemicTreeFeatures.SPRUCE_SHRUB);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "birch_shrub"), EndemicTreeFeatures.BIRCH_SHRUB);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "jungle_shrub"), EndemicTreeFeatures.JUNGLE_SHRUB);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "acacia_shrub"), EndemicTreeFeatures.ACACIA_SHRUB);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "dark_oak_shrub"), EndemicTreeFeatures.DARK_OAK_SHRUB);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "mangrove_shrub"), EndemicTreeFeatures.MANGROVE_SHRUB);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "azalea_shrub"), EndemicTreeFeatures.AZALEA_SHRUB);
        }

    }

    public Endemic() {
        loadConfiguration();
    }

}