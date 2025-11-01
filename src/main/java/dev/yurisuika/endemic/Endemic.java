package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.data.EndemicDatapackProvider;
import dev.yurisuika.endemic.server.commands.EndemicCommand;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

@Mod("endemic")
public class Endemic {

    @EventBusSubscriber(modid = "endemic")
    public static class Events {

        @SubscribeEvent
        public static void registerCommands(RegisterCommandsEvent event) {
            EndemicCommand.register(event.getDispatcher(), event.getBuildContext(), event.getCommandSelection());
        }

        @SubscribeEvent
        public static void gatherServerData(GatherDataEvent.Server event) {
            event.getGenerator().addProvider(true, new EndemicDatapackProvider(event.getGenerator().getPackOutput(), event.getLookupProvider()));
        }

    }

    public Endemic() {
        Config.loadConfig();
    }

}