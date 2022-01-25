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

        Biome.Category category = world.getBiome(pos).getCategory();

        int chance = random.nextInt(100);

        if (EndemicConfig.enable && BiomeKey.isPresent()) {
            // VOID BIOMES
            if (category == Biome.Category.NONE) {
                return null;
            }
            // NETHER BIOMES
            else if (category == Biome.Category.NETHER) {
                if (chance < EndemicConfig.netherNormalChance) {
                    return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                }
                else if (chance < EndemicConfig.netherStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_BIRCH;
                }
                else if (chance < EndemicConfig.netherDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
            // END BIOMES
            else if (category == Biome.Category.THEEND) {
                if (chance < EndemicConfig.endNormalChance) {
                    return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                }
                else if (chance < EndemicConfig.endStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_BIRCH;
                }
                else if (chance < EndemicConfig.endDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
            // OVERWORLD BIOMES
            else {
                // ENDEMIC BIOMES
                if (BiomeKey.get() == BiomeKeys.OLD_GROWTH_BIRCH_FOREST || BiomeKey.get() == BiomeKeys.MEADOW) {
                    if (chance < EndemicConfig.endemicChance) {
                        return TreeConfiguredFeatures.SUPER_BIRCH_BEES_0002;
                    }
                    return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                }
                // NATIVE BIOMES
                else if ((category == Biome.Category.FOREST && BiomeKey.get() != BiomeKeys.GROVE) || category == Biome.Category.EXTREME_HILLS || BiomeKey.get() == BiomeKeys.OCEAN || BiomeKey.get() == BiomeKeys.DEEP_OCEAN || BiomeKey.get() == BiomeKeys.COLD_OCEAN || BiomeKey.get() == BiomeKeys.DEEP_COLD_OCEAN || BiomeKey.get() == BiomeKeys.RIVER) {
                    return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                }
                // NONNATIVE BIOMES
                else if (chance < EndemicConfig.overworldNormalChance) {
                    return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                }
                else if (chance < EndemicConfig.overworldStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_BIRCH;
                }
                else if (chance < EndemicConfig.overworldDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
        }
        // VANILLA
        return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
    }

}
