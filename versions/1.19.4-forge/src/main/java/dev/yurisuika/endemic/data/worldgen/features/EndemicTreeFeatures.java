package dev.yurisuika.endemic.data.worldgen.features;

import com.google.common.collect.ImmutableList;
import dev.yurisuika.endemic.Endemic;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.rootplacers.MangroveRootPlacement;
import net.minecraft.world.level.levelgen.feature.rootplacers.MangroveRootPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;

import java.util.Optional;
import java.util.OptionalInt;

public class EndemicTreeFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_SWAMP_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_swamp_oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_FANCY_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_fancy_oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_MEGA_PINE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_mega_pine"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_MEGA_SPRUCE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_mega_spruce"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_PINE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_pine"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_SPRUCE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_spruce"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_SUPER_BIRCH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_super_birch"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_BIRCH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_birch"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_MEGA_JUNGLE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_mega_jungle"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_JUNGLE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_jungle"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_ACACIA = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_acacia"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_DARK_OAK = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_dark_oak"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_TALL_MANGROVE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_tall_mangrove"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_MANGROVE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_mangrove"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_CHERRY = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_cherry"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> STUNTED_AZALEA = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "stunted_azalea"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_SHRUB = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "oak_shrub"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRUCE_SHRUB = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "spruce_shrub"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIRCH_SHRUB = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "birch_shrub"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNGLE_SHRUB = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "jungle_shrub"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> ACACIA_SHRUB = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "acacia_shrub"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DARK_OAK_SHRUB = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "dark_oak_shrub"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGROVE_SHRUB = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "mangrove_shrub"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHERRY_SHRUB = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "cherry_shrub"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> AZALEA_SHRUB = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Endemic.MOD_ID, "azalea_shrub"));

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        context.register(STUNTED_SWAMP_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 2, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new LeaveVineDecorator(0.25F))).ignoreVines().build()));
        context.register(STUNTED_FANCY_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new FancyTrunkPlacer(3, 4, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 3),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))
                .ignoreVines().build()));
        context.register(STUNTED_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 1, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(STUNTED_MEGA_PINE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new GiantTrunkPlacer(9, 3, 1),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 6)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build()));
        context.register(STUNTED_MEGA_SPRUCE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new GiantTrunkPlacer(9, 2, 0),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(8, 9)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(new SimpleStateProvider(Blocks.PODZOL.defaultBlockState())))).ignoreVines().build()));
        context.register(STUNTED_PINE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 2, 0),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(2, 3)),
                new TwoLayersFeatureSize(2, 0, 2))
                .ignoreVines().build()));
        context.register(STUNTED_SPRUCE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 1, 0),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new SpruceFoliagePlacer(ConstantInt.of(2), UniformInt.of(0, 1), ConstantInt.of(1)),
                new TwoLayersFeatureSize(2, 0, 2))
                .ignoreVines().build()));
        context.register(STUNTED_SUPER_BIRCH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 1, 2),
                new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(STUNTED_BIRCH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 1, 0),
                new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(STUNTED_MEGA_JUNGLE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                new MegaJungleTrunkPlacer(7, 2, 3),
                new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
                new MegaJungleFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(1, 1, 2))
                .ignoreVines().build()));
        context.register(STUNTED_JUNGLE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(4, 3, 0),
                new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(STUNTED_ACACIA, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
                new ForkingTrunkPlacer(3, 2, 0),
                new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
                new AcaciaFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 2))
                .ignoreVines().build()));
        context.register(STUNTED_DARK_OAK, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
                new DarkOakTrunkPlacer(3, 2, 1),
                new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
                new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
                .ignoreVines().build()));
        context.register(STUNTED_TALL_MANGROVE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
                new UpwardsBranchingTrunkPlacer(3, 1, 2, UniformInt.of(1, 6), 0.5F, UniformInt.of(0, 1), context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
                Optional.of(new MangroveRootPlacer(UniformInt.of(2, 4), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.empty(), new MangroveRootPlacement(context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 5, 4, 0.2F))),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(STUNTED_MANGROVE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
                new UpwardsBranchingTrunkPlacer(2, 1, 0, UniformInt.of(1, 4), 0.5F, UniformInt.of(0, 1), context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 70),
                Optional.of(new MangroveRootPlacer(UniformInt.of(1, 2), new SimpleStateProvider(Blocks.MANGROVE_ROOTS.defaultBlockState()), Optional.empty(), new MangroveRootPlacement(context.lookup(Registries.BLOCK).getOrThrow(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), HolderSet.direct(Block::builtInRegistryHolder, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), new SimpleStateProvider(Blocks.MUDDY_MANGROVE_ROOTS.defaultBlockState()), 5, 4, 0.2F))),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines().build()));
        context.register(STUNTED_CHERRY, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.CHERRY_LOG.defaultBlockState()),
                new CherryTrunkPlacer(4, 2, 0, new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(ConstantInt.of(1), 1).add(ConstantInt.of(2), 1).build()), UniformInt.of(2, 3), UniformInt.of(-3, -2), UniformInt.of(-1, 0)),
                new SimpleStateProvider(Blocks.CHERRY_LEAVES.defaultBlockState()),
                new CherryFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2))
                .ignoreVines().build()));
        context.register(STUNTED_AZALEA, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new BendingTrunkPlacer(1, 1, 0, 1, ConstantInt.of(1)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1).build()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(new SimpleStateProvider(Blocks.ROOTED_DIRT.defaultBlockState())).forceDirt().ignoreVines().build()));
        context.register(OAK_SHRUB, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));
        context.register(SPRUCE_SHRUB, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));
        context.register(BIRCH_SHRUB, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));
        context.register(JUNGLE_SHRUB, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));
        context.register(ACACIA_SHRUB, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));
        context.register(DARK_OAK_SHRUB, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));
        context.register(MANGROVE_SHRUB, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));
        context.register(CHERRY_SHRUB, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.CHERRY_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.CHERRY_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));
        context.register(AZALEA_SHRUB, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1).build()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .ignoreVines().build()));
    }

}