package com.yurisuika.endemic.block.sapling;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.Random;

public abstract class EndemicSaplingGenerator extends SaplingGenerator {

    public EndemicSaplingGenerator() {
    }

    @Nullable
    protected abstract ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees, ServerWorld world, BlockPos pos);

    public boolean generate(ServerWorld world, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random random) {
        ConfiguredFeature<?, ?> configuredFeature = this.getTreeFeature(random, this.areFlowersNearby(world, pos), world, pos);
        if (configuredFeature == null) {
            return false;
        } else {
            world.setBlockState(pos, Blocks.AIR.getDefaultState(), 4);
            if (configuredFeature.generate(world, chunkGenerator, random, pos)) {
                return true;
            } else {
                world.setBlockState(pos, state, 4);
                return false;
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
