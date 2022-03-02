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

public abstract class EndemicOakSaplingGenerator extends EndemicSaplingGenerator {

    public EndemicOakSaplingGenerator() {
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
                    if (random.nextInt(10) == 0) {
                        return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                    }
                    return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                }
                else if (chance < EndemicConfig.netherStuntedChance) {
                    return Endemic.STUNTED_OAK;
                }
                else if (chance < EndemicConfig.netherDeadChance) {
                    return Endemic.DEAD_BUSH;
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
                    return Endemic.STUNTED_OAK;
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
                            if (biome.matchesKey(BiomeKeys.SPARSE_JUNGLE)) {
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
                    else if (biome.matchesKey(BiomeKeys.WOODED_BADLANDS)) {
                        if (chance < EndemicConfig.endemicChance) {
                            return TreeConfiguredFeatures.OAK;
                        }
                        else if (random.nextInt(10) == 0) {
                            return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                        }
                        return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                    }
                    // NATIVE BIOMES
                    else if (category == Biome.Category.OCEAN  || category == Biome.Category.RIVER || (category == Biome.Category.FOREST && !biome.matchesKey(BiomeKeys.BIRCH_FOREST) && !biome.matchesKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST)) || (category == Biome.Category.PLAINS && !biome.matchesKey(BiomeKeys.ICE_SPIKES) && !biome.matchesKey(BiomeKeys.SNOWY_PLAINS)) || biome.matchesKey(BiomeKeys.MEADOW) || category == Biome.Category.EXTREME_HILLS) {
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
                        return Endemic.STUNTED_OAK;
                    }
                    else if (chance < EndemicConfig.overworldDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                // LIGHT FAIL
                // ENDEMIC BIOMES
                else if (category == Biome.Category.SWAMP) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        if (chance < EndemicConfig.endemicChance) {
                            return TreeConfiguredFeatures.SWAMP_OAK;
                        }
                        else if (random.nextInt(10) == 0) {
                            return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                        }
                        return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                else if (category == Biome.Category.JUNGLE) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        if (chance < EndemicConfig.endemicChance) {
                            if (biome.matchesKey(BiomeKeys.SPARSE_JUNGLE)) {
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
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                else if (biome.matchesKey(BiomeKeys.WOODED_BADLANDS)) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        if (chance < EndemicConfig.endemicChance) {
                            return TreeConfiguredFeatures.OAK;
                        }
                        else if (random.nextInt(10) == 0) {
                            return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                        }
                        return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                // NATIVE BIOMES
                else if (category == Biome.Category.OCEAN  || category == Biome.Category.RIVER || (category == Biome.Category.FOREST && !biome.matchesKey(BiomeKeys.BIRCH_FOREST) && !biome.matchesKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST)) || (category == Biome.Category.PLAINS && !biome.matchesKey(BiomeKeys.ICE_SPIKES) && !biome.matchesKey(BiomeKeys.SNOWY_PLAINS)) || biome.matchesKey(BiomeKeys.MEADOW) || category == Biome.Category.EXTREME_HILLS) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        if (random.nextInt(10) == 0) {
                            return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                        }
                        return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                // NONNATIVE BIOMES
                else if (chance < EndemicConfig.overworldNormalChance) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        if (random.nextInt(10) == 0) {
                            return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
                        }
                        return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                else if (chance < EndemicConfig.overworldStuntedChance) {
                    if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_OAK;
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
        else if (random.nextInt(10) == 0) {
            return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
        }
        return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
    }

}
