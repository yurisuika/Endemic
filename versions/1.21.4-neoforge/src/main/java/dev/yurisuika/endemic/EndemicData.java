package dev.yurisuika.endemic;

import dev.yurisuika.endemic.data.EndemicDatapackProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod("endemic")
public class EndemicData {

    @EventBusSubscriber(modid = "endemic")
    public static class ModEvents {

        @SubscribeEvent
        public static void gatherServerData(GatherDataEvent.Server event) {
            event.getGenerator().addProvider(true, new EndemicDatapackProvider(event.getGenerator().getPackOutput(), event.getLookupProvider()));
        }

    }

    public EndemicData() {}

}