package dev.yurisuika.endemic.data;

import dev.yurisuika.endemic.core.registries.EndemicRegistries;
import dev.yurisuika.endemic.world.level.sapling.Sapling;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;

import java.util.concurrent.CompletableFuture;

public class EndemicDatapackProvider extends FabricDynamicRegistryProvider {

    public EndemicDatapackProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    public void configure(HolderLookup.Provider registries, Entries entries) {
        entries.addAll(registries.lookupOrThrow(Registries.CONFIGURED_FEATURE));

        HolderLookup.RegistryLookup<Sapling> registry = registries.lookupOrThrow(EndemicRegistries.SAPLING);
        registry.listElementIds().forEach(key -> entries.add(registry, key));
    }

    @Override
    public String getName() {
        return "Endemic Data";
    }

}