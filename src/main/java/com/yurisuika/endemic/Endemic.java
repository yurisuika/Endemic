package com.yurisuika.endemic;

import com.google.common.collect.ImmutableList;
import com.yurisuika.endemic.mixin.world.gen.trunk.TrunkPlacerTypeInvoker;
import com.yurisuika.endemic.world.gen.trunk.DeadTrunkPlacer;
import com.yurisuika.endemic.world.gen.trunk.GiantDeadTrunkPlacer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Blocks;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.treedecorator.CocoaBeansTreeDecorator;
import net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import net.minecraft.world.gen.trunk.*;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.OptionalInt;

public class Endemic implements ModInitializer {

	public static final String MOD_ID = "endemic";

	public static final Logger LOGGER = LoggerFactory.getLogger("endemic");

	public static final TrunkPlacerType<DeadTrunkPlacer> DEAD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("dead_trunk_placer", DeadTrunkPlacer.CODEC);
	public static final TrunkPlacerType<GiantDeadTrunkPlacer> GIANT_DEAD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("giant_dead_trunk_placer", GiantDeadTrunkPlacer.CODEC);

	// DEAD BUSH
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DEAD_BUSH = ConfiguredFeatures.register("dead_bush",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DEAD_BUSH.getDefaultState()),
					new DeadTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DEAD_BUSH = ConfiguredFeatures.register("giant_dead_bush",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DEAD_BUSH.getDefaultState()),
					new GiantDeadTrunkPlacer(2, 0, 0),
					new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// OAK ENDEMIC (SWAMP)
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_ENDEMIC_FULL = ConfiguredFeatures.register("oak_endemic_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(5, 3, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_ENDEMIC_LARGE = ConfiguredFeatures.register("oak_endemic_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(4, 2, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_ENDEMIC_MEDIUM = ConfiguredFeatures.register("oak_endemic_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(3, 2, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_ENDEMIC_SMALL = ConfiguredFeatures.register("oak_endemic_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(2, 1, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).build());

	// OAK NATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NATIVE_FULL = ConfiguredFeatures.register("oak_native_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(4, 2, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NATIVE_LARGE = ConfiguredFeatures.register("oak_native_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(3, 1, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NATIVE_MEDIUM = ConfiguredFeatures.register("oak_native_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(2, 1, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NATIVE_SMALL = ConfiguredFeatures.register("oak_native_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 1, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());

	// OAK NATIVE ALT (FANCY OAK)
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NATIVE_ALT_FULL = ConfiguredFeatures.register("oak_native_alt_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new LargeOakTrunkPlacer(3, 11, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
					new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NATIVE_ALT_LARGE = ConfiguredFeatures.register("oak_native_alt_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new LargeOakTrunkPlacer(3, 9, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(3), 3),
					new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NATIVE_ALT_MEDIUM = ConfiguredFeatures.register("oak_native_alt_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new LargeOakTrunkPlacer(2, 7, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(2), 2),
					new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NATIVE_ALT_SMALL = ConfiguredFeatures.register("oak_native_alt_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new LargeOakTrunkPlacer(1, 5, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(2), 2),
					new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
			)).ignoreVines().build());

	// OAK NONNATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NONNATIVE_FULL = ConfiguredFeatures.register("oak_nonnative_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NONNATIVE_LARGE = ConfiguredFeatures.register("oak_nonnative_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NONNATIVE_MEDIUM = ConfiguredFeatures.register("oak_nonnative_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> OAK_NONNATIVE_SMALL = ConfiguredFeatures.register("oak_nonnative_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// SPRUCE ENDEMIC (PINE)
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_ENDEMIC_FULL = ConfiguredFeatures.register("spruce_endemic_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(6, 4, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)),
					new TwoLayersFeatureSize(2, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_ENDEMIC_LARGE = ConfiguredFeatures.register("spruce_endemic_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(4, 3, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)),
					new TwoLayersFeatureSize(2, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_ENDEMIC_MEDIUM = ConfiguredFeatures.register("spruce_endemic_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(3, 2, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(2, 3)),
					new TwoLayersFeatureSize(2, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_ENDEMIC_SMALL = ConfiguredFeatures.register("spruce_endemic_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(2, 1, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(1, 2)),
					new TwoLayersFeatureSize(2, 0, 2)
			)).ignoreVines().build());

	// SPRUCE NATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_NATIVE_FULL = ConfiguredFeatures.register("spruce_native_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(5, 2, 1),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
					new TwoLayersFeatureSize(2, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_NATIVE_LARGE = ConfiguredFeatures.register("spruce_native_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(4, 1, 1),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
					new TwoLayersFeatureSize(2, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_NATIVE_MEDIUM = ConfiguredFeatures.register("spruce_native_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(3, 1, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new SpruceFoliagePlacer(UniformIntProvider.create(1, 2), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
					new TwoLayersFeatureSize(2, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_NATIVE_SMALL = ConfiguredFeatures.register("spruce_native_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(2, 1, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new SpruceFoliagePlacer(UniformIntProvider.create(1, 2), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
					new TwoLayersFeatureSize(2, 0, 2)
			)).ignoreVines().build());

	// SPRUCE NONNATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_NONNATIVE_FULL = ConfiguredFeatures.register("spruce_nonnative_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_NONNATIVE_LARGE = ConfiguredFeatures.register("spruce_nonnative_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_NONNATIVE_MEDIUM = ConfiguredFeatures.register("spruce_nonnative_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> SPRUCE_NONNATIVE_SMALL = ConfiguredFeatures.register("spruce_nonnative_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// BIRCH ENDEMIC (TALL BIRCH)
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_ENDEMIC_FULL = ConfiguredFeatures.register("birch_endemic_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(5, 2, 6),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_ENDEMIC_LARGE = ConfiguredFeatures.register("birch_endemic_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(4, 2, 4),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_ENDEMIC_MEDIUM = ConfiguredFeatures.register("birch_endemic_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(3, 1, 2),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_ENDEMIC_SMALL = ConfiguredFeatures.register("birch_endemic_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(2, 1, 0),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());

	// BIRCH NATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_NATIVE_FULL = ConfiguredFeatures.register("birch_native_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(5, 2, 0),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_NATIVE_LARGE = ConfiguredFeatures.register("birch_native_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(4, 1, 0),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_NATIVE_MEDIUM = ConfiguredFeatures.register("birch_native_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(3, 1, 0),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_NATIVE_SMALL = ConfiguredFeatures.register("birch_native_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(2, 1, 0),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());

	// BIRCH NONNATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_NONNATIVE_FULL = ConfiguredFeatures.register("birch_nonnative_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_NONNATIVE_LARGE = ConfiguredFeatures.register("birch_nonnative_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_NONNATIVE_MEDIUM = ConfiguredFeatures.register("birch_nonnative_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> BIRCH_NONNATIVE_SMALL = ConfiguredFeatures.register("birch_nonnative_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// JUNGLE ENDEMIC (VINED JUNGLE)
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_ENDEMIC_FULL = ConfiguredFeatures.register("jungle_endemic_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(4, 8, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_ENDEMIC_LARGE = ConfiguredFeatures.register("jungle_endemic_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(3, 6, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_ENDEMIC_MEDIUM = ConfiguredFeatures.register("jungle_endemic_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(2, 4, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_ENDEMIC_SMALL = ConfiguredFeatures.register("jungle_endemic_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 2, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());

	// JUNGLE NATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_NATIVE_FULL = ConfiguredFeatures.register("jungle_native_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(4, 8, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_NATIVE_LARGE = ConfiguredFeatures.register("jungle_native_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(3, 6, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_NATIVE_MEDIUM = ConfiguredFeatures.register("jungle_native_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(2, 4, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_NATIVE_SMALL = ConfiguredFeatures.register("jungle_native_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 2, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 0, 1)
			)).ignoreVines().build());

	// JUNGLE NONNATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_NONNATIVE_FULL = ConfiguredFeatures.register("jungle_nonnative_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_NONNATIVE_LARGE = ConfiguredFeatures.register("jungle_nonnative_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_NONNATIVE_MEDIUM = ConfiguredFeatures.register("jungle_nonnative_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> JUNGLE_NONNATIVE_SMALL = ConfiguredFeatures.register("jungle_nonnative_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// DARK OAK ENDEMIC
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_ENDEMIC_FULL = ConfiguredFeatures.register("dark_oak_endemic_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_ENDEMIC_LARGE = ConfiguredFeatures.register("dark_oak_endemic_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_ENDEMIC_MEDIUM = ConfiguredFeatures.register("dark_oak_endemic_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_ENDEMIC_SMALL = ConfiguredFeatures.register("dark_oak_endemic_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	// DARK OAK NATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_NATIVE_FULL = ConfiguredFeatures.register("dark_oak_medium_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_NATIVE_LARGE = ConfiguredFeatures.register("dark_oak_native_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_NATIVE_MEDIUM = ConfiguredFeatures.register("dark_oak_native_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_NATIVE_SMALL = ConfiguredFeatures.register("dark_oak_native_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	// DARK OAK NONNATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_NONNATIVE_FULL = ConfiguredFeatures.register("dark_oak_nonnative_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_NONNATIVE_LARGE = ConfiguredFeatures.register("dark_oak_nonnative_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_NONNATIVE_MEDIUM = ConfiguredFeatures.register("dark_oak_nonnative_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DARK_OAK_NONNATIVE_SMALL = ConfiguredFeatures.register("dark_oak_nonnative_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// ACACIA ENDEMIC
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_ENDEMIC_FULL = ConfiguredFeatures.register("acacia_endemic_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new ForkingTrunkPlacer(5, 2, 2),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
					new TwoLayersFeatureSize(1, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_ENDEMIC_LARGE = ConfiguredFeatures.register("acacia_endemic_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new ForkingTrunkPlacer(4, 2, 2),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
					new TwoLayersFeatureSize(1, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_ENDEMIC_MEDIUM = ConfiguredFeatures.register("acacia_endemic_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new ForkingTrunkPlacer(3, 1, 1),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new AcaciaFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0)),
					new TwoLayersFeatureSize(1, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_ENDEMIC_SMALL = ConfiguredFeatures.register("acacia_endemic_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new ForkingTrunkPlacer(2, 1, 1),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new AcaciaFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0)),
					new TwoLayersFeatureSize(1, 0, 2)
			)).ignoreVines().build());

	// ACACIA NATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_NATIVE_FULL = ConfiguredFeatures.register("acacia_medium_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new ForkingTrunkPlacer(5, 2, 2),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
					new TwoLayersFeatureSize(1, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_NATIVE_LARGE = ConfiguredFeatures.register("acacia_native_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new ForkingTrunkPlacer(4, 2, 2),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
					new TwoLayersFeatureSize(1, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_NATIVE_MEDIUM = ConfiguredFeatures.register("acacia_native_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new ForkingTrunkPlacer(3, 1, 1),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new AcaciaFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0)),
					new TwoLayersFeatureSize(1, 0, 2)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_NATIVE_SMALL = ConfiguredFeatures.register("acacia_native_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new ForkingTrunkPlacer(2, 1, 1),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new AcaciaFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0)),
					new TwoLayersFeatureSize(1, 0, 2)
			)).ignoreVines().build());

	// ACACIA NONNATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_NONNATIVE_FULL = ConfiguredFeatures.register("acacia_nonnative_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_NONNATIVE_LARGE = ConfiguredFeatures.register("acacia_nonnative_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_NONNATIVE_MEDIUM = ConfiguredFeatures.register("acacia_nonnative_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> ACACIA_NONNATIVE_SMALL = ConfiguredFeatures.register("acacia_nonnative_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// GIANT SPRUCE ENDEMIC (GIANT PINE)
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_ENDEMIC_FULL = ConfiguredFeatures.register("giant_spruce_endemic_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(13, 2, 14),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(3, 7)),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_ENDEMIC_LARGE = ConfiguredFeatures.register("giant_spruce_endemic_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(10, 2, 11),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(3, 5)),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_ENDEMIC_MEDIUM = ConfiguredFeatures.register("giant_spruce_endemic_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(7, 1, 8),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(2, 5)),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_ENDEMIC_SMALL = ConfiguredFeatures.register("giant_spruce_endemic_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(4, 1, 5),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(2, 3)),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());

	// GIANT SPRUCE NATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_NATIVE_FULL = ConfiguredFeatures.register("giant_spruce_native_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(13, 2, 14),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(13, 17)),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_NATIVE_LARGE = ConfiguredFeatures.register("giant_spruce_native_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(10, 2, 11),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(11, 15)),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_NATIVE_MEDIUM = ConfiguredFeatures.register("giant_spruce_native_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(7, 1, 8),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(9, 13)),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_NATIVE_SMALL = ConfiguredFeatures.register("giant_spruce_native_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(4, 1, 5),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(7, 11)),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());

	// GIANT SPRUCE NONNATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_NONNATIVE_FULL = ConfiguredFeatures.register("giant_spruce_nonnative_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_NONNATIVE_LARGE = ConfiguredFeatures.register("giant_spruce_nonnative_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_NONNATIVE_MEDIUM = ConfiguredFeatures.register("giant_spruce_nonnative_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_SPRUCE_NONNATIVE_SMALL = ConfiguredFeatures.register("giant_spruce_nonnative_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// GIANT JUNGLE ENDEMIC
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_ENDEMIC_FULL = ConfiguredFeatures.register("giant_jungle_endemic_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(10, 2, 19),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_ENDEMIC_LARGE = ConfiguredFeatures.register("giant_jungle_endemic_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(8, 2, 14),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_ENDEMIC_MEDIUM = ConfiguredFeatures.register("giant_jungle_endemic_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(6, 1, 9),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_ENDEMIC_SMALL = ConfiguredFeatures.register("giant_jungle_endemic_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(4, 1, 4),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());

	// GIANT JUNGLE NATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_NATIVE_FULL = ConfiguredFeatures.register("giant_jungle_native_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(10, 2, 19),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_NATIVE_LARGE = ConfiguredFeatures.register("giant_jungle_native_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(3, 6, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_NATIVE_MEDIUM = ConfiguredFeatures.register("giant_jungle_native_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(2, 4, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_NATIVE_SMALL = ConfiguredFeatures.register("giant_jungle_native_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(1, 2, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
					new TwoLayersFeatureSize(1, 1, 2)
			)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());

	// GIANT JUNGLE NONNATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_NONNATIVE_FULL = ConfiguredFeatures.register("giant_jungle_nonnative_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_NONNATIVE_LARGE = ConfiguredFeatures.register("giant_jungle_nonnative_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_NONNATIVE_MEDIUM = ConfiguredFeatures.register("giant_jungle_nonnative_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_JUNGLE_NONNATIVE_SMALL = ConfiguredFeatures.register("giant_jungle_nonnative_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new MegaJungleTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// GIANT_DARK_OAK ENDEMIC
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_ENDEMIC_FULL = ConfiguredFeatures.register("giant_dark_oak_endemic_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(6, 2, 1),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
					new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_ENDEMIC_LARGE = ConfiguredFeatures.register("giant_dark_oak_endemic_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(4, 2, 1),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
					new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_ENDEMIC_MEDIUM = ConfiguredFeatures.register("giant_dark_oak_endemic_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(3, 1, 1),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
					new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_ENDEMIC_SMALL = ConfiguredFeatures.register("giant_dark_oak_endemic_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(2, 1, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
					new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
			)).ignoreVines().build());

	// GIANT_DARK_OAK NATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_NATIVE_FULL = ConfiguredFeatures.register("giant_dark_oak_native_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(6, 2, 1),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
					new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_NATIVE_LARGE = ConfiguredFeatures.register("giant_dark_oak_native_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(4, 2, 1),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
					new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_NATIVE_MEDIUM = ConfiguredFeatures.register("giant_dark_oak_native_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(3, 1, 1),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
					new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_NATIVE_SMALL = ConfiguredFeatures.register("giant_dark_oak_native_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(2, 1, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
					new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
			)).ignoreVines().build());

	// GIANT_DARK_OAK NONNATIVE
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_NONNATIVE_FULL = ConfiguredFeatures.register("giant_dark_oak_nonnative_full",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_NONNATIVE_LARGE = ConfiguredFeatures.register("giant_dark_oak_nonnative_large",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_NONNATIVE_MEDIUM = ConfiguredFeatures.register("giant_dark_oak_nonnative_medium",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());
	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> GIANT_DARK_OAK_NONNATIVE_SMALL = ConfiguredFeatures.register("giant_dark_oak_nonnative_small",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new DarkOakTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	public static final TagKey<Biome> OAK_NONNATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "oak_nonnative"));
	public static final TagKey<Biome> OAK_NATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "oak_native"));
	public static final TagKey<Biome> OAK_ENDEMIC = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "oak_endemic"));

	public static final TagKey<Biome> SPRUCE_NONNATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "spruce_nonnative"));
	public static final TagKey<Biome> SPRUCE_NATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "spruce_native"));
	public static final TagKey<Biome> SPRUCE_ENDEMIC = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "spruce_endemic"));

	public static final TagKey<Biome> BIRCH_NONNATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "birch_nonnative"));
	public static final TagKey<Biome> BIRCH_NATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "birch_native"));
	public static final TagKey<Biome> BIRCH_ENDEMIC = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "birch_endemic"));

	public static final TagKey<Biome> JUNGLE_NONNATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "jungle_nonnative"));
	public static final TagKey<Biome> JUNGLE_NATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "jungle_native"));
	public static final TagKey<Biome> JUNGLE_ENDEMIC = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "jungle_endemic"));

	public static final TagKey<Biome> DARK_OAK_NONNATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "dark_oak_nonnative"));
	public static final TagKey<Biome> DARK_OAK_NATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "dark_oak_native"));
	public static final TagKey<Biome> DARK_OAK_ENDEMIC = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "dark_oak_endemic"));

	public static final TagKey<Biome> ACACIA_NONNATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "acacia_nonnative"));
	public static final TagKey<Biome> ACACIA_NATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "acacia_native"));
	public static final TagKey<Biome> ACACIA_ENDEMIC = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "acacia_endemic"));

	public static final TagKey<Biome> GIANT_SPRUCE_NONNATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "giant_spruce_nonnative"));
	public static final TagKey<Biome> GIANT_SPRUCE_NATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "giant_spruce_native"));
	public static final TagKey<Biome> GIANT_SPRUCE_ENDEMIC = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "giant_spruce_endemic"));

	public static final TagKey<Biome> GIANT_JUNGLE_NONNATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "giant_jungle_nonnative"));
	public static final TagKey<Biome> GIANT_JUNGLE_NATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "giant_jungle_native"));
	public static final TagKey<Biome> GIANT_JUNGLE_ENDEMIC = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "giant_jungle_endemic"));

	public static final TagKey<Biome> GIANT_DARK_OAK_NONNATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "giant_dark_oak_nonnative"));
	public static final TagKey<Biome> GIANT_DARK_OAK_NATIVE = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "giant_dark_oak_native"));
	public static final TagKey<Biome> GIANT_DARK_OAK_ENDEMIC = TagKey.of(Registry.BIOME_KEY, new Identifier("endemic", "giant_dark_oak_endemic"));

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Endemic!");
	}

}