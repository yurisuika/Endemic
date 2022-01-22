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

public abstract class EndemicOakSaplingGenerator extends EndemicSaplingGenerator {

    public EndemicOakSaplingGenerator() {
    }

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        Optional<RegistryKey<Biome>> BiomeKey = world.getBiomeKey(pos);

        if (EndemicConfig.enable) {
            if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Hardcore) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.JUNGLE && BiomeKey.get() != BiomeKeys.BAMBOO_JUNGLE && BiomeKey.get() != BiomeKeys.SPARSE_JUNGLE && BiomeKey.get() != BiomeKeys.SWAMP && BiomeKey.get() != BiomeKeys.DARK_FOREST && BiomeKey.get() != BiomeKeys.FOREST && BiomeKey.get() != BiomeKeys.FLOWER_FOREST && BiomeKey.get() != BiomeKeys.PLAINS && BiomeKey.get() != BiomeKeys.SUNFLOWER_PLAINS && BiomeKey.get() != BiomeKeys.RIVER && BiomeKey.get() != BiomeKeys.FROZEN_RIVER && BiomeKey.get() != BiomeKeys.OCEAN && BiomeKey.get() != BiomeKeys.COLD_OCEAN && BiomeKey.get() != BiomeKeys.FROZEN_OCEAN && BiomeKey.get() != BiomeKeys.LUKEWARM_OCEAN && BiomeKey.get() != BiomeKeys.WARM_OCEAN && BiomeKey.get() != BiomeKeys.DEEP_COLD_OCEAN && BiomeKey.get() != BiomeKeys.DEEP_FROZEN_OCEAN && BiomeKey.get() != BiomeKeys.DEEP_LUKEWARM_OCEAN && BiomeKey.get() != BiomeKeys.DEEP_OCEAN && BiomeKey.get() != BiomeKeys.MEADOW && BiomeKey.get() != BiomeKeys.WINDSWEPT_FOREST && BiomeKey.get() != BiomeKeys.WINDSWEPT_HILLS)) {
                return EndemicConfiguredFeatures.DEAD_BUSH;
            }
            else if (EndemicConfig.enumRealism.equals(EndemicConfig.Realism.Realistic) && BiomeKey.isPresent() && (BiomeKey.get() != BiomeKeys.JUNGLE && BiomeKey.get() != BiomeKeys.BAMBOO_JUNGLE && BiomeKey.get() != BiomeKeys.SPARSE_JUNGLE && BiomeKey.get() != BiomeKeys.SWAMP && BiomeKey.get() != BiomeKeys.DARK_FOREST && BiomeKey.get() != BiomeKeys.FOREST && BiomeKey.get() != BiomeKeys.FLOWER_FOREST && BiomeKey.get() != BiomeKeys.PLAINS && BiomeKey.get() != BiomeKeys.SUNFLOWER_PLAINS && BiomeKey.get() != BiomeKeys.RIVER && BiomeKey.get() != BiomeKeys.FROZEN_RIVER && BiomeKey.get() != BiomeKeys.OCEAN && BiomeKey.get() != BiomeKeys.COLD_OCEAN && BiomeKey.get() != BiomeKeys.FROZEN_OCEAN && BiomeKey.get() != BiomeKeys.LUKEWARM_OCEAN && BiomeKey.get() != BiomeKeys.WARM_OCEAN && BiomeKey.get() != BiomeKeys.DEEP_COLD_OCEAN && BiomeKey.get() != BiomeKeys.DEEP_FROZEN_OCEAN && BiomeKey.get() != BiomeKeys.DEEP_LUKEWARM_OCEAN && BiomeKey.get() != BiomeKeys.DEEP_OCEAN && BiomeKey.get() != BiomeKeys.MEADOW && BiomeKey.get() != BiomeKeys.WINDSWEPT_FOREST && BiomeKey.get() != BiomeKeys.WINDSWEPT_HILLS)) {
                if (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                else {
                    return EndemicConfiguredFeatures.STUNTED_OAK;
                }
            }
            else {
                if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.NETHER_WASTES || BiomeKey.get() == BiomeKeys.BASALT_DELTAS || BiomeKey.get() == BiomeKeys.CRIMSON_FOREST || BiomeKey.get() == BiomeKeys.WARPED_FOREST || BiomeKey.get() == BiomeKeys.SOUL_SAND_VALLEY || BiomeKey.get() == BiomeKeys.THE_END || BiomeKey.get() == BiomeKeys.END_BARRENS || BiomeKey.get() == BiomeKeys.END_HIGHLANDS || BiomeKey.get() == BiomeKeys.END_MIDLANDS || BiomeKey.get() == BiomeKeys.SMALL_END_ISLANDS || BiomeKey.get() == BiomeKeys.THE_VOID)) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                else if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.SWAMP)) {
                    return TreeConfiguredFeatures.SWAMP_OAK;
                }
                else if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.WOODED_BADLANDS)) {
                    return TreeConfiguredFeatures.OAK;
                }
                else if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.JUNGLE || BiomeKey.get() == BiomeKeys.BAMBOO_JUNGLE)) {
                    return TreeConfiguredFeatures.JUNGLE_BUSH;
                }
                else if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.SPARSE_JUNGLE)) {
                    if (random.nextInt(10) == 0) {
                        return TreeConfiguredFeatures.FANCY_OAK;
                    }
                    else {
                        return TreeConfiguredFeatures.JUNGLE_BUSH;
                    }
                }
                else if (random.nextInt(10) == 0) {
                    return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                }
                else {
                    return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                }
            }
        }
        else {
            if (random.nextInt(10) == 0) {
                return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
            }
            else {
                return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
            }
        }
    }

}
