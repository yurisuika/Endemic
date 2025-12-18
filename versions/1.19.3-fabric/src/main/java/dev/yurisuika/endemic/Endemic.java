package dev.yurisuika.endemic;

import dev.yurisuika.endemic.data.sapling.SaplingManager;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.server.packs.PackType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Endemic implements ModInitializer {

    public static final String MOD_ID = "endemic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void registerReloadListeners() {
        ResourceManagerHelper.get(PackType.SERVER_DATA).registerReloadListener(new SaplingManager());
    }

    @Override
    public void onInitialize() {
        registerReloadListeners();
    }

}