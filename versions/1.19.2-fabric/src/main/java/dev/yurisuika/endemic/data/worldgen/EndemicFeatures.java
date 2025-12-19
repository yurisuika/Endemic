package dev.yurisuika.endemic.data.worldgen;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MangrovePropaguleBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.rootplacers.AboveRootPlacement;
import net.minecraft.world.level.levelgen.feature.rootplacers.MangroveRootPlacement;
import net.minecraft.world.level.levelgen.feature.rootplacers.MangroveRootPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.RandomizedIntStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.*;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;

import java.util.Optional;
import java.util.OptionalInt;

public class EndemicFeatures {

    public static final ConfiguredFeature<TreeConfiguration, ?> SWAMP_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(5, 3, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator(0.25F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SWAMP_OAK_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(5, 3, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator(0.25F), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> FANCY_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new FancyTrunkPlacer(3, 11, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
            new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> FANCY_OAK_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new FancyTrunkPlacer(3, 11, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
            new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 2, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> OAK_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 2, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_SWAMP_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 2, 0), 
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator(0.25F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_FANCY_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new FancyTrunkPlacer(3, 4, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 3),
            new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 1, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_PINE_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new GiantTrunkPlacer(13, 2, 14),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 7)),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_PINE_SPRUCE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new GiantTrunkPlacer(13, 2, 14),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 7)),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new GiantTrunkPlacer(13, 2, 14),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_SPRUCE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new GiantTrunkPlacer(13, 2, 14),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> PINE_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(6, 4, 0),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(3, 4)),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> PINE_SPRUCE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(6, 4, 0),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(3, 4)),
            new TwoLayersFeatureSize(2, 0, 2))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(5, 2, 1),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SPRUCE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(5, 2, 1),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
            new TwoLayersFeatureSize(2, 0, 2))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_MEGA_PINE_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new GiantTrunkPlacer(9, 3, 1),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 6)),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_MEGA_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new GiantTrunkPlacer(9, 2, 0),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(8, 9)),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_PINE_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 2, 0),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(2, 3)),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 1, 0),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new SpruceFoliagePlacer(ConstantInt.of(2), UniformInt.of(0, 1), ConstantInt.of(1)),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> TALL_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new StraightTrunkPlacer(5, 2, 6),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> TALL_BIRCH_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new StraightTrunkPlacer(5, 2, 6),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new StraightTrunkPlacer(5, 2, 0),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> BIRCH_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new StraightTrunkPlacer(5, 2, 0),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_TALL_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 1, 2),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 1, 0),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new MegaJungleTrunkPlacer(10, 2, 19),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_JUNGLE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new MegaJungleTrunkPlacer(10, 2, 19),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 8, 0),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> JUNGLE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 8, 0),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_MEGA_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new MegaJungleTrunkPlacer(7, 2, 3),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new MegaJungleFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(4, 3, 0),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> ACACIA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new ForkingTrunkPlacer(5, 2, 2),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
            new TwoLayersFeatureSize(1, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> ACACIA_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new ForkingTrunkPlacer(5, 2, 2),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
            new TwoLayersFeatureSize(1, 0, 2))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_ACACIA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new ForkingTrunkPlacer(3, 2, 0),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new AcaciaFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0)),
            new TwoLayersFeatureSize(1, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_ACACIA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> DARK_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new DarkOakTrunkPlacer(6, 2, 1),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
            new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DARK_OAK_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new DarkOakTrunkPlacer(6, 2, 1),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
            new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_DARK_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new DarkOakTrunkPlacer(3, 2, 1),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
            new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_DARK_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> AZALEA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
            new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1).build()),
            new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
            new TwoLayersFeatureSize(1, 0, 1))
            .dirt(new SimpleStateProvider(Blocks.ROOTED_DIRT.defaultBlockState())).forceDirt().ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> AZALEA_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
            new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1).build()),
            new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).dirt(new SimpleStateProvider(Blocks.ROOTED_DIRT.defaultBlockState())).forceDirt().ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_AZALEA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new BendingTrunkPlacer(1, 1, 0, 1, ConstantInt.of(1)),
            new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1).build()),
            new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
            new TwoLayersFeatureSize(1, 0, 1))
            .dirt(new SimpleStateProvider(Blocks.ROOTED_DIRT.defaultBlockState())).forceDirt().ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_AZALEA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new WeightedStateProvider(SimpleWeightedRandomList.<BlockState> builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> TALL_MANGROVE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
            new UpwardsBranchingTrunkPlacer(4, 1, 9, UniformInt.of(1, 6), 0.5F, UniformInt.of(0, 1), Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
            new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
            new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
            Optional.of(new MangroveRootPlacer(UniformInt.of(3, 7), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.of(new AboveRootPlacement(new SimpleStateProvider(Blocks.MOSS_CARPET.defaultBlockState()), 0.5F)), new MangroveRootPlacement(Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 8, 15, 0.2F))),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F), new AttachedToLeavesDecorator(0.14F, 1, 0, new RandomizedIntStateProvider(new SimpleStateProvider(Blocks.MANGROVE_PROPAGULE.defaultBlockState().setValue(MangrovePropaguleBlock.HANGING, true)), MangrovePropaguleBlock.AGE, UniformInt.of(0, 4)), 2, ImmutableList.of(Direction.DOWN)))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> TALL_MANGROVE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
            new UpwardsBranchingTrunkPlacer(4, 1, 9, UniformInt.of(1, 6), 0.5F, UniformInt.of(0, 1), Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
            new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
            new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
            Optional.of(new MangroveRootPlacer(UniformInt.of(3, 7), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.of(new AboveRootPlacement(new SimpleStateProvider(Blocks.MOSS_CARPET.defaultBlockState()), 0.5F)), new MangroveRootPlacement(Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 8, 15, 0.2F))),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F), new AttachedToLeavesDecorator(0.14F, 1, 0, new RandomizedIntStateProvider(new SimpleStateProvider(Blocks.MANGROVE_PROPAGULE.defaultBlockState().setValue(MangrovePropaguleBlock.HANGING, true)), MangrovePropaguleBlock.AGE, UniformInt.of(0, 4)), 2, ImmutableList.of(Direction.DOWN)), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> MANGROVE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
            new UpwardsBranchingTrunkPlacer(2, 1, 4, UniformInt.of(1, 4), 0.5F, UniformInt.of(0, 1), Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
            new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
            new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
            Optional.of(new MangroveRootPlacer(UniformInt.of(1, 3), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.of(new AboveRootPlacement(new SimpleStateProvider(Blocks.MOSS_CARPET.defaultBlockState()), 0.5F)), new MangroveRootPlacement(Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 8, 15, 0.2F))),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F), new AttachedToLeavesDecorator(0.14F, 1, 0, new RandomizedIntStateProvider(new SimpleStateProvider(Blocks.MANGROVE_PROPAGULE.defaultBlockState().setValue(MangrovePropaguleBlock.HANGING, true)), MangrovePropaguleBlock.AGE, UniformInt.of(0, 4)), 2, ImmutableList.of(Direction.DOWN)))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> MANGROVE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
            new UpwardsBranchingTrunkPlacer(2, 1, 4, UniformInt.of(1, 4), 0.5F, UniformInt.of(0, 1), Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
            new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
            new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
            Optional.of(new MangroveRootPlacer(UniformInt.of(1, 3), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.of(new AboveRootPlacement(new SimpleStateProvider(Blocks.MOSS_CARPET.defaultBlockState()), 0.5F)), new MangroveRootPlacement(Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 8, 15, 0.2F))),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F), new AttachedToLeavesDecorator(0.14F, 1, 0, new RandomizedIntStateProvider(new SimpleStateProvider(Blocks.MANGROVE_PROPAGULE.defaultBlockState().setValue(MangrovePropaguleBlock.HANGING, true)), MangrovePropaguleBlock.AGE, UniformInt.of(0, 4)), 2, ImmutableList.of(Direction.DOWN)), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_TALL_MANGROVE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
            new UpwardsBranchingTrunkPlacer(3, 1, 2,UniformInt.of(1, 6), 0.5F, UniformInt.of(0, 1), Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
            new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
            new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
            Optional.of(new MangroveRootPlacer(UniformInt.of(2, 4), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.empty(), new MangroveRootPlacement(Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 5, 4, 0.2F))),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_MANGROVE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
            new UpwardsBranchingTrunkPlacer(2, 1, 0, UniformInt.of(1, 4), 0.5F, UniformInt.of(0, 1), Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
            new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
            new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
            Optional.of(new MangroveRootPlacer(UniformInt.of(1, 2), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.empty(), new MangroveRootPlacement(Registry.BLOCK.getOrCreateTag(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 5, 4, 0.2F))),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_MANGROVE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
            new StraightTrunkPlacer(1, 0, 0),
            new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

}