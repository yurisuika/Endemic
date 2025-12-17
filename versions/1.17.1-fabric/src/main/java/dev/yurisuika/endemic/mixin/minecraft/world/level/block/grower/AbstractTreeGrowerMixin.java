package dev.yurisuika.endemic.mixin.minecraft.world.level.block.grower;

import dev.yurisuika.endemic.util.Locate;
import dev.yurisuika.endemic.world.level.block.grower.WeightedTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(AbstractTreeGrower.class)
public abstract class AbstractTreeGrowerMixin {

    @Inject(method = "growTree", at = @At("HEAD"), cancellable = true)
    private void useEndemicFeature(ServerLevel level, ChunkGenerator generator, BlockPos pos, BlockState state, Random random, CallbackInfoReturnable<Boolean> cir) {
        if (Locate.hasSapling(level, state)) {
            cir.setReturnValue(WeightedTreeGrower.growTree(level, generator, pos, state, random));
        }
    }

}