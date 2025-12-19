package dev.yurisuika.endemic.data.worldgen;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;

import java.util.OptionalInt;

public class EndemicFeatures {

    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_SWAMP_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 2, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator())).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_FANCY_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new FancyTrunkPlacer(3, 4, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 3),
            new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 1, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> OAK_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_MEGA_PINE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new GiantTrunkPlacer(9, 3, 1),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 6)),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_MEGA_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new GiantTrunkPlacer(9, 2, 0),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(8, 9)),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_PINE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 2, 0),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(2, 3)),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 1, 0),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new SpruceFoliagePlacer(ConstantInt.of(2), UniformInt.of(0, 1), ConstantInt.of(1)),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SPRUCE_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_SUPER_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 1, 2),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 1, 0),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> BIRCH_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_MEGA_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new MegaJungleTrunkPlacer(7, 2, 3),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new MegaJungleFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(1, 1, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 3, 0),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> JUNGLE_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_ACACIA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new ForkingTrunkPlacer(3, 2, 0),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new AcaciaFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0)),
            new TwoLayersFeatureSize(1, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> ACACIA_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_DARK_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new DarkOakTrunkPlacer(3, 2, 1),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
            new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DARK_OAK_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> STUNTED_AZALEA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new BendingTrunkPlacer(1, 1, 0, 1, ConstantInt.of(1)),
            new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1).build()),
            new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
            new TwoLayersFeatureSize(1, 0, 1))
            .dirt(new SimpleStateProvider(Blocks.ROOTED_DIRT.defaultBlockState())).forceDirt().ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> AZALEA_SHRUB = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new WeightedStateProvider(SimpleWeightedRandomList.<BlockState> builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

}