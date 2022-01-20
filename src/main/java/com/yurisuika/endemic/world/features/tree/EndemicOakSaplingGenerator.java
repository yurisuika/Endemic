package com.yurisuika.endemic.world.features.tree;

import com.yurisuika.endemic.block.sapling.EndemicSaplingGenerator;
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

public class EndemicOakSaplingGenerator extends EndemicSaplingGenerator {

    public EndemicOakSaplingGenerator() {
    }

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {

        Optional<RegistryKey<Biome>> BiomeKey = world.getBiomeKey(pos);

        if (BiomeKey.isPresent() && (BiomeKey.get() == BiomeKeys.SWAMP)) {
            return TreeConfiguredFeatures.SWAMP_OAK;
        }

        if (random.nextInt(10) == 0) {
            return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
        } else {
            return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
        }

    }

}
