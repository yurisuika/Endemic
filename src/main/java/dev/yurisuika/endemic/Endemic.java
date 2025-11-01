package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.data.EndemicDatapackProvider;
import dev.yurisuika.endemic.server.commands.EndemicCommand;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

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
        public static void gatherServerData(GatherDataEvent event) {
            event.getGenerator().addProvider(event.includeServer(), new EndemicDatapackProvider(event.getGenerator().getPackOutput(), event.getLookupProvider()));
        }

    }

    public Endemic() {
        Config.loadConfig();
    }

}