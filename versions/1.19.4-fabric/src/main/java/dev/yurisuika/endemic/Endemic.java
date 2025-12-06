package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.registry.SaplingRegistry;
import dev.yurisuika.endemic.server.commands.EndemicCommand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class Endemic implements ModInitializer {

    public static void loadConfiguration() {
        Config.loadConfig();
    }

    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(EndemicCommand::register);
    }

    public static void registerSaplings() {
        SaplingRegistry.bootstrap();
        SaplingRegistry.loadAllSaplingConfigs();
    }

    @Override
    public void onInitialize() {
        loadConfiguration();
        registerCommands();
        registerSaplings();
    }

}