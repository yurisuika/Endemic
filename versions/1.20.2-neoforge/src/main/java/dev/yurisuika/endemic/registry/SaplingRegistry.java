package dev.yurisuika.endemic.registry;

import dev.yurisuika.endemic.config.SaplingConfig;
import dev.yurisuika.endemic.world.level.Group;
import dev.yurisuika.endemic.world.level.Groups;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.loading.FMLPaths;

import java.io.File;
import java.util.TreeMap;

public class SaplingRegistry {

    public static final TreeMap<ResourceLocation, Group[]> SAPLINGS = new TreeMap<ResourceLocation, Group[]>();

    public static void register(ResourceLocation name, Group... groups) {
        createSaplingConfig(name, groups);
        loadSaplingConfig(name);
    }

    public static void createSaplingConfig(ResourceLocation name, Group... groups) {
        SaplingConfig config = new SaplingConfig(name, groups);
        if (!config.file.exists()) {
            config.saveConfig();
        }
    }

    public static void loadSaplingConfig(ResourceLocation name) {
        SaplingConfig config = new SaplingConfig(name, null);
        config.loadConfig();
        SAPLINGS.put(name, config.getGroups());
    }

    public static void loadAllSaplingConfigs() {
        File endemicFile = new File(FMLPaths.CONFIGDIR.get().toFile(), "endemic");
        for (File namespaceFile : endemicFile.listFiles()) {
            for (File pathFile : namespaceFile.listFiles()) {
                loadSaplingConfig(new ResourceLocation(namespaceFile.getName(), pathFile.getName().substring(0, pathFile.getName().lastIndexOf('.'))));
            }
        }
    }

    public static void bootstrap() {
        register(new ResourceLocation("oak_sapling"), Groups.SWAMP_OAK, Groups.FANCY_OAK, Groups.OAK, Groups.STUNTED_SWAMP_OAK, Groups.STUNTED_FANCY_OAK, Groups.STUNTED_OAK, Groups.OAK_SHRUB);
        register(new ResourceLocation("spruce_sapling"), Groups.MEGA_PINE, Groups.MEGA_SPRUCE, Groups.PINE, Groups.SPRUCE, Groups.STUNTED_MEGA_PINE, Groups.STUNTED_MEGA_SPRUCE, Groups.STUNTED_PINE, Groups.STUNTED_SPRUCE, Groups.SPRUCE_SHRUB);
        register(new ResourceLocation("birch_sapling"), Groups.SUPER_BIRCH, Groups.BIRCH, Groups.STUNTED_SUPER_BIRCH, Groups.STUNTED_BIRCH, Groups.BIRCH_SHRUB);
        register(new ResourceLocation("jungle_sapling"), Groups.MEGA_JUNGLE, Groups.JUNGLE, Groups.STUNTED_MEGA_JUNGLE, Groups.STUNTED_JUNGLE, Groups.JUNGLE_SHRUB);
        register(new ResourceLocation("acacia_sapling"), Groups.ACACIA, Groups.STUNTED_ACACIA, Groups.ACACIA_SHRUB);
        register(new ResourceLocation("dark_oak_sapling"), Groups.DARK_OAK, Groups.STUNTED_DARK_OAK, Groups.DARK_OAK_SHRUB);
        register(new ResourceLocation("mangrove_propagule"), Groups.TALL_MANGROVE, Groups.MANGROVE, Groups.STUNTED_TALL_MANGROVE, Groups.STUNTED_MANGROVE, Groups.MANGROVE_SHRUB);
        register(new ResourceLocation("cherry_sapling"), Groups.CHERRY, Groups.STUNTED_CHERRY, Groups.CHERRY_SHRUB);
        register(new ResourceLocation("azalea"), Groups.AZALEA, Groups.STUNTED_AZALEA, Groups.AZALEA_SHRUB);
        register(new ResourceLocation("flowering_azalea"), Groups.AZALEA, Groups.STUNTED_AZALEA, Groups.AZALEA_SHRUB);
    }

}