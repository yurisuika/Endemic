package dev.yurisuika.endemic.server.commands;

import com.mojang.brigadier.CommandDispatcher;
import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.config.Options;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.TranslatableComponent;

public class EndemicCommand {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher, Commands.CommandSelection selection) {
        dispatcher.register(Commands.literal("endemic")
                .requires(source -> source.hasPermission(4))
                .then(Commands.literal("config")
                        .then(Commands.literal("reload")
                                .executes(commandContext -> reloadConfig(
                                        commandContext.getSource()
                                ))
                        )
                        .then(Commands.literal("reset")
                                .executes(commandContext -> resetConfig(
                                        commandContext.getSource()
                                ))
                        )
                )
        );
    }

    public static int reloadConfig(CommandSourceStack source) {
        Config.loadConfig();

        source.sendSuccess(new TranslatableComponent("commands.endemic.config.reload"), true);
        return 1;
    }

    public static int resetConfig(CommandSourceStack source) {
        Config.setOptions(new Options());
        Config.saveConfig();

        source.sendSuccess(new TranslatableComponent("commands.endemic.config.reset"), true);
        return 1;
    }

}