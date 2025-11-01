package dev.yurisuika.endemic.world.level.block.grower;

import dev.yurisuika.endemic.util.Locate;
import dev.yurisuika.endemic.world.level.Seed;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
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

    public static boolean growTree(ServerLevel level, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random random) {
        List<Seed.Entry> entries = getPassingGroupsEntries(level, pos, state);
        Collections.shuffle(entries);

        List<Seed.Entry> multiSaplingsEntries = filterSaplingsEntries(entries, true);
        List<Seed.Entry> multiSaplingsFlowersEntries = filterFlowersEntries(multiSaplingsEntries, hasFlowers(level, pos));
        multiSaplingsEntries = multiSaplingsFlowersEntries.isEmpty() ? multiSaplingsEntries : multiSaplingsFlowersEntries;

        ConfiguredFeature<?, ?> multiSaplingConfiguredFeature = selectWeightedEntry(multiSaplingsEntries, random);
        if (multiSaplingConfiguredFeature != null) {
            for (int i = 0; i >= -1; --i) {
                for (int j = 0; j >= -1; --j) {
                    if (isTwoByTwoSapling(state, level, pos, i, j)) {
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

        List<Seed.Entry> singleSaplingsEntries = filterSaplingsEntries(entries, false);
        List<Seed.Entry> singleSaplingsFlowersEntries = filterFlowersEntries(singleSaplingsEntries, hasFlowers(level, pos));
        singleSaplingsEntries = singleSaplingsFlowersEntries.isEmpty() ? singleSaplingsEntries : singleSaplingsFlowersEntries;

        ConfiguredFeature<?, ?> singleSaplingConfiguredFeature = selectWeightedEntry(singleSaplingsEntries, random);
        if (singleSaplingConfiguredFeature == null) {
            return false;
        } else {
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

    public static ConfiguredFeature<?, ?> selectWeightedEntry(List<Seed.Entry> entries, Random random) {
        if (entries.isEmpty()) {
            return null;
        }

        int totalWeight = 0;
        for (Seed.Entry entry : entries) {
            totalWeight += entry.getWeight();
        }
        int randomWeight = random.nextInt(totalWeight);

        ConfiguredFeature<?, ?> selected = null;
        for (Seed.Entry entry : entries) {
            if (randomWeight < entry.getWeight()) {
                selected = BuiltinRegistries.CONFIGURED_FEATURE.get(ResourceKey.create(BuiltinRegistries.CONFIGURED_FEATURE.key(), ResourceLocation.tryParse(entry.getFeature())));
                break;
            } else {
                randomWeight -= entry.getWeight();
            }
        }
        return selected;
    }

    public static List<Seed.Entry> filterSaplingsEntries(List<Seed.Entry> entries, boolean saplings) {
        List<Seed.Entry> filteredEntries = new ArrayList<>();
        for (Seed.Entry entry : entries) {
            if (saplings && entry.getProximity().getSaplings()) {
                filteredEntries.add(entry);
            } else if (!saplings && !entry.getProximity().getSaplings()) {
                filteredEntries.add(entry);
            }
        }
        return filteredEntries;
    }

    public static List<Seed.Entry> filterFlowersEntries(List<Seed.Entry> entries, boolean flowers) {
        List<Seed.Entry> filteredEntries = new ArrayList<>();
        for (Seed.Entry entry : entries) {
            if (flowers && entry.getProximity().getFlowers()) {
                filteredEntries.add(entry);
            } else if (!flowers && !entry.getProximity().getFlowers()) {
                filteredEntries.add(entry);
            }
        }
        return filteredEntries;
    }

    public static List<Seed.Entry> getPassingGroupsEntries(ServerLevel level, BlockPos pos, BlockState state) {
        String dimension = level.dimension().location().toString();
        String biome = level.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY).getKey(level.getBiome(pos)).toString();
        int elevation = pos.getY();
        int luminance = level.getBrightness(LightLayer.SKY, pos);
        float temperature = level.getBiome(pos).getTemperature(pos);
        float precipitation = level.getBiome(pos).getDownfall();

        List<Seed.Entry> entries = new ArrayList<>();
        Arrays.asList(Locate.getSeeds(state)).forEach(seed -> {
            if (seed.getConditions().getRegion().getDimensions().isEmpty() || seed.getConditions().getRegion().getDimensions().contains(dimension)) {
                if (seed.getConditions().getRegion().getBiomes().isEmpty() || seed.getConditions().getRegion().getBiomes().contains(biome)) {
                    if (seed.getConditions().getLocation().getElevation().getMin() <= elevation && seed.getConditions().getLocation().getElevation().getMax() >= elevation) {
                        if (seed.getConditions().getLocation().getLuminance().getMin() <= luminance && seed.getConditions().getLocation().getLuminance().getMax() >= luminance) {
                            if (seed.getConditions().getClimate().getTemperature().getMin() <= temperature && seed.getConditions().getClimate().getTemperature().getMax() >= temperature) {
                                if (seed.getConditions().getClimate().getPrecipitation().getMin() <= precipitation && seed.getConditions().getClimate().getPrecipitation().getMax() >= precipitation) {
                                    entries.addAll(Arrays.asList(seed.getEntries()));
                                }
                            }
                        }
                    }
                }
            }
        });
        return entries;
    }

}