package dev.yurisuika.endemic.mixin.minecraft.world.level;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Biome.class)
public interface BiomeInvoker {

    @Invoker("getTemperature")
    float invokeGetTemperature(BlockPos pos, int seaLevel);

}