package dev.yurisuika.endemic.world.level.sapling;

import dev.yurisuika.endemic.core.registries.EndemicRegistries;
import dev.yurisuika.endemic.world.level.sapling.group.Group;
import dev.yurisuika.endemic.world.level.sapling.group.Groups;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.Arrays;

public class Saplings {

    public static final ResourceKey<Sapling> OAK_SAPLING = ResourceKey.create(EndemicRegistries.SAPLING, new ResourceLocation("oak_sapling"));
    public static final ResourceKey<Sapling> SPRUCE_SAPLING = ResourceKey.create(EndemicRegistries.SAPLING, new ResourceLocation("spruce_sapling"));
    public static final ResourceKey<Sapling> BIRCH_SAPLING = ResourceKey.create(EndemicRegistries.SAPLING, new ResourceLocation("birch_sapling"));
    public static final ResourceKey<Sapling> JUNGLE_SAPLING = ResourceKey.create(EndemicRegistries.SAPLING, new ResourceLocation("jungle_sapling"));
    public static final ResourceKey<Sapling> ACACIA_SAPLING = ResourceKey.create(EndemicRegistries.SAPLING, new ResourceLocation("acacia_sapling"));
    public static final ResourceKey<Sapling> DARK_OAK_SAPLING = ResourceKey.create(EndemicRegistries.SAPLING, new ResourceLocation("dark_oak_sapling"));
    public static final ResourceKey<Sapling> AZALEA = ResourceKey.create(EndemicRegistries.SAPLING, new ResourceLocation("azalea"));
    public static final ResourceKey<Sapling> FLOWERING_AZALEA = ResourceKey.create(EndemicRegistries.SAPLING, new ResourceLocation("flowering_azalea"));
    public static final ResourceKey<Sapling> MANGROVE_PROPAGULE = ResourceKey.create(EndemicRegistries.SAPLING, new ResourceLocation("mangrove_propagule"));
    public static final ResourceKey<Sapling> CHERRY_SAPLING = ResourceKey.create(EndemicRegistries.SAPLING, new ResourceLocation("cherry_sapling"));

    public static void register(BootstrapContext<Sapling> context, ResourceKey<Sapling> resourceKey, Group... groups) {
        context.register(resourceKey, new Sapling(Arrays.asList(groups)));
    }

    public static void bootstrap(BootstrapContext<Sapling> context) {
        register(context, OAK_SAPLING, Groups.SWAMP_OAK, Groups.FANCY_OAK, Groups.OAK, Groups.DWARF_SWAMP_OAK, Groups.DWARF_FANCY_OAK, Groups.DWARF_OAK, Groups.SHRUB_OAK);
        register(context, SPRUCE_SAPLING, Groups.MEGA_PINE_SPRUCE, Groups.MEGA_SPRUCE, Groups.PINE_SPRUCE, Groups.SPRUCE, Groups.DWARF_MEGA_PINE_SPRUCE, Groups.DWARF_MEGA_SPRUCE, Groups.DWARF_PINE_SPRUCE, Groups.DWARF_SPRUCE, Groups.SHRUB_SPRUCE);
        register(context, BIRCH_SAPLING, Groups.TALL_BIRCH, Groups.BIRCH, Groups.DWARF_TALL_BIRCH, Groups.DWARF_BIRCH, Groups.SHRUB_BIRCH);
        register(context, JUNGLE_SAPLING, Groups.MEGA_JUNGLE, Groups.JUNGLE, Groups.DWARF_MEGA_JUNGLE, Groups.DWARF_JUNGLE, Groups.SHRUB_JUNGLE);
        register(context, ACACIA_SAPLING, Groups.ACACIA, Groups.DWARF_ACACIA, Groups.SHRUB_ACACIA);
        register(context, DARK_OAK_SAPLING, Groups.DARK_OAK, Groups.DWARF_DARK_OAK, Groups.SHRUB_DARK_OAK);
        register(context, AZALEA, Groups.AZALEA, Groups.DWARF_AZALEA, Groups.SHRUB_AZALEA);
        register(context, FLOWERING_AZALEA, Groups.AZALEA, Groups.DWARF_AZALEA, Groups.SHRUB_AZALEA);
        register(context, MANGROVE_PROPAGULE, Groups.TALL_MANGROVE, Groups.MANGROVE, Groups.DWARF_TALL_MANGROVE, Groups.DWARF_MANGROVE, Groups.SHRUB_MANGROVE);
        register(context, CHERRY_SAPLING, Groups.CHERRY, Groups.DWARF_CHERRY, Groups.SHRUB_CHERRY);
    }

}