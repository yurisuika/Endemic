package com.yurisuika.endemic.block.sapling;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.BlockView;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

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
    protected abstract RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> getLargeTreeFeature(Random random, ServerWorld world, BlockPos pos);

    @Nullable
    protected abstract RegistryEntry<? extends ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random);

    public boolean generateLargeTree(ServerWorld world, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random random, int x, int z) {
        RegistryEntry<? extends ConfiguredFeature<?, ?>> registryEntry = this.getLargeTreeFeature(random, world, pos);
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

    public static boolean canGenerateLargeTree(BlockState state, BlockView world, BlockPos pos, int x, int z) {
        Block block = state.getBlock();
        return world.getBlockState(pos.add(x, 0, z)).isOf(block) && world.getBlockState(pos.add(x + 1, 0, z)).isOf(block) && world.getBlockState(pos.add(x, 0, z + 1)).isOf(block) && world.getBlockState(pos.add(x + 1, 0, z + 1)).isOf(block);
    }
}
