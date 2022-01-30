package com.yurisuika.endemic.world.features.tree;

import com.yurisuika.endemic.EndemicConfig;
import com.yurisuika.endemic.block.sapling.EndemicLargeTreeSaplingGenerator;
import com.yurisuika.endemic.world.features.EndemicConfiguredFeatures;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.LightType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Random;

public abstract class EndemicJungleSaplingGenerator extends EndemicLargeTreeSaplingGenerator {

    public EndemicJungleSaplingGenerator() {
    }

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        Optional<RegistryKey<Biome>> BiomeKey = world.getBiomeKey(pos);

        Biome.Category category = world.getBiome(pos).getCategory();

        int light = world.getLightLevel(LightType.SKY, pos);

        int chance = random.nextInt(100);

        if (EndemicConfig.enable && BiomeKey.isPresent()) {
            // VOID BIOMES
            if (category == Biome.Category.NONE) {
                return null;
            }
            // NETHER BIOMES
            else if (category == Biome.Category.NETHER) {
                if (chance < EndemicConfig.netherNormalChance) {
                    return TreeConfiguredFeatures.JUNGLE_TREE_NO_VINE;
                }
                else if (chance < EndemicConfig.netherStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_JUNGLE;
                }
                else if (chance < EndemicConfig.netherDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
            // END BIOMES
            else if (category == Biome.Category.THEEND) {
                if (chance < EndemicConfig.endNormalChance) {
                    return TreeConfiguredFeatures.JUNGLE_TREE_NO_VINE;
                }
                else if (chance < EndemicConfig.endStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_JUNGLE;
                }
                else if (chance < EndemicConfig.endDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
            // OVERWORLD BIOMES
            else {
                // LIGHT PASS
                if (light >= EndemicConfig.lightLevel) {
                    // ENDEMIC BIOMES
                    if (category == Biome.Category.JUNGLE) {
                        if (chance < EndemicConfig.endemicChance) {
                            return TreeConfiguredFeatures.JUNGLE_TREE;
                        }
                        return TreeConfiguredFeatures.JUNGLE_TREE_NO_VINE;
                    }
                    // NATIVE BIOMES
                    else if (BiomeKey.get() == BiomeKeys.WARM_OCEAN) {
                        return TreeConfiguredFeatures.JUNGLE_TREE_NO_VINE;
                    }
                    // NONNATIVE BIOMES
                    else if (chance < EndemicConfig.overworldNormalChance) {
                        return TreeConfiguredFeatures.JUNGLE_TREE_NO_VINE;
                    }
                    else if (chance < EndemicConfig.overworldStuntedChance) {
                        return EndemicConfiguredFeatures.STUNTED_JUNGLE;
                    }
                    else if (chance < EndemicConfig.overworldDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_BUSH;
                    }
                    return null;
                }
                // LIGHT FAIL
                // ENDEMIC BIOMES
                if (category == Biome.Category.JUNGLE) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        if (chance < EndemicConfig.endemicChance) {
                            return TreeConfiguredFeatures.JUNGLE_TREE;
                        }
                        return TreeConfiguredFeatures.JUNGLE_TREE_NO_VINE;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return EndemicConfiguredFeatures.STUNTED_JUNGLE;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_BUSH;
                    }
                    return null;
                }
                // NATIVE BIOMES
                else if (BiomeKey.get() == BiomeKeys.WARM_OCEAN) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        return TreeConfiguredFeatures.JUNGLE_TREE_NO_VINE;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return EndemicConfiguredFeatures.STUNTED_JUNGLE;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_BUSH;
                    }
                    return null;
                }
                // NONNATIVE BIOMES
                else if (chance < EndemicConfig.overworldNormalChance) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        return TreeConfiguredFeatures.JUNGLE_TREE_NO_VINE;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return EndemicConfiguredFeatures.STUNTED_JUNGLE;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_BUSH;
                    }
                    return null;
                }
                else if (chance < EndemicConfig.overworldStuntedChance) {
                    if (chance < EndemicConfig.lightStuntedChance) {
                        return EndemicConfiguredFeatures.STUNTED_JUNGLE;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_BUSH;
                    }
                    return null;
                }
                else if (chance < EndemicConfig.overworldDeadChance) {
                    if (chance < EndemicConfig.lightDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_BUSH;
                    }
                    return null;
                }
                return null;
            }
        }
        // VANILLA
        return TreeConfiguredFeatures.JUNGLE_TREE_NO_VINE;
    }

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getLargeTreeFeature(Random random, ServerWorld world, BlockPos pos) {
        Optional<RegistryKey<Biome>> BiomeKey = world.getBiomeKey(pos);

        Biome.Category category = world.getBiome(pos).getCategory();

        int light = world.getLightLevel(LightType.SKY, pos);

        int chance = random.nextInt(100);

        if (EndemicConfig.enable && BiomeKey.isPresent()) {
            // VOID BIOMES
            if (category == Biome.Category.NONE) {
                return null;
            }
            // NETHER BIOMES
            else if (category == Biome.Category.NETHER) {
                if (chance < EndemicConfig.netherNormalChance) {
                    return TreeConfiguredFeatures.MEGA_JUNGLE_TREE;
                }
                else if (chance < EndemicConfig.netherStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_MEGA_JUNGLE;
                }
                else if (chance < EndemicConfig.netherDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                }
                return null;
            }
            // END BIOMES
            else if (category == Biome.Category.THEEND) {
                if (chance < EndemicConfig.endNormalChance) {
                    return TreeConfiguredFeatures.MEGA_JUNGLE_TREE;
                }
                else if (chance < EndemicConfig.endStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_MEGA_JUNGLE;
                }
                else if (chance < EndemicConfig.endDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                }
                return null;
            }
            // OVERWORLD BIOMES
            else {
                // LIGHT PASS
                if (light >= EndemicConfig.lightLevel) {
                    // ENDEMIC BIOMES
                    if (category == Biome.Category.JUNGLE) {
                        if (chance < EndemicConfig.endemicChance) {
                            return TreeConfiguredFeatures.MEGA_JUNGLE_TREE;
                        }
                        return TreeConfiguredFeatures.MEGA_JUNGLE_TREE;
                    }
                    // NATIVE BIOMES
                    else if (BiomeKey.get() == BiomeKeys.WARM_OCEAN) {
                        return TreeConfiguredFeatures.MEGA_JUNGLE_TREE;
                    }
                    // NONNATIVE BIOMES
                    else if (chance < EndemicConfig.overworldNormalChance) {
                        return TreeConfiguredFeatures.MEGA_JUNGLE_TREE;
                    }
                    else if (chance < EndemicConfig.overworldStuntedChance) {
                        return EndemicConfiguredFeatures.STUNTED_MEGA_JUNGLE;
                    }
                    else if (chance < EndemicConfig.overworldDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                // LIGHT FAIL
                // ENDEMIC BIOMES
                if (category == Biome.Category.JUNGLE) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        if (chance < EndemicConfig.endemicChance) {
                            return TreeConfiguredFeatures.MEGA_JUNGLE_TREE;
                        }
                        return TreeConfiguredFeatures.MEGA_JUNGLE_TREE;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return EndemicConfiguredFeatures.STUNTED_MEGA_JUNGLE;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                // NATIVE BIOMES
                else if (BiomeKey.get() == BiomeKeys.WARM_OCEAN) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        return TreeConfiguredFeatures.MEGA_JUNGLE_TREE;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return EndemicConfiguredFeatures.STUNTED_MEGA_JUNGLE;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                // NONNATIVE BIOMES
                else if (chance < EndemicConfig.overworldNormalChance) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        return TreeConfiguredFeatures.MEGA_JUNGLE_TREE;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return EndemicConfiguredFeatures.STUNTED_MEGA_JUNGLE;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                else if (chance < EndemicConfig.overworldStuntedChance) {
                    if (chance < EndemicConfig.lightStuntedChance) {
                        return EndemicConfiguredFeatures.STUNTED_MEGA_JUNGLE;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                else if (chance < EndemicConfig.overworldDeadChance) {
                    if (chance < EndemicConfig.lightDeadChance) {
                        return EndemicConfiguredFeatures.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                return null;
            }
        }
        // VANILLA
        return TreeConfiguredFeatures.MEGA_JUNGLE_TREE;
    }

    protected abstract @Nullable ConfiguredFeature<?, ?> getLargeTreeFeature(Random random);
}
