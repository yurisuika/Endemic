package dev.yurisuika.endemic.util;

import dev.yurisuika.endemic.world.level.Seed;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

public class Locate {

    public static boolean hasSeeds(BlockState state) {
        return hasSeeds(state.getBlock());
    }

    public static boolean hasSeeds(Block block) {
        return hasSeeds(ForgeRegistries.BLOCKS.getKey(block).toString());
    }

    public static boolean hasSeeds(String name) {
        return Configure.getSaplings().containsKey(name);
    }

    public static Seed[] getSeeds(BlockState state) {
        return getSeeds(state.getBlock());
    }

    public static Seed[] getSeeds(Block block) {
        return getSeeds(ForgeRegistries.BLOCKS.getKey(block).toString());
    }

    public static Seed[] getSeeds(String name) {
        return Configure.getSaplings().get(name);
    }

}