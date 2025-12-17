package dev.yurisuika.endemic;

import dev.yurisuika.endemic.data.sapling.SaplingProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod(Endemic.MOD_ID)
public class EndemicData {

    @Mod.EventBusSubscriber(modid = Endemic.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {

        @SubscribeEvent
        public static void gatherServerData(GatherDataEvent event) {
            if (event.includeServer()) {
                event.getGenerator().addProvider(new SaplingProvider(event.getGenerator()));
            }
        }

    }

    public EndemicData() {}

}