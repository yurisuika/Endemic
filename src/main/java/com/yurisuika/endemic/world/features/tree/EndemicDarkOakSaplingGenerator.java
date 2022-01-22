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
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Random;

public abstract class EndemicDarkOakSaplingGenerator extends EndemicLargeTreeSaplingGenerator {

    public EndemicDarkOakSaplingGenerator() {
    }

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        Optional<RegistryKey<Biome>> BiomeKey = world.getBiomeKey(pos);

        if (EndemicConfig.enable) {
            if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Hardcore) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.DARK_FOREST)) {
                return EndemicConfiguredFeatures.DEAD_BUSH;
            }
            else if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Realistic) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.DARK_FOREST)) {
                if (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                else {
                    return EndemicConfiguredFeatures.STUNTED_DARK_OAK;
                }
            }
            else {
                if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID)) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                else {
                    return EndemicConfiguredFeatures.STUNTED_DARK_OAK;
                }
            }
        }
        else {
            return null;
        }
    }

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getLargeTreeFeature(Random random, ServerWorld world, BlockPos pos) {
        Optional<RegistryKey<Biome>> BiomeKey = world.getBiomeKey(pos);

        if (EndemicConfig.enable) {
            if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Hardcore) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.DARK_FOREST)) {
                return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
            }
            if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Realistic) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.DARK_FOREST)) {
                if (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID) {
                    return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                }
                else {
                    return EndemicConfiguredFeatures.STUNTED_MEGA_DARK_OAK;
                }
            }
            else {
                if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID)) {
                    return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                }
                else if (BiomeKey.get() == BiomeKeys.DARK_FOREST) {
                    return TreeConfiguredFeatures.DARK_OAK;
                }
                else {
                    return null;
                }
            }
        }
        else {
            return TreeConfiguredFeatures.DARK_OAK;
        }
    }

    protected abstract @Nullable ConfiguredFeature<?, ?> getLargeTreeFeature(Random random);
}
