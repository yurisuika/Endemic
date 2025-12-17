package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.core.registries.EndemicRegistries;
import dev.yurisuika.endemic.server.commands.EndemicCommand;
import dev.yurisuika.endemic.world.level.sapling.Sapling;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DataPackRegistryEvent;
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

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {

        @SubscribeEvent
        public static void registerDynamicRegistries(DataPackRegistryEvent.NewRegistry event) {
            event.dataPackRegistry(EndemicRegistries.SAPLING, Sapling.CODEC);
        }

    }

    public Endemic() {
        loadConfiguration();
    }

}