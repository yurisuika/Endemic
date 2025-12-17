package dev.yurisuika.endemic.world.level.sapling;

import dev.yurisuika.endemic.core.registries.EndemicRegistries;
import dev.yurisuika.endemic.data.sapling.SaplingProvider;
import dev.yurisuika.endemic.world.level.Group;
import dev.yurisuika.endemic.world.level.Groups;
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

    public static void register(ResourceKey<Sapling> resourceKey, Group... groups) {
        SaplingProvider.add(resourceKey, new Sapling(Arrays.asList(groups)));
    }

    public static void bootstrap() {
        register(OAK_SAPLING, Groups.SWAMP_OAK, Groups.FANCY_OAK, Groups.OAK, Groups.STUNTED_SWAMP_OAK, Groups.STUNTED_FANCY_OAK, Groups.STUNTED_OAK, Groups.OAK_SHRUB);
        register(SPRUCE_SAPLING, Groups.MEGA_PINE, Groups.MEGA_SPRUCE, Groups.PINE, Groups.SPRUCE, Groups.STUNTED_MEGA_PINE, Groups.STUNTED_MEGA_SPRUCE, Groups.STUNTED_PINE, Groups.STUNTED_SPRUCE, Groups.SPRUCE_SHRUB);
        register(BIRCH_SAPLING, Groups.SUPER_BIRCH, Groups.BIRCH, Groups.STUNTED_SUPER_BIRCH, Groups.STUNTED_BIRCH, Groups.BIRCH_SHRUB);
        register(JUNGLE_SAPLING, Groups.MEGA_JUNGLE, Groups.JUNGLE, Groups.STUNTED_MEGA_JUNGLE, Groups.STUNTED_JUNGLE, Groups.JUNGLE_SHRUB);
        register(ACACIA_SAPLING, Groups.ACACIA, Groups.STUNTED_ACACIA, Groups.ACACIA_SHRUB);
        register(DARK_OAK_SAPLING, Groups.DARK_OAK, Groups.STUNTED_DARK_OAK, Groups.DARK_OAK_SHRUB);
        register(AZALEA, Groups.AZALEA, Groups.STUNTED_AZALEA, Groups.AZALEA_SHRUB);
        register(FLOWERING_AZALEA, Groups.AZALEA, Groups.STUNTED_AZALEA, Groups.AZALEA_SHRUB);
    }

}