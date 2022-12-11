package com.yurisuika.endemic.world.features.tree;

import com.yurisuika.endemic.Endemic;
import com.yurisuika.endemic.block.sapling.EndemicLargeTreeSaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LightType;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

public abstract class EndemicJungleSaplingGenerator extends EndemicLargeTreeSaplingGenerator {

    public EndemicJungleSaplingGenerator() {
    }

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        int light = world.getLightLevel(LightType.SKY, pos);

        // ENDEMIC (VINED JUNGLE)
        if(world.getBiome(pos).isIn(Endemic.JUNGLE_ENDEMIC)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.JUNGLE_ENDEMIC_FULL;
                case 11, 10, 9, 8 -> Endemic.JUNGLE_ENDEMIC_LARGE;
                case 7, 6, 5, 4 -> Endemic.JUNGLE_ENDEMIC_MEDIUM;
                default -> Endemic.JUNGLE_ENDEMIC_SMALL;
            };
        }
        // NATIVE (JUNGLE)
        else if(world.getBiome(pos).isIn(Endemic.JUNGLE_NATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.JUNGLE_NATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.JUNGLE_NATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.JUNGLE_NATIVE_MEDIUM;
                default -> Endemic.JUNGLE_NATIVE_SMALL;
            };
        }
        // NONNATIVE
        else if(world.getBiome(pos).isIn(Endemic.JUNGLE_NONNATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.JUNGLE_NONNATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.JUNGLE_NONNATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.JUNGLE_NONNATIVE_MEDIUM;
                default -> Endemic.JUNGLE_NONNATIVE_SMALL;
            };
        }
        // DEAD
        else {
            return Endemic.DEAD_BUSH;
        }
    }

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        int light = world.getLightLevel(LightType.SKY, pos);

        // ENDEMIC (VINED GIANT JUNGLE)
        if(world.getBiome(pos).isIn(Endemic.GIANT_JUNGLE_ENDEMIC)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.GIANT_JUNGLE_ENDEMIC_FULL;
                case 11, 10, 9, 8 -> Endemic.GIANT_JUNGLE_ENDEMIC_LARGE;
                case 7, 6, 5, 4 -> Endemic.GIANT_JUNGLE_ENDEMIC_MEDIUM;
                default -> Endemic.GIANT_JUNGLE_ENDEMIC_SMALL;
            };
        }
        // NATIVE (VINED GIANT JUNGLE)
        else if(world.getBiome(pos).isIn(Endemic.GIANT_JUNGLE_NATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.GIANT_JUNGLE_NATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.GIANT_JUNGLE_NATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.GIANT_JUNGLE_NATIVE_MEDIUM;
                default -> Endemic.GIANT_JUNGLE_NATIVE_SMALL;
            };
        }
        // NONNATIVE
        else if(world.getBiome(pos).isIn(Endemic.GIANT_JUNGLE_NONNATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.GIANT_JUNGLE_NONNATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.GIANT_JUNGLE_NONNATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.GIANT_JUNGLE_NONNATIVE_MEDIUM;
                default -> Endemic.GIANT_JUNGLE_NONNATIVE_SMALL;
            };
        }
        // DEAD
        else {
            return Endemic.GIANT_DEAD_BUSH;
        }
    }

    protected abstract RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees);

    protected abstract RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random);

}