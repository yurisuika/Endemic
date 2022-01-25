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

public abstract class EndemicAcaciaSaplingGenerator extends EndemicSaplingGenerator {

    public EndemicAcaciaSaplingGenerator() {
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
                    return TreeConfiguredFeatures.ACACIA;
                }
                else if (chance < EndemicConfig.netherStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_ACACIA;
                }
                else if (chance < EndemicConfig.netherDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
            // END BIOMES
            else if (category == Biome.Category.THEEND) {
                if (chance < EndemicConfig.endNormalChance) {
                    return TreeConfiguredFeatures.ACACIA;
                }
                else if (chance < EndemicConfig.endStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_ACACIA;
                }
                else if (chance < EndemicConfig.endDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
            // OVERWORLD BIOMES
            else {
                // ENDEMIC BIOMES
                if (category == Biome.Category.SAVANNA) {
                    if (chance < EndemicConfig.endemicChance) {
                        return TreeConfiguredFeatures.ACACIA;
                    }
                    return TreeConfiguredFeatures.ACACIA;
                }
                // NATIVE BIOMES
                else if (BiomeKey.get() == BiomeKeys.LUKEWARM_OCEAN) {
                    return TreeConfiguredFeatures.ACACIA;
                }
                // NONNATIVE BIOMES
                else if (chance < EndemicConfig.overworldNormalChance) {
                    return TreeConfiguredFeatures.ACACIA;
                }
                else if (chance < EndemicConfig.overworldStuntedChance) {
                    return EndemicConfiguredFeatures.STUNTED_ACACIA;
                }
                else if (chance < EndemicConfig.overworldDeadChance) {
                    return EndemicConfiguredFeatures.DEAD_BUSH;
                }
                return null;
            }
        }
        // VANILLA
        return TreeConfiguredFeatures.ACACIA;
    }

}
