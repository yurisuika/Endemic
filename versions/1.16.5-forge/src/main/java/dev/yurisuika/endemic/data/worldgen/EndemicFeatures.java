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
import net.minecraft.world.level.levelgen.feature.treedecorators.BeehiveDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;

import java.util.OptionalInt;

public class EndemicFeatures {

    public static final ConfiguredFeature<TreeConfiguration, ?> SWAMP_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(3), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(5, 3, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator())).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SWAMP_OAK_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(3), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(5, 3, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator(), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> FANCY_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new FancyFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(4), 4),
            new FancyTrunkPlacer(3, 11, 0),
            new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> FANCY_OAK_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new FancyFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(4), 4),
            new FancyTrunkPlacer(3, 11, 0),
            new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 2, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> OAK_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 2, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_SWAMP_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 2, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new LeaveVineDecorator())).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_FANCY_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new FancyFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(4), 3),
            new FancyTrunkPlacer(3, 4, 0),
            new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 1, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_PINE_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0), UniformInt.of(3, 7)),
            new GiantTrunkPlacer(13, 2, 14),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_PINE_SPRUCE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0), UniformInt.of(3, 7)),
            new GiantTrunkPlacer(13, 2, 14),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0), UniformInt.of(13, 17)),
            new GiantTrunkPlacer(13, 2, 14),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_SPRUCE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0), UniformInt.of(13, 17)),
            new GiantTrunkPlacer(13, 2, 14),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> PINE_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new PineFoliagePlacer(UniformInt.fixed(1), UniformInt.fixed(1), UniformInt.of(3, 4)),
            new StraightTrunkPlacer(6, 4, 0),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> PINE_SPRUCE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new PineFoliagePlacer(UniformInt.fixed(1), UniformInt.fixed(1), UniformInt.of(3, 4)),
            new StraightTrunkPlacer(6, 4, 0),
            new TwoLayersFeatureSize(2, 0, 2))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
            new StraightTrunkPlacer(5, 2, 1),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SPRUCE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
            new StraightTrunkPlacer(5, 2, 1),
            new TwoLayersFeatureSize(2, 0, 2))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_MEGA_PINE_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0), UniformInt.of(3, 6)),
            new GiantTrunkPlacer(9, 3, 1),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_MEGA_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new MegaPineFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0), UniformInt.of(8, 9)),
            new GiantTrunkPlacer(9, 2, 0),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_PINE_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new PineFoliagePlacer(UniformInt.fixed(1), UniformInt.fixed(1), UniformInt.of(2, 3)),
            new StraightTrunkPlacer(4, 2, 0),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new SpruceFoliagePlacer(UniformInt.fixed(2), UniformInt.of(0, 1), UniformInt.fixed(1)),
            new StraightTrunkPlacer(4, 1, 0),
            new TwoLayersFeatureSize(2, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_SPRUCE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> TALL_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(5, 2, 6),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> TALL_BIRCH_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(5, 2, 6),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(5, 2, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> BIRCH_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(5, 2, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_TALL_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 1, 2),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 1, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_BIRCH = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new MegaJungleFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new MegaJungleTrunkPlacer(10, 2, 19),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator())).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_JUNGLE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new MegaJungleFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new MegaJungleTrunkPlacer(10, 2, 19),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 8, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator())).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> JUNGLE_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 8, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(), new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_MEGA_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new MegaJungleFoliagePlacer(UniformInt.fixed(1), UniformInt.fixed(0), 2),
            new MegaJungleTrunkPlacer(7, 2, 3),
            new TwoLayersFeatureSize(1, 1, 2))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator())).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
            new StraightTrunkPlacer(4, 3, 0),
            new TwoLayersFeatureSize(1, 0, 1))
            .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator())).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_JUNGLE = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> ACACIA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new AcaciaFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0)),
            new ForkingTrunkPlacer(5, 2, 2),
            new TwoLayersFeatureSize(1, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> ACACIA_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new AcaciaFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0)),
            new ForkingTrunkPlacer(5, 2, 2),
            new TwoLayersFeatureSize(1, 0, 2))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_ACACIA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new AcaciaFoliagePlacer(UniformInt.fixed(1), UniformInt.fixed(0)),
            new ForkingTrunkPlacer(3, 2, 0),
            new TwoLayersFeatureSize(1, 0, 2))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_ACACIA = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

    public static final ConfiguredFeature<TreeConfiguration, ?> DARK_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new DarkOakFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0)),
            new DarkOakTrunkPlacer(6, 2, 1),
            new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DARK_OAK_WITH_BEE_NEST = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new DarkOakFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0)),
            new DarkOakTrunkPlacer(6, 2, 1),
            new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
            .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> DWARF_DARK_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new DarkOakFoliagePlacer(UniformInt.fixed(0), UniformInt.fixed(0)),
            new DarkOakTrunkPlacer(3, 2, 1),
            new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
            .ignoreVines().build());
    public static final ConfiguredFeature<TreeConfiguration, ?> SHRUB_DARK_OAK = new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
            new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
            new BushFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 2),
            new StraightTrunkPlacer(1, 0, 0),
            new TwoLayersFeatureSize(0, 0, 0))
            .ignoreVines().build());

}