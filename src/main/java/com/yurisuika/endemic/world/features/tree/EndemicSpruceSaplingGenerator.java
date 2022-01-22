package com.yurisuika.endemic.world.features.tree;

import com.yurisuika.endemic.EndemicConfig;
import com.yurisuika.endemic.block.sapling.EndemicLargeTreeSaplingGenerator;
import com.yurisuika.endemic.world.features.EndemicConfiguredFeatures;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Random;

public abstract class EndemicSpruceSaplingGenerator extends EndemicLargeTreeSaplingGenerator {

    public EndemicSpruceSaplingGenerator() {
    }

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        Optional<RegistryKey<Biome>> BiomeKey = world.getBiomeKey(pos);

        if (EndemicConfig.enable) {
            if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Hardcore) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA && BiomeKey.get() != BiomeKeys.OLD_GROWTH_PINE_TAIGA && BiomeKey.get() != BiomeKeys.TAIGA && BiomeKey.get() != BiomeKeys.SNOWY_TAIGA && BiomeKey.get() != BiomeKeys.GROVE && BiomeKey.get() != BiomeKeys.WINDSWEPT_FOREST && BiomeKey.get() != BiomeKeys.WINDSWEPT_HILLS && BiomeKey.get() != BiomeKeys.WINDSWEPT_GRAVELLY_HILLS && BiomeKey.get() != BiomeKeys.JAGGED_PEAKS && BiomeKey.get() != BiomeKeys.FROZEN_PEAKS && BiomeKey.get() != BiomeKeys.STONY_PEAKS)) {
                return EndemicConfiguredFeatures.DEAD_BUSH;
            }
            else if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Realistic) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA && BiomeKey.get() != BiomeKeys.OLD_GROWTH_PINE_TAIGA && BiomeKey.get() != BiomeKeys.TAIGA && BiomeKey.get() != BiomeKeys.SNOWY_TAIGA && BiomeKey.get() != BiomeKeys.GROVE && BiomeKey.get() != BiomeKeys.WINDSWEPT_FOREST && BiomeKey.get() != BiomeKeys.WINDSWEPT_HILLS && BiomeKey.get() != BiomeKeys.WINDSWEPT_GRAVELLY_HILLS && BiomeKey.get() != BiomeKeys.JAGGED_PEAKS && BiomeKey.get() != BiomeKeys.FROZEN_PEAKS && BiomeKey.get() != BiomeKeys.STONY_PEAKS)) {
                if (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                else {
                    return EndemicConfiguredFeatures.STUNTED_SPRUCE;
                }
            }
            else {
                if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID)) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                else if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.WINDSWEPT_FOREST || BiomeKey.get() == BiomeKeys.WINDSWEPT_HILLS || BiomeKey.get() == BiomeKeys.WINDSWEPT_GRAVELLY_HILLS || BiomeKey.get() == BiomeKeys.JAGGED_PEAKS || BiomeKey.get() == BiomeKeys.FROZEN_PEAKS || BiomeKey.get() == BiomeKeys.STONY_PEAKS)) {
                    return TreeConfiguredFeatures.SPRUCE;
                }
                else {
                    return random.nextBoolean() ? TreeConfiguredFeatures.SPRUCE : TreeConfiguredFeatures.PINE;
                }
            }
        }
        else {
            return TreeConfiguredFeatures.SPRUCE;
        }
    }

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getLargeTreeFeature(Random random, ServerWorld world, BlockPos pos) {
        Optional<RegistryKey<Biome>> BiomeKey = world.getBiomeKey(pos);

        if (EndemicConfig.enable) {
            if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Hardcore) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA && BiomeKey.get() != BiomeKeys.OLD_GROWTH_PINE_TAIGA)) {
                return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
            }
            else if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Realistic) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA && BiomeKey.get() != BiomeKeys.OLD_GROWTH_PINE_TAIGA)) {
                if (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID) {
                    return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                }
                else {
                    return EndemicConfiguredFeatures.STUNTED_MEGA_SPRUCE;
                }
            }
            else {
                if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID)) {
                    return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                }
                else if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA)) {
                    return TreeConfiguredFeatures.MEGA_SPRUCE;
                }
                else if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.OLD_GROWTH_PINE_TAIGA)) {
                    return random.nextBoolean() ? TreeConfiguredFeatures.MEGA_SPRUCE : TreeConfiguredFeatures.MEGA_PINE;
                }
                else {
                    return null;
                }
            }
        }
        else {
            return random.nextBoolean() ? TreeConfiguredFeatures.MEGA_SPRUCE : TreeConfiguredFeatures.MEGA_PINE;
        }
    }

    protected abstract @Nullable ConfiguredFeature<?, ?> getLargeTreeFeature(Random random);
}
