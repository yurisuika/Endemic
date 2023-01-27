package dev.yurisuika.endemic.world.features.tree;

import dev.yurisuika.endemic.Endemic;
import dev.yurisuika.endemic.block.sapling.EndemicLargeTreeSaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LightType;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public abstract class EndemicSpruceSaplingGenerator extends EndemicLargeTreeSaplingGenerator {

    public EndemicSpruceSaplingGenerator() {
    }

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        int light = world.getLightLevel(LightType.SKY, pos);

        // ENDEMIC (SPRUCE)
        if(world.getBiome(pos).isIn(Endemic.SPRUCE_ENDEMIC)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.SPRUCE_ENDEMIC_FULL;
                case 11, 10, 9, 8 -> Endemic.SPRUCE_ENDEMIC_LARGE;
                case 7, 6, 5, 4 -> Endemic.SPRUCE_ENDEMIC_MEDIUM;
                default -> Endemic.SPRUCE_ENDEMIC_SMALL;
            };
        }
        // NATIVE (SPRUCE + PINE)
        else if(world.getBiome(pos).isIn(Endemic.SPRUCE_NATIVE)) {
            return random.nextBoolean() ?  switch (light) {
                case 15, 14, 13, 12 -> Endemic.SPRUCE_ENDEMIC_FULL;
                case 11, 10, 9, 8 -> Endemic.SPRUCE_ENDEMIC_LARGE;
                case 7, 6, 5, 4 -> Endemic.SPRUCE_ENDEMIC_MEDIUM;
                default -> Endemic.SPRUCE_ENDEMIC_SMALL;
            } : switch (light) {
                case 15, 14, 13, 12 -> Endemic.SPRUCE_NATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.SPRUCE_NATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.SPRUCE_NATIVE_MEDIUM;
                default -> Endemic.SPRUCE_NATIVE_SMALL;
            };
        }
        // NONNATIVE
        else if(world.getBiome(pos).isIn(Endemic.SPRUCE_NONNATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.SPRUCE_NONNATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.SPRUCE_NONNATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.SPRUCE_NONNATIVE_MEDIUM;
                default -> Endemic.SPRUCE_NONNATIVE_SMALL;
            };
        }
        // DEAD
        else {
            return Endemic.DEAD_BUSH;
        }
    }

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        int light = world.getLightLevel(LightType.SKY, pos);

        // ENDEMIC (GIANT SPRUCE)
        if(world.getBiome(pos).isIn(Endemic.GIANT_SPRUCE_ENDEMIC)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.GIANT_SPRUCE_ENDEMIC_FULL;
                case 11, 10, 9, 8 -> Endemic.GIANT_SPRUCE_ENDEMIC_LARGE;
                case 7, 6, 5, 4 -> Endemic.GIANT_SPRUCE_ENDEMIC_MEDIUM;
                default -> Endemic.GIANT_SPRUCE_ENDEMIC_SMALL;
            };
        }
        // NATIVE (GIANT PINE)
        else if(world.getBiome(pos).isIn(Endemic.GIANT_SPRUCE_NATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.GIANT_SPRUCE_NATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.GIANT_SPRUCE_NATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.GIANT_SPRUCE_NATIVE_MEDIUM;
                default -> Endemic.GIANT_SPRUCE_NATIVE_SMALL;
            };
        }
        // NONNATIVE
        else if(world.getBiome(pos).isIn(Endemic.GIANT_SPRUCE_NONNATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.GIANT_SPRUCE_NONNATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.GIANT_SPRUCE_NONNATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.GIANT_SPRUCE_NONNATIVE_MEDIUM;
                default -> Endemic.GIANT_SPRUCE_NONNATIVE_SMALL;
            };
        }
        // DEAD
        else {
            return Endemic.GIANT_DEAD_BUSH;
        }
    }

    protected abstract RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees);

    protected abstract RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random);

}