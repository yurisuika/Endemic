package com.yurisuika.endemic;

import com.mojang.serialization.Lifecycle;
import com.yurisuika.endemic.block.EndemicSaplingBlock;
import com.yurisuika.endemic.world.features.tree.EndemicOakSaplingGenerator;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.sapling.OakSaplingGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Endemic implements ModInitializer {

	public static final String MOD_ID = "endemic";

	public static final Logger LOGGER = LogManager.getLogger("modid");

	@Override
	public void onInitialize() {

		LOGGER.info("Loading Endemic!");

	}

}