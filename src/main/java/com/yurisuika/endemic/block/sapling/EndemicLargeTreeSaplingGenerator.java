package com.yurisuika.endemic.block.sapling;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;

public abstract class EndemicLargeTreeSaplingGenerator extends EndemicSaplingGenerator {
    public EndemicLargeTreeSaplingGenerator() {
    }

    public boolean generate(ServerWorld world, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random random) {
        for(int i = 0; i >= -1; --i) {
            for(int j = 0; j >= -1; --j) {
                if (canGenerateLargeTree(state, world, pos, i, j)) {
                    return this.generateLargeTree(world, chunkGenerator, pos, state, random, i, j);
                }
            }
        }

        return super.generate(world, chunkGenerator, pos, state, random);
    }

    @Nullable
    protected abstract RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos);

    public boolean generateLargeTree(ServerWorld world, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random random, int x, int z) {
        RegistryKey<ConfiguredFeature<?, ?>> registryKey = this.getLargeTreeFeature(random, this.areFlowersNearby(world, pos), world, pos);
        if (registryKey == null) {
            return false;
        } else {
            RegistryEntry<ConfiguredFeature<?, ?>> registryEntry = (RegistryEntry)world.getRegistryManager().get(RegistryKeys.CONFIGURED_FEATURE).getEntry(registryKey).orElse((RegistryEntry.Reference<ConfiguredFeature<?, ?>>) null);
            if (registryEntry == null) {
                return false;
            } else {
                ConfiguredFeature<?, ?> configuredFeature = (ConfiguredFeature)registryEntry.value();
                BlockState blockState = Blocks.AIR.getDefaultState();
                world.setBlockState(pos.add(x, 0, z), blockState, 4);
                world.setBlockState(pos.add(x + 1, 0, z), blockState, 4);
                world.setBlockState(pos.add(x, 0, z + 1), blockState, 4);
                world.setBlockState(pos.add(x + 1, 0, z + 1), blockState, 4);
                if (configuredFeature.generate(world, chunkGenerator, random, pos.add(x, 0, z))) {
                    return true;
                } else {
                    world.setBlockState(pos.add(x, 0, z), state, 4);
                    world.setBlockState(pos.add(x + 1, 0, z), state, 4);
                    world.setBlockState(pos.add(x, 0, z + 1), state, 4);
                    world.setBlockState(pos.add(x + 1, 0, z + 1), state, 4);
                    return false;
                }
            }
        }
    }

    private boolean areFlowersNearby(WorldAccess world, BlockPos pos) {
        Iterator var3 = BlockPos.Mutable.iterate(pos.down().north(2).west(2), pos.up().south(2).east(2)).iterator();

        BlockPos blockPos;
        do {
            if (!var3.hasNext()) {
                return false;
            }

            blockPos = (BlockPos)var3.next();
        } while(!world.getBlockState(blockPos).isIn(BlockTags.FLOWERS));

        return true;
    }

    public static boolean canGenerateLargeTree(BlockState state, BlockView world, BlockPos pos, int x, int z) {
        Block block = state.getBlock();
        return world.getBlockState(pos.add(x, 0, z)).isOf(block) && world.getBlockState(pos.add(x + 1, 0, z)).isOf(block) && world.getBlockState(pos.add(x, 0, z + 1)).isOf(block) && world.getBlockState(pos.add(x + 1, 0, z + 1)).isOf(block);
    }
}
