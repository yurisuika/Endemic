package com.yurisuika.endemic.world.gen.trunk;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.yurisuika.endemic.Endemic;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

public class GiantDeadTrunkPlacer extends TrunkPlacer {
    public static final Codec<GiantDeadTrunkPlacer> CODEC = RecordCodecBuilder.create((instance) -> {
        return fillTrunkPlacerFields(instance).apply(instance, GiantDeadTrunkPlacer::new);
    });

    public GiantDeadTrunkPlacer(int i, int j, int k) {
        super(i, j, k);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return Endemic.GIANT_DEAD_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for(int i = 0; i < height; ++i) {
            setLog(world, replacer, random, mutable, config, startPos, 0, i, 0);
            if (i < height - 1) {
                setLog(world, replacer, random, mutable, config, startPos, 1, i, 0);
                setLog(world, replacer, random, mutable, config, startPos, 1, i, 1);
                setLog(world, replacer, random, mutable, config, startPos, 0, i, 1);
            }
        }

        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(height), 0, true));
    }

    private static void setLog(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, BlockPos.Mutable pos, TreeFeatureConfig config, BlockPos startPos, int x, int y, int z) {
        pos.set(startPos, x, y, z);
        trySetState(world, replacer, random, pos, config);
    }
}
