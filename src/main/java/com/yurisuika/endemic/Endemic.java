package com.yurisuika.endemic;

import com.google.common.collect.ImmutableList;
import com.yurisuika.endemic.mixin.world.gen.trunk.TrunkPlacerTypeInvoker;
import com.yurisuika.endemic.world.gen.trunk.DeadTrunkPlacer;
import com.yurisuika.endemic.world.gen.trunk.GiantDeadTrunkPlacer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
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
import net.minecraft.world.gen.treedecorator.*;
import net.minecraft.world.gen.trunk.*;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.OptionalInt;

public class Endemic implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("endemic");

	public static final TrunkPlacerType<DeadTrunkPlacer> DEAD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("dead_trunk_placer", DeadTrunkPlacer.CODEC);
	public static final TrunkPlacerType<GiantDeadTrunkPlacer> GIANT_DEAD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("giant_dead_trunk_placer", GiantDeadTrunkPlacer.CODEC);

	public static final RegistryKey<ConfiguredFeature<?, ?>> DEAD_BUSH = ConfiguredFeatures.of("dead_bush");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DEAD_BUSH = ConfiguredFeatures.of("giant_dead_bush");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_ENDEMIC_FULL = ConfiguredFeatures.of("oak_endemic_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_ENDEMIC_LARGE = ConfiguredFeatures.of("oak_endemic_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_ENDEMIC_MEDIUM = ConfiguredFeatures.of("oak_endemic_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_ENDEMIC_SMALL = ConfiguredFeatures.of("oak_endemic_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NATIVE_FULL_BEES = ConfiguredFeatures.of("oak_native_full_bees");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NATIVE_FULL = ConfiguredFeatures.of("oak_native_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NATIVE_LARGE = ConfiguredFeatures.of("oak_native_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NATIVE_MEDIUM = ConfiguredFeatures.of("oak_native_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NATIVE_SMALL = ConfiguredFeatures.of("oak_native_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NATIVE_FULL_ALT_BEES = ConfiguredFeatures.of("oak_native_alt_full_bees");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NATIVE_FULL_ALT = ConfiguredFeatures.of("oak_native_alt_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NATIVE_LARGE_ALT = ConfiguredFeatures.of("oak_native_alt_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NATIVE_MEDIUM_ALT = ConfiguredFeatures.of("oak_native_alt_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NATIVE_SMALL_ALT = ConfiguredFeatures.of("oak_native_alt_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NONNATIVE_FULL = ConfiguredFeatures.of("oak_nonnative_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NONNATIVE_LARGE = ConfiguredFeatures.of("oak_nonnative_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NONNATIVE_MEDIUM = ConfiguredFeatures.of("oak_nonnative_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NONNATIVE_SMALL = ConfiguredFeatures.of("oak_nonnative_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_ENDEMIC_FULL = ConfiguredFeatures.of("spruce_endemic_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_ENDEMIC_LARGE = ConfiguredFeatures.of("spruce_endemic_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_ENDEMIC_MEDIUM = ConfiguredFeatures.of("spruce_endemic_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_ENDEMIC_SMALL = ConfiguredFeatures.of("spruce_endemic_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_NATIVE_FULL = ConfiguredFeatures.of("spruce_native_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_NATIVE_LARGE = ConfiguredFeatures.of("spruce_native_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_NATIVE_MEDIUM = ConfiguredFeatures.of("spruce_native_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_NATIVE_SMALL = ConfiguredFeatures.of("spruce_native_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_NONNATIVE_FULL = ConfiguredFeatures.of("spruce_nonnative_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_NONNATIVE_LARGE = ConfiguredFeatures.of("spruce_nonnative_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_NONNATIVE_MEDIUM = ConfiguredFeatures.of("spruce_nonnative_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_NONNATIVE_SMALL = ConfiguredFeatures.of("spruce_nonnative_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_ENDEMIC_FULL_BEES = ConfiguredFeatures.of("birch_endemic_full_bees");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_ENDEMIC_FULL = ConfiguredFeatures.of("birch_endemic_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_ENDEMIC_LARGE = ConfiguredFeatures.of("birch_endemic_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_ENDEMIC_MEDIUM = ConfiguredFeatures.of("birch_endemic_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_ENDEMIC_SMALL = ConfiguredFeatures.of("birch_endemic_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_NATIVE_FULL_BEES = ConfiguredFeatures.of("birch_native_full_bees");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_NATIVE_FULL = ConfiguredFeatures.of("birch_native_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_NATIVE_LARGE = ConfiguredFeatures.of("birch_native_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_NATIVE_MEDIUM = ConfiguredFeatures.of("birch_native_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_NATIVE_SMALL = ConfiguredFeatures.of("birch_native_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_NONNATIVE_FULL = ConfiguredFeatures.of("birch_nonnative_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_NONNATIVE_LARGE = ConfiguredFeatures.of("birch_nonnative_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_NONNATIVE_MEDIUM = ConfiguredFeatures.of("birch_nonnative_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_NONNATIVE_SMALL = ConfiguredFeatures.of("birch_nonnative_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_ENDEMIC_FULL = ConfiguredFeatures.of("jungle_endemic_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_ENDEMIC_LARGE = ConfiguredFeatures.of("jungle_endemic_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_ENDEMIC_MEDIUM = ConfiguredFeatures.of("jungle_endemic_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_ENDEMIC_SMALL = ConfiguredFeatures.of("jungle_endemic_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_NATIVE_FULL = ConfiguredFeatures.of("jungle_native_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_NATIVE_LARGE = ConfiguredFeatures.of("jungle_native_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_NATIVE_MEDIUM = ConfiguredFeatures.of("jungle_native_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_NATIVE_SMALL = ConfiguredFeatures.of("jungle_native_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_NONNATIVE_FULL = ConfiguredFeatures.of("jungle_nonnative_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_NONNATIVE_LARGE = ConfiguredFeatures.of("jungle_nonnative_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_NONNATIVE_MEDIUM = ConfiguredFeatures.of("jungle_nonnative_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_NONNATIVE_SMALL = ConfiguredFeatures.of("jungle_nonnative_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_ENDEMIC_FULL = ConfiguredFeatures.of("acacia_endemic_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_ENDEMIC_LARGE = ConfiguredFeatures.of("acacia_endemic_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_ENDEMIC_MEDIUM = ConfiguredFeatures.of("acacia_endemic_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_ENDEMIC_SMALL = ConfiguredFeatures.of("acacia_endemic_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_NATIVE_FULL = ConfiguredFeatures.of("acacia_medium_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_NATIVE_LARGE = ConfiguredFeatures.of("acacia_native_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_NATIVE_MEDIUM = ConfiguredFeatures.of("acacia_native_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_NATIVE_SMALL = ConfiguredFeatures.of("acacia_native_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_NONNATIVE_FULL = ConfiguredFeatures.of("acacia_nonnative_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_NONNATIVE_LARGE = ConfiguredFeatures.of("acacia_nonnative_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_NONNATIVE_MEDIUM = ConfiguredFeatures.of("acacia_nonnative_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_NONNATIVE_SMALL = ConfiguredFeatures.of("acacia_nonnative_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_ENDEMIC_FULL = ConfiguredFeatures.of("dark_oak_endemic_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_ENDEMIC_LARGE = ConfiguredFeatures.of("dark_oak_endemic_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_ENDEMIC_MEDIUM = ConfiguredFeatures.of("dark_oak_endemic_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_ENDEMIC_SMALL = ConfiguredFeatures.of("dark_oak_endemic_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_NATIVE_FULL = ConfiguredFeatures.of("dark_oak_medium_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_NATIVE_LARGE = ConfiguredFeatures.of("dark_oak_native_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_NATIVE_MEDIUM = ConfiguredFeatures.of("dark_oak_native_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_NATIVE_SMALL = ConfiguredFeatures.of("dark_oak_native_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_NONNATIVE_FULL = ConfiguredFeatures.of("dark_oak_nonnative_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_NONNATIVE_LARGE = ConfiguredFeatures.of("dark_oak_nonnative_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_NONNATIVE_MEDIUM = ConfiguredFeatures.of("dark_oak_nonnative_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_NONNATIVE_SMALL = ConfiguredFeatures.of("dark_oak_nonnative_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_ENDEMIC_FULL = ConfiguredFeatures.of("giant_spruce_endemic_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_ENDEMIC_LARGE = ConfiguredFeatures.of("giant_spruce_endemic_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_ENDEMIC_MEDIUM = ConfiguredFeatures.of("giant_spruce_endemic_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_ENDEMIC_SMALL = ConfiguredFeatures.of("giant_spruce_endemic_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_NATIVE_FULL = ConfiguredFeatures.of("giant_spruce_native_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_NATIVE_LARGE = ConfiguredFeatures.of("giant_spruce_native_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_NATIVE_MEDIUM = ConfiguredFeatures.of("giant_spruce_native_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_NATIVE_SMALL = ConfiguredFeatures.of("giant_spruce_native_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_NONNATIVE_FULL = ConfiguredFeatures.of("giant_spruce_nonnative_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_NONNATIVE_LARGE = ConfiguredFeatures.of("giant_spruce_nonnative_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_NONNATIVE_MEDIUM = ConfiguredFeatures.of("giant_spruce_nonnative_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_SPRUCE_NONNATIVE_SMALL = ConfiguredFeatures.of("giant_spruce_nonative_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_ENDEMIC_FULL = ConfiguredFeatures.of("giant_jungle_endemic_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_ENDEMIC_LARGE = ConfiguredFeatures.of("giant_jungle_endemic_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_ENDEMIC_MEDIUM = ConfiguredFeatures.of("giant_jungle_endemic_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_ENDEMIC_SMALL = ConfiguredFeatures.of("giant_jungle_endemic_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_NATIVE_FULL = ConfiguredFeatures.of("giant_jungle_native_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_NATIVE_LARGE = ConfiguredFeatures.of("giant_jungle_native_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_NATIVE_MEDIUM = ConfiguredFeatures.of("giant_jungle_native_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_NATIVE_SMALL = ConfiguredFeatures.of("giant_jungle_native_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_NONNATIVE_FULL = ConfiguredFeatures.of("giant_jungle_nonnative_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_NONNATIVE_LARGE = ConfiguredFeatures.of("giant_jungle_nonnative_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_NONNATIVE_MEDIUM = ConfiguredFeatures.of("giant_jungle_nonnative_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_JUNGLE_NONNATIVE_SMALL = ConfiguredFeatures.of("giant_jungle_nonnative_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_ENDEMIC_FULL = ConfiguredFeatures.of("giant_dark_oak_endemic_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_ENDEMIC_LARGE = ConfiguredFeatures.of("giant_dark_oak_endemic_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_ENDEMIC_MEDIUM = ConfiguredFeatures.of("giant_dark_oak_endemic_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_ENDEMIC_SMALL = ConfiguredFeatures.of("giant_dark_oak_endemic_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_NATIVE_FULL = ConfiguredFeatures.of("giant_dark_oak_native_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_NATIVE_LARGE = ConfiguredFeatures.of("giant_dark_oak_native_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_NATIVE_MEDIUM = ConfiguredFeatures.of("giant_dark_oak_native_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_NATIVE_SMALL = ConfiguredFeatures.of("giant_dark_oak_native_small");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_NONNATIVE_FULL = ConfiguredFeatures.of("giant_dark_oak_nonnative_full");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_NONNATIVE_LARGE = ConfiguredFeatures.of("giant_dark_oak_nonnative_large");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_NONNATIVE_MEDIUM = ConfiguredFeatures.of("giant_dark_oak_nonnative_medium");
	public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_DARK_OAK_NONNATIVE_SMALL = ConfiguredFeatures.of("giant_dark_oak_nonnative_small");

	public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
		RegistryEntryLookup<Block> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.BLOCK);

		// DEAD BUSH
		ConfiguredFeatures.register(featureRegisterable, DEAD_BUSH,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DEAD_BUSH.getDefaultState()),
						new DeadTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_DEAD_BUSH,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DEAD_BUSH.getDefaultState()),
						new GiantDeadTrunkPlacer(2, 0, 0),
						new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// OAK ENDEMIC (SWAMP)
		ConfiguredFeatures.register(featureRegisterable, OAK_ENDEMIC_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(5, 3, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).build());
		ConfiguredFeatures.register(featureRegisterable, OAK_ENDEMIC_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(4, 2, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).build());
		ConfiguredFeatures.register(featureRegisterable, OAK_ENDEMIC_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(3, 2, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).build());
		ConfiguredFeatures.register(featureRegisterable, OAK_ENDEMIC_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(2, 1, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).build());

		// OAK NATIVE (OAK)
		ConfiguredFeatures.register(featureRegisterable, OAK_NATIVE_FULL_BEES,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(4, 2, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).decorators(ImmutableList.of(new BeehiveTreeDecorator(0.05F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, OAK_NATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(4, 2, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, OAK_NATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(3, 1, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, OAK_NATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(2, 1, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, OAK_NATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 1, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());

		// OAK NATIVE ALT (FANCY OAK)
		ConfiguredFeatures.register(featureRegisterable, OAK_NATIVE_FULL_ALT_BEES,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new LargeOakTrunkPlacer(3, 11, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
						new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
				)).decorators(ImmutableList.of(new BeehiveTreeDecorator(0.05F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, OAK_NATIVE_FULL_ALT,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new LargeOakTrunkPlacer(3, 11, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
						new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, OAK_NATIVE_LARGE_ALT,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new LargeOakTrunkPlacer(3, 9, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 3),
						new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, OAK_NATIVE_MEDIUM_ALT,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new LargeOakTrunkPlacer(2, 7, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(3), 3),
						new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, OAK_NATIVE_SMALL_ALT,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new LargeOakTrunkPlacer(2, 5, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(3), 2),
						new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
				)).ignoreVines().build());

		// OAK NONNATIVE;
		ConfiguredFeatures.register(featureRegisterable, OAK_NONNATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, OAK_NONNATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, OAK_NONNATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, OAK_NONNATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// SPRUCE ENDEMIC (SPRUCE)
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_ENDEMIC_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(5, 2, 1),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
						new TwoLayersFeatureSize(2, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_ENDEMIC_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(4, 1, 1),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
						new TwoLayersFeatureSize(2, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_ENDEMIC_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(3, 1, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new SpruceFoliagePlacer(UniformIntProvider.create(1, 2), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
						new TwoLayersFeatureSize(2, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_ENDEMIC_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(2, 1, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new SpruceFoliagePlacer(UniformIntProvider.create(1, 2), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
						new TwoLayersFeatureSize(2, 0, 2)
				)).ignoreVines().build());

		// SPRUCE NATIVE (PINE)
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_NATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(6, 4, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)),
						new TwoLayersFeatureSize(2, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_NATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(4, 3, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)),
						new TwoLayersFeatureSize(2, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_NATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(3, 2, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(2, 3)),
						new TwoLayersFeatureSize(2, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_NATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(2, 1, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(1, 2)),
						new TwoLayersFeatureSize(2, 0, 2)
				)).ignoreVines().build());

		// SPRUCE NONNATIVE
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_NONNATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_NONNATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_NONNATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, SPRUCE_NONNATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// BIRCH ENDEMIC (TALL BIRCH)
		ConfiguredFeatures.register(featureRegisterable, BIRCH_ENDEMIC_FULL_BEES,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(5, 2, 6),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, BIRCH_ENDEMIC_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(5, 2, 6),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, BIRCH_ENDEMIC_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(4, 2, 4),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, BIRCH_ENDEMIC_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(3, 1, 2),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, BIRCH_ENDEMIC_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(2, 1, 0),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());

		// BIRCH NATIVE
		ConfiguredFeatures.register(featureRegisterable, BIRCH_NATIVE_FULL_BEES,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(5, 2, 0),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).decorators(ImmutableList.of(new BeehiveTreeDecorator(0.05F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, BIRCH_NATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(5, 2, 0),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, BIRCH_NATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(4, 1, 0),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, BIRCH_NATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(3, 1, 0),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, BIRCH_NATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(2, 1, 0),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());

		// BIRCH NONNATIVE
		ConfiguredFeatures.register(featureRegisterable, BIRCH_NONNATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, BIRCH_NONNATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, BIRCH_NONNATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, BIRCH_NONNATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// JUNGLE ENDEMIC (VINED JUNGLE)
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_ENDEMIC_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(4, 8, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_ENDEMIC_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(3, 6, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_ENDEMIC_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(2, 4, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_ENDEMIC_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 2, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());

		// JUNGLE NATIVE
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_NATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(4, 8, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_NATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(3, 6, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_NATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(2, 4, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_NATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 2, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 0, 1)
				)).ignoreVines().build());

		// JUNGLE NONNATIVE
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_NONNATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_NONNATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_NONNATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, JUNGLE_NONNATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// ACACIA ENDEMIC
		ConfiguredFeatures.register(featureRegisterable, ACACIA_ENDEMIC_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new ForkingTrunkPlacer(5, 2, 2),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
						new TwoLayersFeatureSize(1, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, ACACIA_ENDEMIC_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new ForkingTrunkPlacer(4, 2, 2),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
						new TwoLayersFeatureSize(1, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, ACACIA_ENDEMIC_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new ForkingTrunkPlacer(3, 1, 1),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new AcaciaFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0)),
						new TwoLayersFeatureSize(1, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, ACACIA_ENDEMIC_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new ForkingTrunkPlacer(2, 1, 1),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new AcaciaFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0)),
						new TwoLayersFeatureSize(1, 0, 2)
				)).ignoreVines().build());

		// ACACIA NATIVE
		ConfiguredFeatures.register(featureRegisterable, ACACIA_NATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new ForkingTrunkPlacer(5, 2, 2),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
						new TwoLayersFeatureSize(1, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, ACACIA_NATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new ForkingTrunkPlacer(4, 2, 2),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
						new TwoLayersFeatureSize(1, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, ACACIA_NATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new ForkingTrunkPlacer(3, 1, 1),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new AcaciaFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0)),
						new TwoLayersFeatureSize(1, 0, 2)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, ACACIA_NATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new ForkingTrunkPlacer(2, 1, 1),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new AcaciaFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0)),
						new TwoLayersFeatureSize(1, 0, 2)
				)).ignoreVines().build());

		// ACACIA NONNATIVE
		ConfiguredFeatures.register(featureRegisterable, ACACIA_NONNATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, ACACIA_NONNATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, ACACIA_NONNATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, ACACIA_NONNATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// DARK OAK ENDEMIC
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_ENDEMIC_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_ENDEMIC_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_ENDEMIC_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_ENDEMIC_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());

		// DARK OAK NATIVE
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_NATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_NATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_NATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_NATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());

		// DARK OAK NONNATIVE
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_NONNATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_NONNATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_NONNATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, DARK_OAK_NONNATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new StraightTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// GIANT SPRUCE ENDEMIC (GIANT SPRUCE)
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_ENDEMIC_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(13, 2, 14),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(13, 17)),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_ENDEMIC_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(10, 2, 11),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(11, 15)),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_ENDEMIC_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(7, 1, 8),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(9, 13)),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_ENDEMIC_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(4, 1, 5),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(7, 11)),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());

		// GIANT SPRUCE NATIVE (GIANT PINE)
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_NATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(13, 2, 14),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(3, 7)),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_NATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(10, 2, 11),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(3, 5)),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_NATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(7, 1, 8),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(2, 5)),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_NATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(4, 1, 5),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(2, 3)),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());

		// GIANT SPRUCE NONNATIVE
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_NONNATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_NONNATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_NONNATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_SPRUCE_NONNATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
						new GiantTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).ignoreVines().build());

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// GIANT JUNGLE ENDEMIC
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_ENDEMIC_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(10, 2, 19),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_ENDEMIC_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(8, 2, 14),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_ENDEMIC_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(6, 1, 9),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_ENDEMIC_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(4, 1, 4),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());

		// GIANT JUNGLE NATIVE
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_NATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(10, 2, 19),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_NATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(3, 6, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_NATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(2, 4, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_NATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(1, 2, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
						new TwoLayersFeatureSize(1, 1, 2)
				)).decorators(ImmutableList.of(new CocoaBeansTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());

		// GIANT JUNGLE NONNATIVE
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_NONNATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_NONNATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_NONNATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_JUNGLE_NONNATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
						new MegaJungleTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).ignoreVines().build());

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// GIANT_DARK_OAK ENDEMIC
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_ENDEMIC_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(6, 2, 1),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
						new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_ENDEMIC_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(4, 2, 1),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
						new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_ENDEMIC_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(3, 1, 1),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
						new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_ENDEMIC_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(2, 1, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
						new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
				)).ignoreVines().build());

		// GIANT_DARK_OAK NATIVE
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_NATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(6, 2, 1),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
						new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_NATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(4, 2, 1),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
						new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_NATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(3, 1, 1),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
						new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_NATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(2, 1, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
						new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
				)).ignoreVines().build());

		// GIANT_DARK_OAK NONNATIVE
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_NONNATIVE_FULL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_NONNATIVE_LARGE,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_NONNATIVE_MEDIUM,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
		ConfiguredFeatures.register(featureRegisterable, GIANT_DARK_OAK_NONNATIVE_SMALL,
				Feature.TREE, (new TreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
						new DarkOakTrunkPlacer(1, 0, 0),
						new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
						new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
						new TwoLayersFeatureSize(0, 0, 0)
				)).ignoreVines().build());
	}

	public static final TagKey<Biome> OAK_NONNATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "oak_nonnative"));
	public static final TagKey<Biome> OAK_NATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "oak_native"));
	public static final TagKey<Biome> OAK_ENDEMIC = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "oak_endemic"));

	public static final TagKey<Biome> SPRUCE_NONNATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "spruce_nonnative"));
	public static final TagKey<Biome> SPRUCE_NATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "spruce_native"));
	public static final TagKey<Biome> SPRUCE_ENDEMIC = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "spruce_endemic"));

	public static final TagKey<Biome> BIRCH_NONNATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "birch_nonnative"));
	public static final TagKey<Biome> BIRCH_NATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "birch_native"));
	public static final TagKey<Biome> BIRCH_ENDEMIC = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "birch_endemic"));

	public static final TagKey<Biome> JUNGLE_NONNATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "jungle_nonnative"));
	public static final TagKey<Biome> JUNGLE_NATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "jungle_native"));
	public static final TagKey<Biome> JUNGLE_ENDEMIC = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "jungle_endemic"));

	public static final TagKey<Biome> ACACIA_NONNATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "acacia_nonnative"));
	public static final TagKey<Biome> ACACIA_NATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "acacia_native"));
	public static final TagKey<Biome> ACACIA_ENDEMIC = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "acacia_endemic"));

	public static final TagKey<Biome> DARK_OAK_NONNATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "dark_oak_nonnative"));
	public static final TagKey<Biome> DARK_OAK_NATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "dark_oak_native"));
	public static final TagKey<Biome> DARK_OAK_ENDEMIC = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "dark_oak_endemic"));

	public static final TagKey<Biome> GIANT_SPRUCE_NONNATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "giant_spruce_nonnative"));
	public static final TagKey<Biome> GIANT_SPRUCE_NATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "giant_spruce_native"));
	public static final TagKey<Biome> GIANT_SPRUCE_ENDEMIC = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "giant_spruce_endemic"));

	public static final TagKey<Biome> GIANT_JUNGLE_NONNATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "giant_jungle_nonnative"));
	public static final TagKey<Biome> GIANT_JUNGLE_NATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "giant_jungle_native"));
	public static final TagKey<Biome> GIANT_JUNGLE_ENDEMIC = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "giant_jungle_endemic"));

	public static final TagKey<Biome> GIANT_DARK_OAK_NONNATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "giant_dark_oak_nonnative"));
	public static final TagKey<Biome> GIANT_DARK_OAK_NATIVE = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "giant_dark_oak_native"));
	public static final TagKey<Biome> GIANT_DARK_OAK_ENDEMIC = TagKey.of(RegistryKeys.BIOME, new Identifier("endemic", "giant_dark_oak_endemic"));

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Endemic!");
	}

}