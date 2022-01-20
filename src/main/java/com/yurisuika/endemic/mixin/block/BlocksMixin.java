package com.yurisuika.endemic.mixin.block;

import com.yurisuika.endemic.block.EndemicSaplingBlock;
import com.yurisuika.endemic.world.features.tree.EndemicOakSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.sound.BlockSoundGroup;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;

//import static com.yurisuika.endemic.Endemic.OAK_SAPLING;


@Mixin(Blocks.class)
public class BlocksMixin {
    @Shadow
    @Mutable
    @Final
    public static Block OAK_SAPLING;


//    @ModifyArg(
//            method = "<clinit>",
//            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=oak_sapling")),
//            at = @At(value = "INVOKE",
//                    target = "net/minecraft/block/sapling/OakSaplingGenerator.<init> ()V")
//    )
//    private static OakSaplingGenerator mixinOak2() {
//        return new EndemicOakSaplingGenerator();
//    }

//    @Redirect(method = "<clinit>",
//            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=oak_sapling")),
//            at = @At(value = "FIELD",
//                    target = "net/minecraft/block/Blocks.OAK_SAPLING:Lnet/minecraft/block/Block;",
//                    opcode = Opcodes.PUTSTATIC
//            )
//    )
//    private static void injected(Block value) {
//        OAK_SAPLING = register("oak_sapling", new EndemicSaplingBlock(new EndemicOakSaplingGenerator(), AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)));
//    }

//    @Redirect(method = "<clinit>",
//            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=oak_sapling")),
//            at = @At(value = "INVOKE",
//                    target = "net/minecraft/block/SaplingBlock.<init>(Lnet/minecraft/block/sapling/SaplingGenerator;Lnet/minecraft/block/AbstractBlock$Settings;)V"
//            )
//    )
//    private static void injected2(SaplingBlock instance, SaplingGenerator generator, AbstractBlock.Settings settings) {
//        new EndemicSaplingBlock(new EndemicOakSaplingGenerator(), AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
    //        return new EndemicSaplingBlock(generator, settings);
//    }

    @Redirect(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=oak_sapling")),
            at = @At(value = "NEW",
                    target = "net/minecraft/block/SaplingBlock",
                    ordinal = 0
            )
    )
    private static SaplingBlock injected3(SaplingGenerator generator, AbstractBlock.Settings settings) {
        return new EndemicSaplingBlock(new EndemicOakSaplingGenerator(), AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
    }

//    @Redirect(method = "<clinit>",
//            at = @At(value = "NEW", target = "net/minecraft/block/TorchBlock", ordinal = 0),
//            slice = @Slice(from = @At(value = "CONSTANT", args="stringValue=torch"))
//            )
//    private static TorchBlock finiteTorches(AbstractBlock.Settings settings, ParticleEffect particle)
//    {
//        return new FiniteTorchBlock(settings, particle);
//    }

//    @Redirect(method = "<clinit>",
//            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=oak_sapling")),
//            at = @At(value = "NEW",
//                    target = "net/minecraft/block/sapling/OakSaplingGenerator",
//                    ordinal = 0
//            )
//    )
//    private static OakSaplingGenerator injected4() {
//        return new EndemicOakSaplingGenerator();
//    }

//    @Shadow

//    private static final Block OAK_SAPLING = new EndemicSaplingBlock(new EndemicOakSaplingGenerator(), AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));

//    @Mutable
//    @Shadow
//    @Final
//    public static final Block OAK_SAPLING;
//
//    static {
//        OAK_SAPLING = register("oak_sapling", new EndemicSaplingBlock(new EndemicOakSaplingGenerator(), AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)));
//    }
//
//    @Inject(method="register", at=@At(value="HEAD"), cancellable=true)
//    private static void registerHook(String id, Block block, CallbackInfoReturnable<Block> info) {
//        if(Objects.equals(id, "oak_sapling")) {
//            info.setReturnValue(Registry.register(Registry.BLOCK, id, OAK_SAPLING));
//        }
//    }


}
