package dev.yurisuika.endemic.block.sapling;

import java.util.Iterator;
import java.util.logging.Logger;

import dev.yurisuika.endemic.Endemic;
import net.minecraft.block.BlockState;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public abstract class EndemicSaplingGenerator extends SaplingGenerator {

    public EndemicSaplingGenerator() {
    }

    @Nullable
    protected abstract RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos);

    public boolean generate(ServerWorld world, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random random) {
        RegistryKey<ConfiguredFeature<?, ?>> registryKey = this.getTreeFeature(random, this.areFlowersNearby(world, pos), world, pos);
        if (registryKey == null) {
            Endemic.LOGGER.info("Dang Key is null!");
            return false;
        } else {
            RegistryEntry<ConfiguredFeature<?, ?>> registryEntry = (RegistryEntry)world.getRegistryManager().get(RegistryKeys.CONFIGURED_FEATURE).getEntry(registryKey).orElse((RegistryEntry.Reference<ConfiguredFeature<?, ?>>) null);
            if (registryEntry == null) {
                Endemic.LOGGER.info("Dang Entry is null!");
                return false;
            } else {
                ConfiguredFeature<?, ?> configuredFeature = (ConfiguredFeature)registryEntry.value();
                BlockState blockState = world.getFluidState(pos).getBlockState();
                world.setBlockState(pos, blockState, 4);
                if (configuredFeature.generate(world, chunkGenerator, random, pos)) {
                    if (world.getBlockState(pos) == blockState) {
                        world.updateListeners(pos, state, blockState, 2);
                    }

                    Endemic.LOGGER.info("Can place!");
                    return true;
                } else {
                    world.setBlockState(pos, state, 4);
                    Endemic.LOGGER.info("Cannot place!");
                    return false;
                }
            }
        }
    }

    private boolean areFlowersNearby(WorldAccess world, BlockPos pos) {
        Iterator var3 = BlockPos.Mutable.iterate(pos.down().north(2).west(2), pos.up().south(2).east(2)).iterator();

        BlockPos blockPos;
        do {
            if (!var3.hasNext()) {
                return false;
            }

            blockPos = (BlockPos)var3.next();
        } while(!world.getBlockState(blockPos).isIn(BlockTags.FLOWERS));

        return true;
    }

}