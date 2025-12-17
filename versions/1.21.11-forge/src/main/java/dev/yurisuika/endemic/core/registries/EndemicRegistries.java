package dev.yurisuika.endemic.core.registries;

import dev.yurisuika.endemic.Endemic;
import dev.yurisuika.endemic.world.level.sapling.Sapling;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

public class EndemicRegistries {

    public static final ResourceKey<Registry<Sapling>> SAPLING = ResourceKey.createRegistryKey(Identifier.fromNamespaceAndPath(Endemic.MOD_ID, "sapling"));

}