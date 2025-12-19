package dev.yurisuika.endemic.world.level.block.grower;

import dev.yurisuika.endemic.mixin.minecraft.world.level.BiomeInvoker;
import dev.yurisuika.endemic.util.Locate;
import dev.yurisuika.endemic.world.level.sapling.group.Group;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeightedTreeGrower {

    public static boolean growTree(ServerLevel level, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, RandomSource random) {
        List<Group.Entry> entries = filterEntries(level, pos, state);
        Collections.shuffle(entries);

        List<Group.Entry> multiSaplingsEntries = filterSaplingsEntries(entries, true);
        multiSaplingsEntries = filterFlowersEntries(multiSaplingsEntries, hasFlowers(level, pos));

        Holder<ConfiguredFeature<?, ?>> multiSaplingHolder = selectWeightedEntry(multiSaplingsEntries, random);
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

        List<Group.Entry> singleSaplingsEntries = filterSaplingsEntries(entries, false);
        singleSaplingsEntries = filterFlowersEntries(singleSaplingsEntries, hasFlowers(level, pos));

        Holder<ConfiguredFeature<?, ?>> singleSaplingHolder = selectWeightedEntry(singleSaplingsEntries, random);
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

    public static Holder<ConfiguredFeature<?, ?>> selectWeightedEntry(List<Group.Entry> entries, RandomSource random) {
        if (entries.isEmpty()) {
            return null;
        }

        double totalWeight = 0.0D;
        for (Group.Entry entry : entries) {
            totalWeight += entry.weight();
        }
        double randomWeight = random.nextDouble() * totalWeight;

        Holder<ConfiguredFeature<?, ?>> selected = null;
        for (Group.Entry entry : entries) {
            if (randomWeight < entry.weight()) {
                selected = BuiltinRegistries.CONFIGURED_FEATURE.getHolderOrThrow(ResourceKey.create(BuiltinRegistries.CONFIGURED_FEATURE.key(), entry.feature()));
                break;
            } else {
                randomWeight -= entry.weight();
            }
        }
        return selected;
    }

    public static List<Group.Entry> filterSaplingsEntries(List<Group.Entry> entries, boolean saplings) {
        List<Group.Entry> filteredEntries = new ArrayList<>();
        for (Group.Entry entry : entries) {
            if (saplings && entry.surroundings().requiresAdjacentSaplings()) {
                filteredEntries.add(entry);
            } else if (!saplings && !entry.surroundings().requiresAdjacentSaplings()) {
                filteredEntries.add(entry);
            }
        }
        return filteredEntries;
    }

    public static List<Group.Entry> filterFlowersEntries(List<Group.Entry> entries, boolean flowers) {
        for (Group.Entry entry : entries) {
            if (!flowers && entry.surroundings().requiresFlowersNearby()) {
                entries.remove(entry);
            }
        }
        return entries;
    }

    public static List<Group.Entry> filterEntries(ServerLevel level, BlockPos pos, BlockState state) {
        ResourceLocation dimension = level.dimension().location();
        ResourceLocation biome = level.getBiome(pos).unwrap().orThrow().location();
        int elevation = pos.getY();
        int brightness = level.getRawBrightness(pos, 0);
        float temperature = ((BiomeInvoker) (Object) level.getBiome(pos).value()).invokeGetTemperature(pos);
        float downfall = level.getBiome(pos).value().getDownfall();

        List<Group.Entry> entries = new ArrayList<>();
        Locate.getSapling(level, state).groups().forEach(group -> {
            if (group.region().dimensions().blacklist().isEmpty() || !group.region().dimensions().blacklist().contains(dimension)) {
                if (group.region().dimensions().whitelist().isEmpty() || group.region().dimensions().whitelist().contains(dimension)) {
                    if (group.region().biomes().blacklist().isEmpty() || !group.region().biomes().blacklist().contains(biome)) {
                        if (group.region().biomes().whitelist().isEmpty() || group.region().biomes().whitelist().contains(biome)) {
                            Group.Conditions.Location.Elevation elevationConditions = group.conditions().location().elevation();
                            Group.Conditions.Location.Brightness brightnessConditions = group.conditions().location().brightness();
                            Group.Conditions.Climate.Temperature temperatureConditions = group.conditions().climate().temperature();
                            Group.Conditions.Climate.Downfall downfallConditions = group.conditions().climate().downfall();

                            double elevationModifier = calculateModifier(elevation, elevationConditions.optimum().min(), elevationConditions.optimum().max(), elevationConditions.tolerance().min(), elevationConditions.tolerance().max());
                            double brightnessModifier = calculateModifier(brightness, brightnessConditions.optimum().min(), brightnessConditions.optimum().max(), brightnessConditions.tolerance().min(), brightnessConditions.tolerance().max());
                            double temperatureModifier = calculateModifier(temperature, temperatureConditions.optimum().min(), temperatureConditions.optimum().max(), temperatureConditions.tolerance().min(), temperatureConditions.tolerance().max());
                            double downfallModifier = calculateModifier(downfall, downfallConditions.optimum().min(), downfallConditions.optimum().max(), downfallConditions.tolerance().min(), downfallConditions.tolerance().max());

                            double modifier = elevationModifier * brightnessModifier * temperatureModifier * downfallModifier;

                            for (Group.Entry entry : group.entries()) {
                                double modifiedWeight = entry.weight() * group.weight() * modifier;
                                if (modifiedWeight > 0.0D) {
                                    entries.add(new Group.Entry(modifiedWeight, entry.feature(), entry.surroundings()));
                                }
                            }
                        }
                    }
                }
            }
        });
        entries.sort(Comparator.comparing(Group.Entry::weight).reversed());
        return entries;
    }

    public static double calculateModifier(double value, double optimalMin, double optimalMax, double toleranceMin, double toleranceMax) {
        if (toleranceMin <= toleranceMax && optimalMin <= optimalMax) {
            if (toleranceMin <= optimalMin && toleranceMax >= optimalMax) {
                if (value >= optimalMin && value <= optimalMax) {
                    return 1.0D;
                } else if (value < optimalMin) {
                    if (toleranceMin < optimalMin && value > toleranceMin) {
                        double d = Math.abs((value - toleranceMin) / (optimalMin - toleranceMin));
                        return Math.abs(ease(d));
                    }
                } else if (value > optimalMax) {
                    if (toleranceMax > optimalMax && value < toleranceMax) {
                        double d = Math.abs((value - toleranceMax) / (toleranceMax - optimalMax));
                        return Math.abs(ease(d));
                    }
                }
            }
        }
        return 0.0D;
    }

    public static double ease(double d) {
        return 1.0D - Math.sqrt(1.0D - Math.pow(d, 2.0D));
    }

}