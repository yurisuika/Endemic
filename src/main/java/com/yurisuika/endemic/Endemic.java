package com.yurisuika.endemic;

import com.yurisuika.endemic.mixin.world.gen.trunk.TrunkPlacerTypeInvoker;
import com.yurisuika.endemic.world.gen.trunk.DeadTrunkPlacer;
import com.yurisuika.endemic.world.gen.trunk.GiantDeadTrunkPlacer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.BushFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Endemic implements ModInitializer {

	public static final String MOD_ID = "endemic";

	public static final Logger LOGGER = LogManager.getLogger("Endemic");

	public static final TrunkPlacerType<DeadTrunkPlacer> DEAD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("dead_trunk_placer", DeadTrunkPlacer.CODEC);
	public static final TrunkPlacerType<GiantDeadTrunkPlacer> GIANT_DEAD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("giant_dead_trunk_placer", GiantDeadTrunkPlacer.CODEC);

	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DEAD_BUSH = ConfiguredFeatures.register("dead_bush",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DEAD_BUSH.getDefaultState()),
					new DeadTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> DEAD_MEGA_BUSH = ConfiguredFeatures.register("dead_mega_bush",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DEAD_BUSH.getDefaultState()),
					new GiantDeadTrunkPlacer(2, 0, 0),
					new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());


	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> STUNTED_OAK = ConfiguredFeatures.register("stunted_oak",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 1),
					new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> STUNTED_SPRUCE = ConfiguredFeatures.register("stunted_spruce",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 1),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> STUNTED_BIRCH = ConfiguredFeatures.register("stunted_birch",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 1),
					new SimpleBlockStateProvider(Blocks.BIRCH_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> STUNTED_JUNGLE = ConfiguredFeatures.register("stunted_jungle",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 1),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> STUNTED_ACACIA = ConfiguredFeatures.register("stunted_acacia",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 1),
					new SimpleBlockStateProvider(Blocks.ACACIA_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> STUNTED_DARK_OAK = ConfiguredFeatures.register("stunted_dark_oak",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new StraightTrunkPlacer(1, 0, 1),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> STUNTED_MEGA_SPRUCE = ConfiguredFeatures.register("stunted_mega_spruce",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()),
					new GiantTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> STUNTED_MEGA_JUNGLE = ConfiguredFeatures.register("stunted_mega_jungle",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
					new GiantTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.JUNGLE_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	public static final RegistryEntry<? extends ConfiguredFeature<TreeFeatureConfig, ?>> STUNTED_MEGA_DARK_OAK = ConfiguredFeatures.register("stunted_mega_dark_oak",
			Feature.TREE, (new TreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()),
					new GiantTrunkPlacer(1, 0, 0),
					new SimpleBlockStateProvider(Blocks.DARK_OAK_LEAVES.getDefaultState()),
					new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),
					new TwoLayersFeatureSize(0, 0, 0)
			)).ignoreVines().build());

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Endemic!");

		EndemicConfig.init(MOD_ID, EndemicConfig.class);
	}

}