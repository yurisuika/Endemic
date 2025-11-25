package dev.yurisuika.endemic.world.level.block.grower;

import dev.yurisuika.endemic.mixin.minecraft.world.level.BiomeAccessor;
import dev.yurisuika.endemic.mixin.minecraft.world.level.BiomeInvoker;
import dev.yurisuika.endemic.util.Configure;
import dev.yurisuika.endemic.util.LightSource;
import dev.yurisuika.endemic.util.Locate;
import dev.yurisuika.endemic.world.level.Group;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.*;

public class WeightedTreeGrower {

    public static boolean growTree(ServerLevel level, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, RandomSource random) {
        List<Group.Entry> entries = filterEntries(level, pos, state);
        Collections.shuffle(entries);

        List<Group.Entry> multiSaplingsEntries = filterSaplingsEntries(entries, true);
        List<Group.Entry> multiSaplingsFlowersEntries = filterFlowersEntries(multiSaplingsEntries, hasFlowers(level, pos));
        multiSaplingsEntries = multiSaplingsFlowersEntries.isEmpty() ? multiSaplingsEntries : multiSaplingsFlowersEntries;

        ResourceKey<ConfiguredFeature<?, ?>> multiSaplingResourceKey = selectWeightedEntry(multiSaplingsEntries, random);
        if (multiSaplingResourceKey != null) {
            Holder<ConfiguredFeature<?, ?>> multiSaplingHolder = level.registryAccess().lookupOrThrow(Registries.CONFIGURED_FEATURE).get(multiSaplingResourceKey).orElse(null);
            if (multiSaplingHolder != null) {
                for (int i = 0; i >= -1; --i) {
                    for (int j = 0; j >= -1; --j) {
                        if (isTwoByTwoSapling(state, level, pos, i, j)) {
                            ConfiguredFeature<?, ?> multiSaplingConfiguredFeature = multiSaplingHolder.value();
                            BlockState multiSaplingBlockState = Blocks.AIR.defaultBlockState();
                            level.setBlock(pos.offset(i, 0, j), multiSaplingBlockState, 260);
                            level.setBlock(pos.offset(i + 1, 0, j), multiSaplingBlockState, 260);
                            level.setBlock(pos.offset(i, 0, j + 1), multiSaplingBlockState, 260);
                            level.setBlock(pos.offset(i + 1, 0, j + 1), multiSaplingBlockState, 260);
                            if (multiSaplingConfiguredFeature.place(level, chunkGenerator, random, pos.offset(i, 0, j))) {
                                return true;
                            }

                            level.setBlock(pos.offset(i, 0, j), state, 260);
                            level.setBlock(pos.offset(i + 1, 0, j), state, 260);
                            level.setBlock(pos.offset(i, 0, j + 1), state, 260);
                            level.setBlock(pos.offset(i + 1, 0, j + 1), state, 260);
                            return false;
                        }
                    }
                }
            }
        }

        List<Group.Entry> singleSaplingsEntries = filterSaplingsEntries(entries, false);
        List<Group.Entry> singleSaplingsFlowersEntries = filterFlowersEntries(singleSaplingsEntries, hasFlowers(level, pos));
        singleSaplingsEntries = singleSaplingsFlowersEntries.isEmpty() ? singleSaplingsEntries : singleSaplingsFlowersEntries;

        ResourceKey<ConfiguredFeature<?, ?>> singleSaplingResourceKey = selectWeightedEntry(singleSaplingsEntries, random);
        if (singleSaplingResourceKey == null) {
            return false;
        } else {
            Holder<ConfiguredFeature<?, ?>> singleSaplingHolder = level.registryAccess().lookupOrThrow(Registries.CONFIGURED_FEATURE).get(singleSaplingResourceKey).orElse(null);
            if (singleSaplingHolder == null) {
                return false;
            } else {
                ConfiguredFeature<?, ?> singleSaplingConfiguredFeature = singleSaplingHolder.value();
                BlockState singleSaplingBlockState = level.getFluidState(pos).createLegacyBlock();
                level.setBlock(pos, singleSaplingBlockState, 260);
                if (singleSaplingConfiguredFeature.place(level, chunkGenerator, random, pos)) {
                    if (level.getBlockState(pos) == singleSaplingBlockState) {
                        level.sendBlockUpdated(pos, state, singleSaplingBlockState, 2);
                    }
                    return true;
                } else {
                    level.setBlock(pos, state, 260);
                    return false;
                }
            }
        }
    }

    public static boolean isTwoByTwoSapling(BlockState state, BlockGetter level, BlockPos pos, int xOffset, int yOffset) {
        Block block = state.getBlock();
        return level.getBlockState(pos.offset(xOffset, 0, yOffset)).is(block) && level.getBlockState(pos.offset(xOffset + 1, 0, yOffset)).is(block) && level.getBlockState(pos.offset(xOffset, 0, yOffset + 1)).is(block) && level.getBlockState(pos.offset(xOffset + 1, 0, yOffset + 1)).is(block);
    }

    public static boolean hasFlowers(LevelAccessor level, BlockPos pos) {
        for (BlockPos blockPos : BlockPos.MutableBlockPos.betweenClosed(pos.below().north(2).west(2), pos.above().south(2).east(2))) {
            if (level.getBlockState(blockPos).is(BlockTags.FLOWERS)) {
                return true;
            }
        }
        return false;
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> selectWeightedEntry(List<Group.Entry> entries, RandomSource random) {
        if (entries.isEmpty()) {
            return null;
        }

        float totalWeight = 0.0F;
        for (Group.Entry entry : entries) {
            totalWeight += entry.getWeight();
        }
        float randomWeight = random.nextFloat() * totalWeight;

        ResourceKey<ConfiguredFeature<?, ?>> selected = null;
        for (Group.Entry entry : entries) {
            if (randomWeight < entry.getWeight()) {
                selected = ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.tryParse(entry.getFeature()));
                break;
            } else {
                randomWeight -= entry.getWeight();
            }
        }
        return selected;
    }

    public static List<Group.Entry> filterSaplingsEntries(List<Group.Entry> entries, boolean saplings) {
        List<Group.Entry> filteredEntries = new ArrayList<>();
        for (Group.Entry entry : entries) {
            if (saplings && entry.getNeighbors().getSaplings()) {
                filteredEntries.add(entry);
            } else if (!saplings && !entry.getNeighbors().getSaplings()) {
                filteredEntries.add(entry);
            }
        }
        return filteredEntries;
    }

    public static List<Group.Entry> filterFlowersEntries(List<Group.Entry> entries, boolean flowers) {
        List<Group.Entry> filteredEntries = new ArrayList<>();
        for (Group.Entry entry : entries) {
            if (flowers && entry.getNeighbors().getFlowers()) {
                filteredEntries.add(entry);
            } else if (!flowers && !entry.getNeighbors().getFlowers()) {
                filteredEntries.add(entry);
            }
        }
        return filteredEntries;
    }

    public static List<Group.Entry> filterEntries(ServerLevel level, BlockPos pos, BlockState state) {
        String dimension = level.dimension().identifier().toString();
        String biome = level.getBiome(pos).unwrap().map(key -> key.identifier().toString(), value -> "");
        int elevation = pos.getY();
        int brightness = Configure.getLightSource().equals(LightSource.RAW) ? level.getRawBrightness(pos, 0) : level.getBrightness(Configure.getLightSource().equals(LightSource.SKY) ? LightLayer.SKY : LightLayer.BLOCK, pos);
        double temperature = ((BiomeInvoker) (Object) level.getBiome(pos).value()).invokeGetTemperature(pos, level.getSeaLevel());
        double downfall = ((BiomeAccessor) (Object) level.getBiome(pos).value()).getClimateSettings().downfall();

        List<Group.Entry> entries = new ArrayList<>();
        Arrays.asList(Locate.getGroupsForSapling(state)).forEach(group -> {
            if (!group.getRegion().getDimensions().getBlacklist().contains(dimension)) {
                if (group.getRegion().getDimensions().getWhitelist().isEmpty() || group.getRegion().getDimensions().getWhitelist().contains(dimension)) {
                    if (!group.getRegion().getBiomes().getBlacklist().contains(biome)) {
                        if (group.getRegion().getBiomes().getWhitelist().isEmpty() || group.getRegion().getBiomes().getWhitelist().contains(biome)) {
                            Group.Conditions.Location.Elevation elevationConditions = group.getConditions().getLocation().getElevation();
                            Group.Conditions.Location.Brightness brightnessConditions = group.getConditions().getLocation().getBrightness();
                            Group.Conditions.Climate.Temperature temperatureConditions = group.getConditions().getClimate().getTemperature();
                            Group.Conditions.Climate.Downfall downfallConditions = group.getConditions().getClimate().getDownfall();

                            double elevationModifier = calculateModifier(elevation, elevationConditions.getOptimum().getMin(), elevationConditions.getOptimum().getMax(), elevationConditions.getTolerance().getMin(), elevationConditions.getTolerance().getMax());
                            double brightnessModifier = calculateModifier(brightness, brightnessConditions.getOptimum().getMin(), brightnessConditions.getOptimum().getMax(), brightnessConditions.getTolerance().getMin(), brightnessConditions.getTolerance().getMax());
                            double temperatureModifier = calculateModifier(temperature, temperatureConditions.getOptimum().getMin(), temperatureConditions.getOptimum().getMax(), temperatureConditions.getTolerance().getMin(), temperatureConditions.getTolerance().getMax());
                            double downfallModifier = calculateModifier(downfall, downfallConditions.getOptimum().getMin(), downfallConditions.getOptimum().getMax(), downfallConditions.getTolerance().getMin(), downfallConditions.getTolerance().getMax());

                            double modifier = elevationModifier * brightnessModifier * temperatureModifier * downfallModifier;

                            for (Group.Entry entry : group.getEntries()) {
                                double modifiedWeight = entry.getWeight() * group.getWeight() * modifier;
                                if (modifiedWeight > 0.0D) {
                                    entries.add(new Group.Entry(entry.getFeature(), modifiedWeight, entry.getNeighbors()));
                                }
                            }
                        }
                    }
                }
            }
        });
        entries.sort(Comparator.comparing(Group.Entry::getWeight).reversed());
        return entries;
    }

    public static double calculateModifier(double value, double optimalMin, double optimalMax, double toleranceMin, double toleranceMax) {
        if (toleranceMin <= toleranceMax && optimalMin <= optimalMax) {
            if (toleranceMin <= optimalMin && toleranceMax >= optimalMax) {
                if (value >= optimalMin && value <= optimalMax) {
                    return 1.0D;
                } else if (value < optimalMin) {
                    if (toleranceMin < optimalMin && value > toleranceMin) {
                        double x = Math.abs((value - toleranceMin) / (optimalMin - toleranceMin));
                        return Math.abs(Configure.getTransition().transition(x));
                    }
                } else if (value > optimalMax) {
                    if (toleranceMax > optimalMax && value < toleranceMax) {
                        double x = Math.abs((value - toleranceMax) / (toleranceMax - optimalMax));
                        return Math.abs(Configure.getTransition().transition(x));
                    }
                }
            }
        }
        return 0.0D;
    }

}