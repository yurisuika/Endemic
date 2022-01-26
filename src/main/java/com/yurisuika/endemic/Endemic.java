package com.yurisuika.endemic;

import com.yurisuika.endemic.mixin.world.gen.trunk.TrunkPlacerTypeInvoker;
import com.yurisuika.endemic.world.gen.trunk.DeadTrunkPlacer;
import com.yurisuika.endemic.world.gen.trunk.GiantDeadTrunkPlacer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Endemic implements ModInitializer {

	public static final String MOD_ID = "endemic";

	public static final Logger LOGGER = LogManager.getLogger("Endemic");

	public static final TrunkPlacerType<DeadTrunkPlacer> DEAD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("dead_trunk_placer", DeadTrunkPlacer.CODEC);
	public static final TrunkPlacerType<GiantDeadTrunkPlacer> GIANT_DEAD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("giant_dead_trunk_placer", GiantDeadTrunkPlacer.CODEC);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Endemic!");

		EndemicConfig.init(MOD_ID, EndemicConfig.class);
	}

}