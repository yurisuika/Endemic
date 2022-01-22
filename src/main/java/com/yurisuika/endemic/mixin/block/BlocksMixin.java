package com.yurisuika.endemic.mixin.block;

import com.yurisuika.endemic.block.EndemicSaplingBlock;
import com.yurisuika.endemic.world.features.tree.*;
import net.minecraft.block.*;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

import java.util.Random;

@Mixin(Blocks.class)
public class BlocksMixin {

    @Redirect(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=oak_sapling")),
            at = @At(value = "NEW",
                    target = "net/minecraft/block/SaplingBlock",
                    ordinal = 0
            )
    )
    private static SaplingBlock redirectedOak(SaplingGenerator generator, AbstractBlock.Settings settings) {
        return new EndemicSaplingBlock(new EndemicOakSaplingGenerator() {
            @Nullable
            @Override
            protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
                return null;
            }
        }, AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
    }

    @Redirect(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=spruce_sapling")),
            at = @At(value = "NEW",
                    target = "net/minecraft/block/SaplingBlock",
                    ordinal = 0
            )
    )
    private static SaplingBlock redirectedSpruce(SaplingGenerator generator, AbstractBlock.Settings settings) {
        return new EndemicSaplingBlock(new EndemicSpruceSaplingGenerator() {
            @Nullable
            @Override
            protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
                return null;
            }
            @Override
            protected @Nullable ConfiguredFeature<?, ?> getLargeTreeFeature(Random random) {
                return null;
            }
        }, AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
    }

    @Redirect(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=birch_sapling")),
            at = @At(value = "NEW",
                    target = "net/minecraft/block/SaplingBlock",
                    ordinal = 0
            )
    )
    private static SaplingBlock redirectedBirch(SaplingGenerator generator, AbstractBlock.Settings settings) {
        return new EndemicSaplingBlock(new EndemicBirchSaplingGenerator() {
            @Nullable
            @Override
            protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
                return null;
            }
        }, AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
    }

    @Redirect(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=jungle_sapling")),
            at = @At(value = "NEW",
                    target = "net/minecraft/block/SaplingBlock",
                    ordinal = 0
            )
    )
    private static SaplingBlock redirectedJungle(SaplingGenerator generator, AbstractBlock.Settings settings) {
        return new EndemicSaplingBlock(new EndemicJungleSaplingGenerator() {
            @Nullable
            @Override
            protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
                return null;
            }
            @Override
            protected @Nullable ConfiguredFeature<?, ?> getLargeTreeFeature(Random random) {
                return null;
            }
        }, AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
    }

    @Redirect(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=acacia_sapling")),
            at = @At(value = "NEW",
                    target = "net/minecraft/block/SaplingBlock",
                    ordinal = 0
            )
    )
    private static SaplingBlock redirectedAcacia(SaplingGenerator generator, AbstractBlock.Settings settings) {
        return new EndemicSaplingBlock(new EndemicAcaciaSaplingGenerator() {
            @Nullable
            @Override
            protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
                return null;
            }
        }, AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
    }

    @Redirect(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=dark_oak_sapling")),
            at = @At(value = "NEW",
                    target = "net/minecraft/block/SaplingBlock",
                    ordinal = 0
            )
    )
    private static SaplingBlock redirectedDarkOak(SaplingGenerator generator, AbstractBlock.Settings settings) {
        return new EndemicSaplingBlock(new EndemicDarkOakSaplingGenerator() {
            @Nullable
            @Override
            protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
                return null;
            }
            @Override
            protected @Nullable ConfiguredFeature<?, ?> getLargeTreeFeature(Random random) {
                return null;
            }
        }, AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
    }

}
