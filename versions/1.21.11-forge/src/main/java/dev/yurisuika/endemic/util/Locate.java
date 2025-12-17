package dev.yurisuika.endemic.util;

import dev.yurisuika.endemic.core.registries.EndemicRegistries;
import dev.yurisuika.endemic.world.level.sapling.Sapling;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

public class Locate {

    public static boolean hasSapling(Level level, BlockState state) {
        return hasSapling(level, state.getBlock());
    }

    public static boolean hasSapling(Level level, Block block) {
        return hasSapling(level, ForgeRegistries.BLOCKS.getKey(block));
    }

    public static boolean hasSapling(Level level, Identifier location) {
        return level.registryAccess().lookupOrThrow(EndemicRegistries.SAPLING).containsKey(location);
    }

    public static Sapling getSapling(Level level, BlockState state) {
        return getSapling(level, state.getBlock());
    }

    public static Sapling getSapling(Level level, Block block) {
        return getSapling(level, ForgeRegistries.BLOCKS.getKey(block));
    }

    public static Sapling getSapling(Level level, Identifier location) {
        return level.registryAccess().lookupOrThrow(EndemicRegistries.SAPLING).getValue(location);
    }

}