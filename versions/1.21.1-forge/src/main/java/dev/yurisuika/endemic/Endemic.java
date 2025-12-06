package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.registry.SaplingRegistry;
import dev.yurisuika.endemic.server.commands.EndemicCommand;
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
            EndemicCommand.register(event.getDispatcher(), event.getBuildContext(), event.getCommandSelection());
        }

    }

    @Mod.EventBusSubscriber(modid = "endemic", bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {

        @SubscribeEvent
        public static void loadConfiguration(FMLCommonSetupEvent event) {
            Config.loadConfig();
        }

        @SubscribeEvent
        public static void registerSaplings(FMLCommonSetupEvent event) {
            SaplingRegistry.bootstrap();
            SaplingRegistry.loadAllSaplingConfigs();
        }

    }

    public Endemic() {}

}