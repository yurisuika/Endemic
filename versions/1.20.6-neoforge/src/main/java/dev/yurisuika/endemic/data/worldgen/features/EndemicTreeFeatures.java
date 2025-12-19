package dev.yurisuika.endemic.data.worldgen.features;

import com.google.common.collect.ImmutableList;
import dev.yurisuika.endemic.Endemic;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
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

public class EndemicTreeFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> SWAMP_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "swamp_oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SWAMP_OAK_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "swamp_oak_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "fancy_oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_OAK_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "fancy_oak_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "oak_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_SWAMP_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_swamp_oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_FANCY_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_fancy_oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHRUB_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "shrub_oak"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> MEGA_PINE_SPRUCE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "mega_pine_spruce"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEGA_PINE_SPRUCE_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "mega_pine_spruce_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEGA_SPRUCE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "mega_spruce"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEGA_SPRUCE_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "mega_spruce_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_SPRUCE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "pine_spruce"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_SPRUCE_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "pine_spruce_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRUCE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "spruce"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRUCE_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "spruce_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_MEGA_PINE_SPRUCE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_mega_pine_spruce"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_MEGA_SPRUCE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_mega_spruce"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_PINE_SPRUCE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_pine_spruce"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_SPRUCE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_spruce"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHRUB_SPRUCE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "shrub_spruce"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BIRCH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "tall_birch"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BIRCH_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "tall_birch_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIRCH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "birch"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIRCH_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "birch_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_TALL_BIRCH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_tall_birch"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_BIRCH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_birch"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHRUB_BIRCH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "shrub_birch"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> MEGA_JUNGLE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "mega_jungle"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEGA_JUNGLE_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "mega_jungle_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNGLE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "jungle"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNGLE_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "jungle_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_MEGA_JUNGLE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_mega_jungle"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_JUNGLE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_jungle"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHRUB_JUNGLE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "shrub_jungle"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> ACACIA = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "acacia"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> ACACIA_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "acacia_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_ACACIA = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_acacia"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHRUB_ACACIA = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "shrub_acacia"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> DARK_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dark_oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DARK_OAK_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dark_oak_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_DARK_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_dark_oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHRUB_DARK_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "shrub_dark_oak"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> AZALEA = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "azalea"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> AZALEA_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "azalea_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_AZALEA = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_azalea"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHRUB_AZALEA = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "shrub_azalea"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_MANGROVE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "tall_mangrove"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_MANGROVE_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "tall_mangrove_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGROVE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "mangrove"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGROVE_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "mangrove_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_TALL_MANGROVE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_tall_mangrove"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_MANGROVE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_mangrove"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHRUB_MANGROVE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "shrub_mangrove"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> CHERRY = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "cherry"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHERRY_WITH_BEE_NEST = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "cherry_with_bee_nest"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DWARF_CHERRY = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dwarf_cherry"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHRUB_CHERRY = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "shrub_cherry"));

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        context.register(SWAMP_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(5, 3, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new LeaveVineDecorator(0.25F))).ignoreVines().build()));
        context.register(SWAMP_OAK_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(5, 3, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new LeaveVineDecorator(0.25F), new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(FANCY_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new FancyTrunkPlacer(3, 11, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
                .ignoreVines().build()));
        context.register(FANCY_OAK_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new FancyTrunkPlacer(3, 11, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
                .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 2, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(OAK_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 2, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(DWARF_SWAMP_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 2, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new LeaveVineDecorator(0.25F))).ignoreVines().build()));
        context.register(DWARF_FANCY_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new FancyTrunkPlacer(3, 4, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 3),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
                .ignoreVines().build()));
        context.register(DWARF_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 1, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(SHRUB_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));

        context.register(MEGA_PINE_SPRUCE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new GiantTrunkPlacer(13, 2, 14),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 7)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build()));
        context.register(MEGA_PINE_SPRUCE_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new GiantTrunkPlacer(13, 2, 14),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 7)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())), new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(MEGA_SPRUCE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new GiantTrunkPlacer(13, 2, 14),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build()));
        context.register(MEGA_SPRUCE_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new GiantTrunkPlacer(13, 2, 14),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())), new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(PINE_SPRUCE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(6, 4, 0),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(3, 4)),
                new TwoLayersFeatureSize(2, 0, 2))
                .ignoreVines().build()));
        context.register(PINE_SPRUCE_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(6, 4, 0),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(3, 4)),
                new TwoLayersFeatureSize(2, 0, 2))
                .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(SPRUCE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(5, 2, 1),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
                new TwoLayersFeatureSize(2, 0, 2))
                .ignoreVines().build()));
        context.register(SPRUCE_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(5, 2, 1),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
                new TwoLayersFeatureSize(2, 0, 2))
                .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(DWARF_MEGA_PINE_SPRUCE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new GiantTrunkPlacer(9, 3, 1),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 6)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build()));
        context.register(DWARF_MEGA_SPRUCE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new GiantTrunkPlacer(9, 2, 0),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(8, 9)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build()));
        context.register(DWARF_PINE_SPRUCE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 2, 0),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(2, 3)),
                new TwoLayersFeatureSize(2, 0, 2))
                .ignoreVines().build()));
        context.register(DWARF_SPRUCE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 1, 0),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new SpruceFoliagePlacer(ConstantInt.of(2), UniformInt.of(0, 1), ConstantInt.of(1)),
                new TwoLayersFeatureSize(2, 0, 2))
                .ignoreVines().build()));
        context.register(SHRUB_SPRUCE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));

        context.register(TALL_BIRCH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
                new StraightTrunkPlacer(5, 2, 6),
                new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(TALL_BIRCH_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
                new StraightTrunkPlacer(5, 2, 6),
                new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(BIRCH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
                new StraightTrunkPlacer(5, 2, 0),
                new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(BIRCH_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
                new StraightTrunkPlacer(5, 2, 0),
                new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(DWARF_TALL_BIRCH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 1, 2),
                new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(DWARF_BIRCH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 1, 0),
                new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(SHRUB_BIRCH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));

        context.register(MEGA_JUNGLE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                new MegaJungleTrunkPlacer(10, 2, 19),
                new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
                new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F))).ignoreVines().build()));
        context.register(MEGA_JUNGLE_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                new MegaJungleTrunkPlacer(10, 2, 19),
                new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
                new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F), new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(JUNGLE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 8, 0),
                new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F))).ignoreVines().build()));
        context.register(JUNGLE_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 8, 0),
                new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F), new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(DWARF_MEGA_JUNGLE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                new MegaJungleTrunkPlacer(7, 2, 3),
                new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
                new MegaJungleFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F))).ignoreVines().build()));
        context.register(DWARF_JUNGLE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 3, 0),
                new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new TrunkVineDecorator(), new LeaveVineDecorator(0.25F))).ignoreVines().build()));
        context.register(SHRUB_JUNGLE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));

        context.register(ACACIA, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
                new ForkingTrunkPlacer(5, 2, 2),
                new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 2))
                .ignoreVines().build()));
        context.register(ACACIA_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
                new ForkingTrunkPlacer(5, 2, 2),
                new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 2))
                .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(DWARF_ACACIA, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
                new ForkingTrunkPlacer(3, 2, 0),
                new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
                new AcaciaFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 2))
                .ignoreVines().build()));
        context.register(SHRUB_ACACIA, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));

        context.register(DARK_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
                new DarkOakTrunkPlacer(6, 2, 1),
                new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
                new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
                .ignoreVines().build()));
        context.register(DARK_OAK_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
                new DarkOakTrunkPlacer(6, 2, 1),
                new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
                new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
                .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(DWARF_DARK_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
                new DarkOakTrunkPlacer(3, 2, 1),
                new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
                new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
                .ignoreVines().build()));
        context.register(SHRUB_DARK_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));

        context.register(AZALEA, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1).build()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(new SimpleStateProvider(Blocks.ROOTED_DIRT.defaultBlockState())).forceDirt().ignoreVines().build()));
        context.register(AZALEA_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1).build()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).dirt(new SimpleStateProvider(Blocks.ROOTED_DIRT.defaultBlockState())).forceDirt().ignoreVines().build()));
        context.register(DWARF_AZALEA, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new BendingTrunkPlacer(1, 1, 0, 1, ConstantInt.of(1)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1).build()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(new SimpleStateProvider(Blocks.ROOTED_DIRT.defaultBlockState())).forceDirt().ignoreVines().build()));
        context.register(SHRUB_AZALEA, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1).build()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));

        context.register(TALL_MANGROVE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
                new UpwardsBranchingTrunkPlacer(4, 1, 9, UniformInt.of(1, 6), 0.5F, UniformInt.of(0, 1), context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
                Optional.of(new MangroveRootPlacer(UniformInt.of(3, 7), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.of(new AboveRootPlacement(new SimpleStateProvider(Blocks.MOSS_CARPET.defaultBlockState()), 0.5F)), new MangroveRootPlacement(context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 8, 15, 0.2F))),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F), new AttachedToLeavesDecorator(0.14F, 1, 0, new RandomizedIntStateProvider(new SimpleStateProvider(Blocks.MANGROVE_PROPAGULE.defaultBlockState().setValue(MangrovePropaguleBlock.HANGING, true)), MangrovePropaguleBlock.AGE, UniformInt.of(0, 4)), 2, ImmutableList.of(Direction.DOWN)))).ignoreVines().build()));
        context.register(TALL_MANGROVE_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
                new UpwardsBranchingTrunkPlacer(4, 1, 9, UniformInt.of(1, 6), 0.5F, UniformInt.of(0, 1), context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
                Optional.of(new MangroveRootPlacer(UniformInt.of(3, 7), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.of(new AboveRootPlacement(new SimpleStateProvider(Blocks.MOSS_CARPET.defaultBlockState()), 0.5F)), new MangroveRootPlacement(context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 8, 15, 0.2F))),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F), new AttachedToLeavesDecorator(0.14F, 1, 0, new RandomizedIntStateProvider(new SimpleStateProvider(Blocks.MANGROVE_PROPAGULE.defaultBlockState().setValue(MangrovePropaguleBlock.HANGING, true)), MangrovePropaguleBlock.AGE, UniformInt.of(0, 4)), 2, ImmutableList.of(Direction.DOWN)), new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(MANGROVE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
                new UpwardsBranchingTrunkPlacer(2, 1, 4, UniformInt.of(1, 4), 0.5F, UniformInt.of(0, 1), context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
                Optional.of(new MangroveRootPlacer(UniformInt.of(1, 3), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.of(new AboveRootPlacement(new SimpleStateProvider(Blocks.MOSS_CARPET.defaultBlockState()), 0.5F)), new MangroveRootPlacement(context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 8, 15, 0.2F))),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F), new AttachedToLeavesDecorator(0.14F, 1, 0, new RandomizedIntStateProvider(new SimpleStateProvider(Blocks.MANGROVE_PROPAGULE.defaultBlockState().setValue(MangrovePropaguleBlock.HANGING, true)), MangrovePropaguleBlock.AGE, UniformInt.of(0, 4)), 2, ImmutableList.of(Direction.DOWN)))).ignoreVines().build()));
        context.register(MANGROVE_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
                new UpwardsBranchingTrunkPlacer(2, 1, 4, UniformInt.of(1, 4), 0.5F, UniformInt.of(0, 1), context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
                Optional.of(new MangroveRootPlacer(UniformInt.of(1, 3), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.of(new AboveRootPlacement(new SimpleStateProvider(Blocks.MOSS_CARPET.defaultBlockState()), 0.5F)), new MangroveRootPlacement(context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 8, 15, 0.2F))),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F), new AttachedToLeavesDecorator(0.14F, 1, 0, new RandomizedIntStateProvider(new SimpleStateProvider(Blocks.MANGROVE_PROPAGULE.defaultBlockState().setValue(MangrovePropaguleBlock.HANGING, true)), MangrovePropaguleBlock.AGE, UniformInt.of(0, 4)), 2, ImmutableList.of(Direction.DOWN)), new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(DWARF_TALL_MANGROVE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
                new UpwardsBranchingTrunkPlacer(3, 1, 2, UniformInt.of(1, 6), 0.5F, UniformInt.of(0, 1), context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
                Optional.of(new MangroveRootPlacer(UniformInt.of(2, 4), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.empty(), new MangroveRootPlacement(context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 5, 4, 0.2F))),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F))).ignoreVines().build()));
        context.register(DWARF_MANGROVE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
                new UpwardsBranchingTrunkPlacer(2, 1, 0, UniformInt.of(1, 4), 0.5F, UniformInt.of(0, 1), context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
                Optional.of(new MangroveRootPlacer(UniformInt.of(1, 2), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.empty(), new MangroveRootPlacement(context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 5, 4, 0.2F))),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new LeaveVineDecorator(0.125F))).ignoreVines().build()));
        context.register(SHRUB_MANGROVE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));

        context.register(CHERRY, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.CHERRY_LOG.defaultBlockState()),
                new CherryTrunkPlacer(7, 1, 0, new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(ConstantInt.of(1), 1).add(ConstantInt.of(2), 1).add(ConstantInt.of(3), 1).build()), UniformInt.of(2, 4), UniformInt.of(-4, -3), UniformInt.of(-1, 0)),
                new SimpleStateProvider(Blocks.CHERRY_LEAVES.defaultBlockState()),
                new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2))
                .ignoreVines().build()));
        context.register(CHERRY_WITH_BEE_NEST, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.CHERRY_LOG.defaultBlockState()),
                new CherryTrunkPlacer(7, 1, 0, new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(ConstantInt.of(1), 1).add(ConstantInt.of(2), 1).add(ConstantInt.of(3), 1).build()), UniformInt.of(2, 4), UniformInt.of(-4, -3), UniformInt.of(-1, 0)),
                new SimpleStateProvider(Blocks.CHERRY_LEAVES.defaultBlockState()),
                new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2))
                .decorators(ImmutableList.of(new BeehiveDecorator(1.0F))).ignoreVines().build()));
        context.register(DWARF_CHERRY, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.CHERRY_LOG.defaultBlockState()),
                new CherryTrunkPlacer(4, 2, 0, new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(ConstantInt.of(1), 1).add(ConstantInt.of(2), 1).build()), UniformInt.of(2, 3), UniformInt.of(-3, -2), UniformInt.of(-1, 0)),
                new SimpleStateProvider(Blocks.CHERRY_LEAVES.defaultBlockState()),
                new CherryFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2))
                .ignoreVines().build()));
        context.register(SHRUB_CHERRY, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.CHERRY_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.CHERRY_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));
    }

}