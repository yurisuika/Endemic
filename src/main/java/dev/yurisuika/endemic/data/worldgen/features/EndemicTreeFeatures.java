package dev.yurisuika.endemic.data.worldgen.features;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
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

    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_BUSH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "oak_bush"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRUCE_BUSH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "spruce_bush"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIRCH_BUSH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "birch_bush"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNGLE_BUSH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "jungle_bush"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> ACACIA_BUSH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "acacia_bush"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DARK_OAK_BUSH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "dark_oak_bush"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGROVE_BUSH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "mangrove_bush"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> AZALEA_BUSH = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("endemic", "azalea_bush"));

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        context.register(OAK_BUSH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)).build()));
        context.register(SPRUCE_BUSH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.SPRUCE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.SPRUCE_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)).build()));
        context.register(BIRCH_BUSH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.BIRCH_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)).build()));
        context.register(JUNGLE_BUSH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.JUNGLE_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)).build()));
        context.register(ACACIA_BUSH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.ACACIA_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.ACACIA_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)).build()));
        context.register(DARK_OAK_BUSH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.DARK_OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.DARK_OAK_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)).build()));
        context.register(MANGROVE_BUSH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.MANGROVE_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new SimpleStateProvider(Blocks.MANGROVE_LEAVES.defaultBlockState()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)).build()));
        context.register(AZALEA_BUSH, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState> builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)).build()));
    }

}