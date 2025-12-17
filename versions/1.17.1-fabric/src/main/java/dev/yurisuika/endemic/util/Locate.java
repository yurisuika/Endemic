package dev.yurisuika.endemic.util;

import dev.yurisuika.endemic.data.sapling.SaplingManager;
import dev.yurisuika.endemic.world.level.sapling.Sapling;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class Locate {

    public static boolean hasSapling(Level level, BlockState state) {
        return hasSapling(level, state.getBlock());
    }

    public static boolean hasSapling(Level level, Block block) {
        return hasSapling(level, Registry.BLOCK.getKey(block));
    }

    public static boolean hasSapling(Level level, ResourceLocation location) {
        return SaplingManager.SAPLINGS.containsKey(location);
    }

    public static Sapling getSapling(Level level, BlockState state) {
        return getSapling(level, state.getBlock());
    }

    public static Sapling getSapling(Level level, Block block) {
        return getSapling(level, Registry.BLOCK.getKey(block));
    }

    public static Sapling getSapling(Level level, ResourceLocation location) {
        return SaplingManager.SAPLINGS.get(location);
    }

}