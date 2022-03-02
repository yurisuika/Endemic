package com.yurisuika.endemic.world.features.tree;

import com.yurisuika.endemic.Endemic;
import com.yurisuika.endemic.EndemicConfig;
import com.yurisuika.endemic.block.sapling.EndemicSaplingGenerator;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.LightType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public abstract class EndemicBirchSaplingGenerator extends EndemicSaplingGenerator {

    public EndemicBirchSaplingGenerator() {
    }

    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        RegistryEntry<Biome> biome = world.getBiome(pos);
        Biome.Category category = world.getBiome(pos).value().getCategory();

        int light = world.getLightLevel(LightType.SKY, pos);

        int chance = random.nextInt(100);

        if (EndemicConfig.enable) {
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
                    return Endemic.STUNTED_BIRCH;
                }
                else if (chance < EndemicConfig.netherDeadChance) {
                    return Endemic.DEAD_BUSH;
                }
                return null;
            }
            // END BIOMES
            else if (category == Biome.Category.THEEND) {
                if (chance < EndemicConfig.endNormalChance) {
                    return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                }
                else if (chance < EndemicConfig.endStuntedChance) {
                    return Endemic.STUNTED_BIRCH;
                }
                else if (chance < EndemicConfig.endDeadChance) {
                    return Endemic.DEAD_BUSH;
                }
                return null;
            }
            // OVERWORLD BIOMES
            else {
                // LIGHT PASS
                if (light >= EndemicConfig.lightLevel) {
                    // ENDEMIC BIOMES
                    if (biome.matchesKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST) || biome.matchesKey(BiomeKeys.MEADOW)) {
                        if (chance < EndemicConfig.endemicChance) {
                            return TreeConfiguredFeatures.SUPER_BIRCH_BEES_0002;
                        }
                        return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                    }
                    // NATIVE BIOMES
                    else if ((category == Biome.Category.FOREST && !biome.matchesKey(BiomeKeys.GROVE)) || category == Biome.Category.EXTREME_HILLS || biome.matchesKey(BiomeKeys.OCEAN) || biome.matchesKey(BiomeKeys.DEEP_OCEAN) || biome.matchesKey(BiomeKeys.COLD_OCEAN) || biome.matchesKey(BiomeKeys.DEEP_COLD_OCEAN) || biome.matchesKey(BiomeKeys.RIVER)) {
                        return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                    }
                    // NONNATIVE BIOMES
                    else if (chance < EndemicConfig.overworldNormalChance) {
                        return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                    }
                    else if (chance < EndemicConfig.overworldStuntedChance) {
                        return Endemic.STUNTED_BIRCH;
                    }
                    else if (chance < EndemicConfig.overworldDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                // LIGHT FAIL
                // ENDEMIC BIOMES
                else if (biome.matchesKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST) || biome.matchesKey(BiomeKeys.MEADOW)) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        if (chance < EndemicConfig.endemicChance) {
                            return TreeConfiguredFeatures.SUPER_BIRCH_BEES_0002;
                        }
                        return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_BIRCH;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                // NATIVE BIOMES
                else if ((category == Biome.Category.FOREST && !biome.matchesKey(BiomeKeys.GROVE)) || category == Biome.Category.EXTREME_HILLS || biome.matchesKey(BiomeKeys.OCEAN) || biome.matchesKey(BiomeKeys.DEEP_OCEAN) || biome.matchesKey(BiomeKeys.COLD_OCEAN) || biome.matchesKey(BiomeKeys.DEEP_COLD_OCEAN) || biome.matchesKey(BiomeKeys.RIVER)) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_BIRCH;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                // NONNATIVE BIOMES
                else if (chance < EndemicConfig.overworldNormalChance) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_BIRCH;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                else if (chance < EndemicConfig.overworldStuntedChance) {
                    if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_BIRCH;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                else if (chance < EndemicConfig.overworldDeadChance) {
                    if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                return null;
            }
        }
        // VANILLA
        return bees ? TreeConfiguredFeatures.BIRCH_BEES_005 : TreeConfiguredFeatures.BIRCH;
    }

}
