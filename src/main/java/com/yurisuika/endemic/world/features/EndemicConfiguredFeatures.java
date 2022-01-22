package com.yurisuika.endemic.world.features;

import com.yurisuika.endemic.Endemic;
import com.yurisuika.endemic.world.gen.trunk.DeadTrunkPlacer;
import com.yurisuika.endemic.world.gen.trunk.GiantDeadTrunkPlacer;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.BushFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class EndemicConfiguredFeatures {

    public static final ConfiguredFeature<TreeFeatureConfig, ?> DEAD_BUSH = register("dead_bush",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.DEAD_BUSH.getDefaultState()),
                    new DeadTrunkPlacer(1, 0, 0),
                    new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0),
                    new TwoLayersFeatureSize(0, 0, 0)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> DEAD_MEGA_BUSH = register("dead_mega_bush",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.DEAD_BUSH.getDefaultState()),
                    new GiantDeadTrunkPlacer(2, 0, 0),
                    new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0),
                    new TwoLayersFeatureSize(0, 0, 0)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> STUNTED_OAK = register("stunted_oak",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                    new StraightTrunkPlacer(1, 0, 1),
                    new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                    new TwoLayersFeatureSize(0, 0, 0)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> STUNTED_SPRUCE = register("stunted_spruce",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
                    new StraightTrunkPlacer(1, 0, 1),
                    new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                    new TwoLayersFeatureSize(0, 0, 0)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> STUNTED_BIRCH = register("stunted_birch",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
                    new StraightTrunkPlacer(1, 0, 1),
                    new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                    new TwoLayersFeatureSize(0, 0, 0)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> STUNTED_JUNGLE = register("stunted_jungle",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
                    new StraightTrunkPlacer(1, 0, 1),
                    new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                    new TwoLayersFeatureSize(0, 0, 0)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> STUNTED_ACACIA = register("stunted_acacia",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
                    new StraightTrunkPlacer(1, 0, 1),
                    new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                    new TwoLayersFeatureSize(0, 0, 0)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> STUNTED_DARK_OAK = register("stunted_dark_oak",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
                    new StraightTrunkPlacer(1, 0, 1),
                    new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                    new TwoLayersFeatureSize(0, 0, 0)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> STUNTED_MEGA_SPRUCE = register("stunted_mega_spruce",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
                    new GiantTrunkPlacer(1, 0, 0),
                    new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
                    new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                    new TwoLayersFeatureSize(0, 0, 0)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> STUNTED_MEGA_JUNGLE = register("stunted_mega_jungle",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
                    new GiantTrunkPlacer(1, 0, 0),
                    new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
                    new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                    new TwoLayersFeatureSize(0, 0, 0)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> STUNTED_MEGA_DARK_OAK = register("stunted_mega_dark_oak",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
                    new GiantTrunkPlacer(1, 0, 0),
                    new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
                    new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
                    new TwoLayersFeatureSize(0, 0, 0)
            ).ignoreVines().build()));

    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Endemic.MOD_ID, name));
    }

    private static ConfiguredFeature<TreeFeatureConfig, ?> register(String name,
                                                                    ConfiguredFeature<TreeFeatureConfig, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Endemic.MOD_ID, name),
                configuredFeature);
    }

    private static ConfiguredFeature<?, ?> register(ConfiguredFeature<?, ?> configuredFeature,
                                                    RegistryKey<ConfiguredFeature<?, ?>> key) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), configuredFeature);
    }

}
