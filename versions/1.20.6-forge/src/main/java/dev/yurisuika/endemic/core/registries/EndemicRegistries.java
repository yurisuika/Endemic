package dev.yurisuika.endemic.core.registries;

import dev.yurisuika.endemic.Endemic;
import dev.yurisuika.endemic.world.level.sapling.Sapling;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class EndemicRegistries {

    public static final ResourceKey<Registry<Sapling>> SAPLING = ResourceKey.createRegistryKey(new ResourceLocation(Endemic.MOD_ID, "sapling"));

}