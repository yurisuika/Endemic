package com.yurisuika.endemic.world.features.tree;

import com.yurisuika.endemic.EndemicConfig;
import com.yurisuika.endemic.block.sapling.EndemicSaplingGenerator;
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

public abstract class EndemicBirchSaplingGenerator extends EndemicSaplingGenerator {

    public EndemicBirchSaplingGenerator() {
    }

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        Optional<RegistryKey<Biome>> BiomeKey = world.getBiomeKey(pos);

        if (EndemicConfig.enable) {
            if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Hardcore) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.DARK_FOREST && BiomeKey.get() != BiomeKeys.BIRCH_FOREST && BiomeKey.get() != BiomeKeys.OLD_GROWTH_BIRCH_FOREST && BiomeKey.get() != BiomeKeys.FOREST && BiomeKey.get() != BiomeKeys.MEADOW)) {
                return EndemicConfiguredFeatures.DEAD_BUSH;
            }
            else if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Realistic) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.DARK_FOREST && BiomeKey.get() != BiomeKeys.BIRCH_FOREST && BiomeKey.get() != BiomeKeys.OLD_GROWTH_BIRCH_FOREST && BiomeKey.get() != BiomeKeys.FOREST && BiomeKey.get() != BiomeKeys.MEADOW)) {
                if (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                else {
                    return EndemicConfiguredFeatures.STUNTED_BIRCH;
                }
            }
            else {
                if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID)) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                else if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.OLD_GROWTH_BIRCH_FOREST || BiomeKey.get() == BiomeKeys.MEADOW)) {
                    return TreeConfiguredFeatures.SUPER_BIRCH_BEES_0002;
                }
                else if (random.nextInt(10) == 0) {
                    return TreeConfiguredFeatures.SUPER_BIRCH_BEES_0002;
                }
                else {
                    return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                }
            }
        }
        else {
            return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
        }
    }

}
