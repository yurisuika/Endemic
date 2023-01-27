package dev.yurisuika.endemic.world.features.tree;

import dev.yurisuika.endemic.Endemic;
import dev.yurisuika.endemic.block.sapling.EndemicSaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LightType;
import net.minecraft.world.gen.feature.*;
import org.jetbrains.annotations.Nullable;

public abstract class EndemicAcaciaSaplingGenerator extends EndemicSaplingGenerator {

    public EndemicAcaciaSaplingGenerator() {
    }

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        int light = world.getLightLevel(LightType.SKY, pos);

        // ENDEMIC (ACACIA)
        if(world.getBiome(pos).isIn(Endemic.ACACIA_ENDEMIC)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.ACACIA_ENDEMIC_FULL;
                case 11, 10, 9, 8 -> Endemic.ACACIA_ENDEMIC_LARGE;
                case 7, 6, 5, 4 -> Endemic.ACACIA_ENDEMIC_MEDIUM;
                default -> Endemic.ACACIA_ENDEMIC_SMALL;
            };
        }
        // NATIVE (ACACIA)
        else if(world.getBiome(pos).isIn(Endemic.ACACIA_NATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.ACACIA_NATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.ACACIA_NATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.ACACIA_NATIVE_MEDIUM;
                default -> Endemic.ACACIA_NATIVE_SMALL;
            };
        }
        // NONNATIVE
        else if(world.getBiome(pos).isIn(Endemic.ACACIA_NONNATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.ACACIA_NONNATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.ACACIA_NONNATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.ACACIA_NONNATIVE_MEDIUM;
                default -> Endemic.ACACIA_NONNATIVE_SMALL;
            };
        }
        // DEAD
        else {
            return Endemic.DEAD_BUSH;
        }
    }

    protected abstract RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees);

}