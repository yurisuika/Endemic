package com.yurisuika.endemic.mixin.block;

import com.yurisuika.endemic.block.EndemicSaplingBlock;
import com.yurisuika.endemic.world.features.tree.EndemicOakSaplingGenerator;
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
    private static SaplingBlock injected3(SaplingGenerator generator, AbstractBlock.Settings settings) {
        return new EndemicSaplingBlock(new EndemicOakSaplingGenerator() {
            @Nullable
            @Override
            protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
                return null;
            }
        }, AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
    }

}
