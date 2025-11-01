package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import dev.yurisuika.endemic.server.commands.EndemicCommand;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod("endemic")
public class Endemic {

    @Mod.EventBusSubscriber(modid = "endemic", bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class GameEvents {

        @SubscribeEvent
        public static void registerCommands(RegisterCommandsEvent event) {
            EndemicCommand.register(event.getDispatcher(), event.getEnvironment());
        }

    }

    @Mod.EventBusSubscriber(modid = "endemic", bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {

        @SubscribeEvent
        public static void registerConfiguredFeatures(FMLCommonSetupEvent event) {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "oak_bush"), EndemicTreeFeatures.OAK_BUSH);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "spruce_bush"), EndemicTreeFeatures.SPRUCE_BUSH);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "birch_bush"), EndemicTreeFeatures.BIRCH_BUSH);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "jungle_bush"), EndemicTreeFeatures.JUNGLE_BUSH);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "acacia_bush"), EndemicTreeFeatures.ACACIA_BUSH);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "dark_oak_bush"), EndemicTreeFeatures.DARK_OAK_BUSH);
        }

    }

    public Endemic() {
        Config.loadConfig();
    }

}