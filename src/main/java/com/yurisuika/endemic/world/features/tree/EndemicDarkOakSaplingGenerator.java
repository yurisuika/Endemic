package com.yurisuika.endemic.world.features.tree;

import com.yurisuika.endemic.Endemic;
import com.yurisuika.endemic.EndemicConfig;
import com.yurisuika.endemic.block.sapling.EndemicLargeTreeSaplingGenerator;
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

public abstract class EndemicDarkOakSaplingGenerator extends EndemicLargeTreeSaplingGenerator {

    public EndemicDarkOakSaplingGenerator() {
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
                    return Endemic.STUNTED_DARK_OAK;
                }
                else if (chance < EndemicConfig.netherStuntedChance) {
                    return Endemic.STUNTED_DARK_OAK;
                }
                else if (chance < EndemicConfig.netherDeadChance) {
                    return Endemic.DEAD_BUSH;
                }
                return null;
            }
            // END BIOMES
            else if (category == Biome.Category.THEEND) {
                if (chance < EndemicConfig.endNormalChance) {
                    return Endemic.STUNTED_DARK_OAK;
                }
                else if (chance < EndemicConfig.endStuntedChance) {
                    return Endemic.STUNTED_DARK_OAK;
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
                    if (biome.matchesKey(BiomeKeys.DARK_FOREST)) {
                        if (chance < EndemicConfig.endemicChance) {
                            return Endemic.STUNTED_DARK_OAK;
                        }
                        return Endemic.STUNTED_DARK_OAK;
                    }
                    // NATIVE BIOMES
                    else if (biome.matchesKey(BiomeKeys.DARK_FOREST)) {
                        return Endemic.STUNTED_DARK_OAK;
                    }
                    // NONNATIVE BIOMES
                    else if (chance < EndemicConfig.overworldNormalChance) {
                        return Endemic.STUNTED_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.overworldStuntedChance) {
                        return Endemic.STUNTED_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.overworldDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                // LIGHT FAIL
                // ENDEMIC BIOMES
                else if (biome.matchesKey(BiomeKeys.DARK_FOREST)) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        if (chance < EndemicConfig.endemicChance) {
                            return Endemic.STUNTED_DARK_OAK;
                        }
                        return Endemic.STUNTED_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                // NATIVE BIOMES
                else if (biome.matchesKey(BiomeKeys.DARK_FOREST)) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        return Endemic.STUNTED_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                // NONNATIVE BIOMES
                else if (chance < EndemicConfig.overworldNormalChance) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        return Endemic.STUNTED_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_BUSH;
                    }
                    return null;
                }
                else if (chance < EndemicConfig.overworldStuntedChance) {
                    if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_DARK_OAK;
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
        return null;
    }

    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> getLargeTreeFeature(Random random, ServerWorld world, BlockPos pos) {
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
                    return TreeConfiguredFeatures.DARK_OAK;
                }
                else if (chance < EndemicConfig.netherStuntedChance) {
                    return Endemic.STUNTED_MEGA_DARK_OAK;
                }
                else if (chance < EndemicConfig.netherDeadChance) {
                    return Endemic.DEAD_MEGA_BUSH;
                }
                return null;
            }
            // END BIOMES
            else if (category == Biome.Category.THEEND) {
                if (chance < EndemicConfig.endNormalChance) {
                    return TreeConfiguredFeatures.DARK_OAK;
                }
                else if (chance < EndemicConfig.endStuntedChance) {
                    return Endemic.STUNTED_MEGA_DARK_OAK;
                }
                else if (chance < EndemicConfig.endDeadChance) {
                    return Endemic.DEAD_MEGA_BUSH;
                }
                return null;
            }
            // OVERWORLD BIOMES
            else {
                // LIGHT PASS
                if (light >= EndemicConfig.lightLevel) {
                    // ENDEMIC BIOMES
                    if (biome.matchesKey(BiomeKeys.DARK_FOREST)) {
                        if (chance < EndemicConfig.endemicChance) {
                            return TreeConfiguredFeatures.DARK_OAK;
                        }
                        return TreeConfiguredFeatures.DARK_OAK;
                    }
                    // NATIVE BIOMES
                    else if (biome.matchesKey(BiomeKeys.DARK_FOREST)) {
                        return TreeConfiguredFeatures.DARK_OAK;
                    }
                    // NONNATIVE BIOMES
                    else if (chance < EndemicConfig.overworldNormalChance) {
                        return TreeConfiguredFeatures.DARK_OAK;
                    }
                    else if (chance < EndemicConfig.overworldStuntedChance) {
                        return Endemic.STUNTED_MEGA_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.overworldDeadChance) {
                        return Endemic.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                // LIGHT FAIL
                // ENDEMIC BIOMES
                if (biome.matchesKey(BiomeKeys.DARK_FOREST)) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        if (chance < EndemicConfig.endemicChance) {
                            return TreeConfiguredFeatures.DARK_OAK;
                        }
                        return TreeConfiguredFeatures.DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_MEGA_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                // NATIVE BIOMES
                else if (biome.matchesKey(BiomeKeys.DARK_FOREST)) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        return TreeConfiguredFeatures.DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_MEGA_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                // NONNATIVE BIOMES
                else if (chance < EndemicConfig.overworldNormalChance) {
                    if (chance < EndemicConfig.lightNormalChance) {
                        return TreeConfiguredFeatures.DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_MEGA_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                else if (chance < EndemicConfig.overworldStuntedChance) {
                    if (chance < EndemicConfig.lightStuntedChance) {
                        return Endemic.STUNTED_MEGA_DARK_OAK;
                    }
                    else if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                else if (chance < EndemicConfig.overworldDeadChance) {
                    if (chance < EndemicConfig.lightDeadChance) {
                        return Endemic.DEAD_MEGA_BUSH;
                    }
                    return null;
                }
                return null;
            }
        }
        // VANILLA
        return TreeConfiguredFeatures.DARK_OAK;
    }

    protected abstract @Nullable ConfiguredFeature<?, ?> getLargeTreeFeature(Random random);
}
