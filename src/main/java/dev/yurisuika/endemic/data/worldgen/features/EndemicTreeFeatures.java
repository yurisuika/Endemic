package dev.yurisuika.endemic.data.worldgen.features;

import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BushFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class EndemicTreeFeatures {

    public static final ConfiguredFeature<TreeConfiguration, ?> OAK_BUSH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
            new TwoLayersFeatureSize(0, 0, 0)).build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SPRUCE_BUSH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
            new TwoLayersFeatureSize(0, 0, 0)).build());
    public static final ConfiguredFeature<TreeConfiguration, ?> BIRCH_BUSH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
            new TwoLayersFeatureSize(0, 0, 0)).build());
    public static final ConfiguredFeature<TreeConfiguration, ?> JUNGLE_BUSH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
            new TwoLayersFeatureSize(0, 0, 0)).build());
    public static final ConfiguredFeature<TreeConfiguration, ?> ACACIA_BUSH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
            new TwoLayersFeatureSize(0, 0, 0)).build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DARK_OAK_BUSH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
            new TwoLayersFeatureSize(0, 0, 0)).build());
    public static final ConfiguredFeature<TreeConfiguration, ?> AZALEA_BUSH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new WeightedStateProvider(SimpleWeightedRandomList.<BlockState> builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
            new TwoLayersFeatureSize(0, 0, 0)).build());

}