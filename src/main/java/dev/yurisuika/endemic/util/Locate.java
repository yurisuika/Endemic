package dev.yurisuika.endemic.util;

import dev.yurisuika.endemic.world.level.Seed;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class Locate {

    public static boolean hasSeeds(BlockState state) {
        return hasSeeds(state.getBlock());
    }

    public static boolean hasSeeds(Block block) {
        return hasSeeds(BuiltInRegistries.BLOCK.getKey(block).toString());
    }

    public static boolean hasSeeds(String name) {
        return Configure.getSaplings().containsKey(name);
    }

    public static Seed[] getSeeds(BlockState state) {
        return getSeeds(state.getBlock());
    }

    public static Seed[] getSeeds(Block block) {
        return getSeeds(BuiltInRegistries.BLOCK.getKey(block).toString());
    }

    public static Seed[] getSeeds(String name) {
        return Configure.getSaplings().get(name);
    }

}