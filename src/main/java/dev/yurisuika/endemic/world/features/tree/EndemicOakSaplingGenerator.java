package dev.yurisuika.endemic.world.features.tree;

import dev.yurisuika.endemic.Endemic;
import dev.yurisuika.endemic.block.sapling.EndemicSaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LightType;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public abstract class EndemicOakSaplingGenerator extends EndemicSaplingGenerator {

    public EndemicOakSaplingGenerator() {
    }

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos) {
        int light = world.getLightLevel(LightType.SKY, pos);

        // ENDEMIC (SWAMP OAK)
        if (world.getBiome(pos).isIn(Endemic.OAK_ENDEMIC)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.OAK_ENDEMIC_FULL;
                case 11, 10, 9, 8 -> Endemic.OAK_ENDEMIC_LARGE;
                case 7, 6, 5, 4 -> Endemic.OAK_ENDEMIC_MEDIUM;
                default -> Endemic.OAK_ENDEMIC_SMALL;
            };
        }
        // NATIVE (FANCY OAK + OAK)
        else if (world.getBiome(pos).isIn(Endemic.OAK_NATIVE)) {
            return random.nextInt(10) == 0 ? switch (light) {
                case 15, 14, 13, 12 -> bees ? Endemic.OAK_NATIVE_FULL_ALT_BEES : Endemic.OAK_NATIVE_FULL_ALT;
                case 11, 10, 9, 8 -> Endemic.OAK_NATIVE_LARGE_ALT;
                case 7, 6, 5, 4 -> Endemic.OAK_NATIVE_MEDIUM_ALT;
                default -> Endemic.OAK_NATIVE_SMALL_ALT;
            } : switch (light) {
                case 15, 14, 13, 12 -> bees ? Endemic.OAK_NATIVE_FULL_BEES : Endemic.OAK_NATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.OAK_NATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.OAK_NATIVE_MEDIUM;
                default -> Endemic.OAK_NATIVE_SMALL;
            };
        }
        // NONNATIVE
        else if (world.getBiome(pos).isIn(Endemic.OAK_NONNATIVE)) {
            return switch (light) {
                case 15, 14, 13, 12 -> Endemic.OAK_NONNATIVE_FULL;
                case 11, 10, 9, 8 -> Endemic.OAK_NONNATIVE_LARGE;
                case 7, 6, 5, 4 -> Endemic.OAK_NONNATIVE_MEDIUM;
                default -> Endemic.OAK_NONNATIVE_SMALL;
            };
        }
        // DEAD
        else {
            return Endemic.DEAD_BUSH;
        }
    }

    protected abstract RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees);

}