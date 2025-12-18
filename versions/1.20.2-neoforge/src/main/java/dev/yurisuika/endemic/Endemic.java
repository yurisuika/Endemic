package dev.yurisuika.endemic;

import dev.yurisuika.endemic.core.registries.EndemicRegistries;
import dev.yurisuika.endemic.world.level.sapling.Sapling;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DataPackRegistryEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(Endemic.MOD_ID)
public class Endemic {

    public static final String MOD_ID = "endemic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {

        @SubscribeEvent
        public static void registerDynamicRegistries(DataPackRegistryEvent.NewRegistry event) {
            event.dataPackRegistry(EndemicRegistries.SAPLING, Sapling.CODEC);
        }

    }

    public Endemic() {}

}