package dev.yurisuika.endemic.data.worldgen;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;

import java.util.OptionalInt;

public class EndemicFeatures {

    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_SWAMP_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 2, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator())).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_FANCY_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new FancyFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(4), 3),
            new FancyTrunkPlacer(3, 4, 0),
            new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 1, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_MEGA_PINE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0), UniformInt.of(3, 6)),
            new GiantTrunkPlacer(9, 3, 1),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_MEGA_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0), UniformInt.of(8, 9)),
            new GiantTrunkPlacer(9, 2, 0),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_PINE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new PineFoliagePlacer(UniformInt.fixed(1), UniformInt.fixed(1), UniformInt.of(2, 3)),
            new StraightTrunkPlacer(4, 2, 0),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new SpruceFoliagePlacer(UniformInt.fixed(2), UniformInt.of(0, 1), UniformInt.fixed(1)),
            new StraightTrunkPlacer(4, 1, 0),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_SUPER_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 1, 2),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 1, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_MEGA_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new MegaJungleFoliagePlacer(UniformInt.fixed(1), UniformInt.fixed(0), 2),
            new MegaJungleTrunkPlacer(7, 2, 3),
            new TwoLayersFeatureSize(1, 1, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 3, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_ACACIA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new AcaciaFoliagePlacer(UniformInt.fixed(1), UniformInt.fixed(0)),
            new ForkingTrunkPlacer(3, 2, 0),
            new TwoLayersFeatureSize(1, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_DARK_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new DarkOakFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0)),
            new DarkOakTrunkPlacer(3, 2, 1),
            new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> OAK_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SPRUCE_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> BIRCH_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> JUNGLE_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> ACACIA_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DARK_OAK_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

}