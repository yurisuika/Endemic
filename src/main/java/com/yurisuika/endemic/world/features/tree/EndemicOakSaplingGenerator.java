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
                    if (random.nextInt(10) == 0) {
                        return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                    }
                    return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                }
                else if (chance < EndemicConfig.netherStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_OAK;
                }
                else if (chance < EndemicConfig.netherDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
            // END BIOMES
            else if (category == Biome.Category.THEEND) {
                if (chance < EndemicConfig.endNormalChance) {
                    if (random.nextInt(10) == 0) {
                        return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                    }
                    return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                }
                else if (chance < EndemicConfig.endStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_OAK;
                }
                else if (chance < EndemicConfig.endDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
            // OVERWORLD BIOMES
            else {
                // ENDEMIC BIOMES
                if (category == Biome.Category.SWAMP) {
                    if (chance < EndemicConfig.endemicChance) {
                        return TreeConfiguredFeatures.SWAMP_OAK;
                    }
                    else if (random.nextInt(10) == 0) {
                        return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                    }
                    return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                }
                else if (category == Biome.Category.JUNGLE) {
                    if (chance < EndemicConfig.endemicChance) {
                        if (BiomeKey.get() == BiomeKeys.SPARSE_JUNGLE) {
                            if (random.nextInt(10) == 0) {
                                return TreeConfiguredFeatures.FANCY_OAK;
                            }
                            return TreeConfiguredFeatures.JUNGLE_BUSH;
                        }
                        return TreeConfiguredFeatures.JUNGLE_BUSH;
                    }
                    else if (random.nextInt(10) == 0) {
                        return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                    }
                    return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                }
                else if (BiomeKey.get() == BiomeKeys.WOODED_BADLANDS) {
                    if (chance < EndemicConfig.endemicChance) {
                        return TreeConfiguredFeatures.OAK;
                    }
                    else if (random.nextInt(10) == 0) {
                        return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                    }
                    return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                }
                // NATIVE BIOMES
                else if (category == Biome.Category.OCEAN  || category == Biome.Category.RIVER || (category == Biome.Category.FOREST && BiomeKey.get() != BiomeKeys.BIRCH_FOREST && BiomeKey.get() != BiomeKeys.OLD_GROWTH_BIRCH_FOREST) || (category == Biome.Category.PLAINS && BiomeKey.get() != BiomeKeys.ICE_SPIKES && BiomeKey.get() != BiomeKeys.SNOWY_PLAINS) || BiomeKey.get() == BiomeKeys.MEADOW || category == Biome.Category.EXTREME_HILLS) {
                    if (random.nextInt(10) == 0) {
                        return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                    }
                    return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                }
                // NONNATIVE BIOMES
                else if (chance < EndemicConfig.overworldNormalChance) {
                    if (random.nextInt(10) == 0) {
                        return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                    }
                    return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                }
                else if (chance < EndemicConfig.overworldStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_OAK;
                }
                else if (chance < EndemicConfig.overworldDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
        }
        // VANILLA
        else if (random.nextInt(10) == 0) {
            return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
        }
        return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
    }

}
