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
                    return random.nextBoolean() ? TreeConfiguredFeatures.SPRUCE : TreeConfiguredFeatures.PINE;
                }
                else if (chance < EndemicConfig.netherStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_SPRUCE;
                }
                else if (chance < EndemicConfig.netherDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
            // END BIOMES
            else if (category == Biome.Category.THEEND) {
                if (chance < EndemicConfig.endNormalChance) {
                    return random.nextBoolean() ? TreeConfiguredFeatures.SPRUCE : TreeConfiguredFeatures.PINE;
                }
                else if (chance < EndemicConfig.endStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_SPRUCE;
                }
                else if (chance < EndemicConfig.endDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
            // OVERWORLD BIOMES
            else {
                // ENDEMIC BIOMES
                if (category == Biome.Category.EXTREME_HILLS || BiomeKey.get() == BiomeKeys.SNOWY_PLAINS || BiomeKey.get() == BiomeKeys.FROZEN_RIVER) {
                    if (chance < EndemicConfig.endemicChance) {
                        return TreeConfiguredFeatures.SPRUCE;
                    }
                    return random.nextBoolean() ? TreeConfiguredFeatures.SPRUCE : TreeConfiguredFeatures.PINE;
                }
                // NATIVE BIOMES
                else if (category == Biome.Category.TAIGA || category == Biome.Category.MOUNTAIN || BiomeKey.get() == BiomeKeys.GROVE || BiomeKey.get() == BiomeKeys.FROZEN_OCEAN || BiomeKey.get() == BiomeKeys.DEEP_FROZEN_OCEAN || BiomeKey.get() == BiomeKeys.COLD_OCEAN || BiomeKey.get() == BiomeKeys.DEEP_COLD_OCEAN) {
                    return random.nextBoolean() ? TreeConfiguredFeatures.SPRUCE : TreeConfiguredFeatures.PINE;
                }
                // NONNATIVE BIOMES
                else if (chance < EndemicConfig.overworldNormalChance) {
                    return random.nextBoolean() ? TreeConfiguredFeatures.SPRUCE : TreeConfiguredFeatures.PINE;
                }
                else if (chance < EndemicConfig.overworldStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_SPRUCE;
                }
                else if (chance < EndemicConfig.overworldDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
        }
        // VANILLA
        else {
            return TreeConfiguredFeatures.SPRUCE;
        }
    }

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getLargeTreeFeature(Random random, ServerWorld world, BlockPos pos) {
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
                    return random.nextBoolean() ? TreeConfiguredFeatures.MEGA_SPRUCE : TreeConfiguredFeatures.MEGA_PINE;
                }
                else if (chance < EndemicConfig.netherStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_MEGA_SPRUCE;
                }
                else if (chance < EndemicConfig.netherDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                }
                return null;
            }
            // END BIOMES
            else if (category == Biome.Category.THEEND) {
                if (chance < EndemicConfig.endNormalChance) {
                    return random.nextBoolean() ? TreeConfiguredFeatures.MEGA_SPRUCE : TreeConfiguredFeatures.MEGA_PINE;
                }
                else if (chance < EndemicConfig.endStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_MEGA_SPRUCE;
                }
                else if (chance < EndemicConfig.endDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                }
                return null;
            }
            // OVERWORLD BIOMES
            else {
                // ENDEMIC BIOMES
                if (BiomeKey.get() == BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA) {
                    if (chance < EndemicConfig.endemicChance) {
                        return TreeConfiguredFeatures.SPRUCE;
                    }
                    return random.nextBoolean() ? TreeConfiguredFeatures.MEGA_SPRUCE : TreeConfiguredFeatures.MEGA_PINE;
                }
                // NATIVE BIOMES
                else if (BiomeKey.get() == BiomeKeys.OLD_GROWTH_PINE_TAIGA) {
                    return random.nextBoolean() ? TreeConfiguredFeatures.MEGA_SPRUCE : TreeConfiguredFeatures.MEGA_PINE;
                }
                // NONNATIVE BIOMES
                else if (chance < EndemicConfig.overworldNormalChance) {
                    return random.nextBoolean() ? TreeConfiguredFeatures.MEGA_SPRUCE : TreeConfiguredFeatures.MEGA_PINE;
                }
                else if (chance < EndemicConfig.overworldStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_MEGA_SPRUCE;
                }
                else if (chance < EndemicConfig.overworldDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                }
                return null;
            }
        }
        // VANILLA
        return random.nextBoolean() ? TreeConfiguredFeatures.MEGA_SPRUCE : TreeConfiguredFeatures.MEGA_PINE;
    }

    protected abstract @Nullable ConfiguredFeature<?, ?> getLargeTreeFeature(Random random);
}
