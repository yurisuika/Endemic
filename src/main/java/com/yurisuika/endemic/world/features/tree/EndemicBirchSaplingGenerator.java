package com.yurisuika.endemic.world.features.tree;

import com.yurisuika.endemic.Endemic;
import com.yurisuika.endemic.block.sapling.EndemicSaplingGenerator;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.LightType;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

public abstract class EndemicBirchSaplingGenerator extends EndemicSaplingGenerator {

    public EndemicBirchSaplingGenerator() {
    }

    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        int light = world.getLightLevel(LightType.SKY, pos);

        // ENDEMIC (TALL BIRCH)
        if(world.getBiome(pos).isIn(Endemic.BIRCH_ENDEMIC)) {
            return switch (light) {
                case 15, 14, 13, 12 -> bees ? Endemic.BIRCH_ENDEMIC_FULL_BEES : Endemic.BIRCH_ENDEMIC_FULL;
                case 11, 10, 9, 8 -> Endemic.BIRCH_ENDEMIC_LARGE;
                case 7, 6, 5, 4 -> Endemic.BIRCH_ENDEMIC_MEDIUM;
                default -> Endemic.BIRCH_ENDEMIC_SMALL;
            };
        }
        // NATIVE (BIRCH)
        else if(world.getBiome(pos).isIn(Endemic.BIRCH_NATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> bees ? Endemic.BIRCH_NATIVE_FULL_BEES : Endemic.BIRCH_NATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.BIRCH_NATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.BIRCH_NATIVE_MEDIUM;
                default -> Endemic.BIRCH_NATIVE_SMALL;
            };
        }
        // NONNATIVE
        else if(world.getBiome(pos).isIn(Endemic.BIRCH_NONNATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.BIRCH_NONNATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.BIRCH_NONNATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.BIRCH_NONNATIVE_MEDIUM;
                default -> Endemic.BIRCH_NONNATIVE_SMALL;
            };
        }
        // DEAD
        else {
            return Endemic.DEAD_BUSH;
        }
    }

    protected abstract RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees);
}
