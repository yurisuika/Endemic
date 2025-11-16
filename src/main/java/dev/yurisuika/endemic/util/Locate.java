package dev.yurisuika.endemic.util;

import dev.yurisuika.endemic.registry.SaplingRegistry;
import dev.yurisuika.endemic.world.level.Group;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class Locate {

    public static boolean hasSaplingConfig(BlockState state) {
        return hasSaplingConfig(state.getBlock());
    }

    public static boolean hasSaplingConfig(Block block) {
        return hasSaplingConfig(Registry.BLOCK.getKey(block).toString());
    }

    public static boolean hasSaplingConfig(String name) {
        return hasSaplingConfig(ResourceLocation.tryParse(name));
    }

    public static boolean hasSaplingConfig(ResourceLocation name) {
        return SaplingRegistry.SAPLINGS.containsKey(name);
    }

    public static Group[] getGroupsForSapling(BlockState state) {
        return getGroupsForSapling(state.getBlock());
    }

    public static Group[] getGroupsForSapling(Block block) {
        return getGroupsForSapling(Registry.BLOCK.getKey(block).toString());
    }

    public static Group[] getGroupsForSapling(String name) {
        return getGroupsForSapling(ResourceLocation.tryParse(name));
    }

    public static Group[] getGroupsForSapling(ResourceLocation name) {
        return SaplingRegistry.SAPLINGS.get(name);
    }

}