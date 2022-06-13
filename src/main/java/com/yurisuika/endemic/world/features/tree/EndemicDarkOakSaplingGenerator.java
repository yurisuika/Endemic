package com.yurisuika.endemic.world.features.tree;

import com.yurisuika.endemic.Endemic;
import com.yurisuika.endemic.block.sapling.EndemicLargeTreeSaplingGenerator;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.LightType;;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

public abstract class EndemicDarkOakSaplingGenerator extends EndemicLargeTreeSaplingGenerator {

    public EndemicDarkOakSaplingGenerator() {
    }

    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        int light = world.getLightLevel(LightType.SKY, pos);

        // ENDEMIC
        if(world.getBiome(pos).isIn(Endemic.DARK_OAK_ENDEMIC)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.DARK_OAK_ENDEMIC_FULL;
                case 11, 10, 9, 8 -> Endemic.DARK_OAK_ENDEMIC_LARGE;
                case 7, 6, 5, 4 -> Endemic.DARK_OAK_ENDEMIC_MEDIUM;
                default -> Endemic.DARK_OAK_ENDEMIC_SMALL;
            };
        }
        // NATIVE
        else if(world.getBiome(pos).isIn(Endemic.DARK_OAK_NATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.DARK_OAK_NATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.DARK_OAK_NATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.DARK_OAK_NATIVE_MEDIUM;
                default -> Endemic.DARK_OAK_NATIVE_SMALL;
            };
        }
        // NONNATIVE
        else if(world.getBiome(pos).isIn(Endemic.DARK_OAK_NONNATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.DARK_OAK_NONNATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.DARK_OAK_NONNATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.DARK_OAK_NONNATIVE_MEDIUM;
                default -> Endemic.DARK_OAK_NONNATIVE_SMALL;
            };
        }
        // DEAD
        else {
            return Endemic.DEAD_BUSH;
        }
    }

    @Override
    protected @Nullable RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> getLargeTreeFeature(Random random, ServerWorld world, BlockPos pos) {
        int light = world.getLightLevel(LightType.SKY, pos);

        // ENDEMIC (DARK OAK)
        if(world.getBiome(pos).isIn(Endemic.GIANT_DARK_OAK_ENDEMIC)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.GIANT_DARK_OAK_ENDEMIC_FULL;
                case 11, 10, 9, 8 -> Endemic.GIANT_DARK_OAK_ENDEMIC_LARGE;
                case 7, 6, 5, 4 -> Endemic.GIANT_DARK_OAK_ENDEMIC_MEDIUM;
                default -> Endemic.GIANT_DARK_OAK_ENDEMIC_SMALL;
            };
        }
        // NATIVE (DARK OAK)
        else if(world.getBiome(pos).isIn(Endemic.GIANT_DARK_OAK_NATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.GIANT_DARK_OAK_NATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.GIANT_DARK_OAK_NATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.GIANT_DARK_OAK_NATIVE_MEDIUM;
                default -> Endemic.GIANT_DARK_OAK_NATIVE_SMALL;
            };
        }
        // NONNATIVE
        else if(world.getBiome(pos).isIn(Endemic.GIANT_DARK_OAK_NONNATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.GIANT_DARK_OAK_NONNATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.GIANT_DARK_OAK_NONNATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.GIANT_DARK_OAK_NONNATIVE_MEDIUM;
                default -> Endemic.GIANT_DARK_OAK_NONNATIVE_SMALL;
            };
        }
        // DEAD
        else {
            return Endemic.GIANT_DEAD_BUSH;
        }
    }

    protected abstract RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees);

    protected abstract @Nullable RegistryEntry<? extends ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random);
}
