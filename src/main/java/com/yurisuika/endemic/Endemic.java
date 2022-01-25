package com.yurisuika.endemic;

import com.yurisuika.endemic.mixin.world.gen.trunk.TrunkPlacerTypeInvoker;
import com.yurisuika.endemic.world.gen.trunk.DeadTrunkPlacer;
import com.yurisuika.endemic.world.gen.trunk.GiantDeadTrunkPlacer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;

public class Endemic implements ModInitializer {

	public static final String MOD_ID = "endemic";

	public static final Logger LOGGER = LogManager.getLogger("Endemic");

	KeyBinding keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding("Settings", GLFW.GLFW_KEY_G, "Endemic"));

	public static final TrunkPlacerType<DeadTrunkPlacer> DEAD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("dead_trunk_placer", DeadTrunkPlacer.CODEC);
	public static final TrunkPlacerType<GiantDeadTrunkPlacer> GIANT_DEAD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("giant_dead_trunk_placer", GiantDeadTrunkPlacer.CODEC);

	@Override
	public void onInitialize() {

		LOGGER.info("Loading Endemic!");

		EndemicConfig.init(MOD_ID, EndemicConfig.class);

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while (keyBinding.wasPressed())
			client.setScreen(new EndemicConfig().getScreen(null, MOD_ID));
		});

	}

}