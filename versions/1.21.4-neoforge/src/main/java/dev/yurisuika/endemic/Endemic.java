package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.registry.SaplingRegistry;
import dev.yurisuika.endemic.server.commands.EndemicCommand;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

@Mod("endemic")
public class Endemic {

    @EventBusSubscriber(modid = "endemic")
    public static class GameEvents {

        @SubscribeEvent
        public static void registerCommands(RegisterCommandsEvent event) {
            EndemicCommand.register(event.getDispatcher(), event.getBuildContext(), event.getCommandSelection());
        }

    }

    @EventBusSubscriber(modid = "endemic")
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