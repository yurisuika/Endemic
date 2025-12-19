package dev.yurisuika.endemic.world.level.sapling.group;

import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.dimension.DimensionType;

public class Groups {

    public static Group SWAMP_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SWAMP_OAK)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.SWAMP_OAK_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.SWAMP,
                    Biomes.SWAMP_HILLS)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.8D, 0.8D)
            .temperatureTolerance(0.7D, 0.9D)
            .downfallOptimum(0.9D, 0.9D)
            .downfallTolerance(0.8D, 1.0D)
            .build();
    public static Group FANCY_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.FANCY_OAK)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.FANCY_OAK_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeBlacklist(Biomes.SWAMP,
                    Biomes.SWAMP_HILLS)
            .biomeWhitelist(Biomes.BAMBOO_JUNGLE,
                    Biomes.BAMBOO_JUNGLE_HILLS,
                    Biomes.COLD_OCEAN,
                    Biomes.DARK_FOREST,
                    Biomes.DEEP_COLD_OCEAN,
                    Biomes.DEEP_FROZEN_OCEAN,
                    Biomes.DEEP_LUKEWARM_OCEAN,
                    Biomes.DEEP_OCEAN,
                    Biomes.DEEP_WARM_OCEAN,
                    Biomes.FLOWER_FOREST,
                    Biomes.FOREST,
                    Biomes.FROZEN_OCEAN,
                    Biomes.FROZEN_RIVER,
                    Biomes.GRAVELLY_MOUNTAINS,
                    Biomes.JUNGLE,
                    Biomes.JUNGLE_EDGE,
                    Biomes.JUNGLE_HILLS,
                    Biomes.LUKEWARM_OCEAN,
                    Biomes.MODIFIED_GRAVELLY_MOUNTAINS,
                    Biomes.MODIFIED_JUNGLE,
                    Biomes.MODIFIED_JUNGLE_EDGE,
                    Biomes.MOUNTAINS,
                    Biomes.MOUNTAIN_EDGE,
                    Biomes.OCEAN,
                    Biomes.PLAINS,
                    Biomes.RIVER,
                    Biomes.SUNFLOWER_PLAINS,
                    Biomes.WARM_OCEAN,
                    Biomes.WOODED_HILLS,
                    Biomes.WOODED_MOUNTAINS)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.0D, 0.95D)
            .temperatureTolerance(-0.1D, 1.05D)
            .downfallOptimum(0.3D, 0.9D)
            .downfallTolerance(0.2D, 1.0D)
            .build();
    public static Group OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.OAK)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.OAK_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeBlacklist(Biomes.SWAMP,
                    Biomes.SWAMP_HILLS)
            .biomeWhitelist(Biomes.COLD_OCEAN,
                    Biomes.DARK_FOREST,
                    Biomes.DEEP_COLD_OCEAN,
                    Biomes.DEEP_FROZEN_OCEAN,
                    Biomes.DEEP_LUKEWARM_OCEAN,
                    Biomes.DEEP_OCEAN,
                    Biomes.DEEP_WARM_OCEAN,
                    Biomes.FLOWER_FOREST,
                    Biomes.FOREST,
                    Biomes.FROZEN_OCEAN,
                    Biomes.FROZEN_RIVER,
                    Biomes.GRAVELLY_MOUNTAINS,
                    Biomes.LUKEWARM_OCEAN,
                    Biomes.MODIFIED_GRAVELLY_MOUNTAINS,
                    Biomes.MODIFIED_WOODED_BADLANDS_PLATEAU,
                    Biomes.MOUNTAINS,
                    Biomes.MOUNTAIN_EDGE,
                    Biomes.OCEAN,
                    Biomes.PLAINS,
                    Biomes.RIVER,
                    Biomes.SAVANNA,
                    Biomes.SAVANNA_PLATEAU,
                    Biomes.SHATTERED_SAVANNA,
                    Biomes.SHATTERED_SAVANNA_PLATEAU,
                    Biomes.SUNFLOWER_PLAINS,
                    Biomes.WARM_OCEAN,
                    Biomes.WOODED_BADLANDS_PLATEAU,
                    Biomes.WOODED_HILLS,
                    Biomes.WOODED_MOUNTAINS)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.0D, 2.0D)
            .temperatureTolerance(-0.1D, 2.1D)
            .downfallOptimum(0.0D, 0.8D)
            .downfallTolerance(-0.1D, 0.9D)
            .build();
    public static Group DWARF_SWAMP_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_SWAMP_OAK)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.SWAMP,
                    Biomes.SWAMP_HILLS)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.7D, 0.9D)
            .temperatureTolerance(0.5D, 1.1D)
            .downfallOptimum(0.8D, 0.9D)
            .downfallTolerance(0.6D, 1.1D)
            .build();
    public static Group DWARF_FANCY_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_FANCY_OAK)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeBlacklist(Biomes.SWAMP,
                    Biomes.SWAMP_HILLS)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(-0.1D, 1.05D)
            .temperatureTolerance(-0.3D, 1.25D)
            .downfallOptimum(0.2D, 0.9D)
            .downfallTolerance(0.0D, 1.1D)
            .build();
    public static Group DWARF_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_OAK)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeBlacklist(Biomes.SWAMP,
                    Biomes.SWAMP_HILLS)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(-0.1D, 2.1D)
            .temperatureTolerance(-0.3D, 2.3D)
            .downfallOptimum(-0.1D, 0.9D)
            .downfallTolerance(-0.3D, 1.1D)
            .build();
    public static Group SHRUB_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SHRUB_OAK)
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(32, 191)
            .elevationTolerance(0, 255)
            .brightnessOptimum(4, 12)
            .brightnessTolerance(0, 16)
            .temperatureOptimum(-0.3D, 2.3D)
            .temperatureTolerance(-0.7D, 2.7D)
            .downfallOptimum(-0.3D, 1.1D)
            .downfallTolerance(-0.7D, 1.5D)
            .build();

    public static Group MEGA_PINE_SPRUCE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.MEGA_PINE_SPRUCE)
                    .requiresAdjacentSaplings()
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.MEGA_PINE_SPRUCE_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .requiresAdjacentSaplings()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.GIANT_TREE_TAIGA,
                    Biomes.GIANT_TREE_TAIGA_HILLS)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.3D, 0.3D)
            .temperatureTolerance(0.2D, 0.4D)
            .downfallOptimum(0.8D, 0.8D)
            .downfallTolerance(0.7D, 0.9D)
            .build();
    public static Group MEGA_SPRUCE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.MEGA_SPRUCE)
                    .requiresAdjacentSaplings()
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.MEGA_SPRUCE_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .requiresAdjacentSaplings()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.GIANT_SPRUCE_TAIGA,
                    Biomes.GIANT_SPRUCE_TAIGA_HILLS,
                    Biomes.GIANT_TREE_TAIGA,
                    Biomes.GIANT_TREE_TAIGA_HILLS)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.25D, 0.25D)
            .temperatureTolerance(0.15D, 0.15D)
            .downfallOptimum(0.8D, 0.8D)
            .downfallTolerance(0.7D, 0.9D)
            .build();
    public static Group PINE_SPRUCE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.PINE_SPRUCE)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.PINE_SPRUCE_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.GIANT_SPRUCE_TAIGA,
                    Biomes.GIANT_SPRUCE_TAIGA_HILLS,
                    Biomes.GIANT_TREE_TAIGA,
                    Biomes.GIANT_TREE_TAIGA_HILLS,
                    Biomes.SNOWY_TAIGA,
                    Biomes.SNOWY_TAIGA_HILLS,
                    Biomes.SNOWY_TAIGA_MOUNTAINS,
                    Biomes.TAIGA,
                    Biomes.TAIGA_HILLS,
                    Biomes.TAIGA_MOUNTAINS)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(-0.5D, 0.3D)
            .temperatureTolerance(-0.6D, 0.4D)
            .downfallOptimum(0.4D, 0.8D)
            .downfallTolerance(0.3D, 0.9D)
            .build();
    public static Group SPRUCE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SPRUCE)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.SPRUCE_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.FROZEN_RIVER,
                    Biomes.GIANT_SPRUCE_TAIGA,
                    Biomes.GIANT_SPRUCE_TAIGA_HILLS,
                    Biomes.GIANT_TREE_TAIGA,
                    Biomes.GIANT_TREE_TAIGA_HILLS,
                    Biomes.GRAVELLY_MOUNTAINS,
                    Biomes.MODIFIED_GRAVELLY_MOUNTAINS,
                    Biomes.MOUNTAINS,
                    Biomes.MOUNTAIN_EDGE,
                    Biomes.SNOWY_MOUNTAINS,
                    Biomes.SNOWY_TAIGA,
                    Biomes.SNOWY_TAIGA_HILLS,
                    Biomes.SNOWY_TAIGA_MOUNTAINS,
                    Biomes.SNOWY_TUNDRA,
                    Biomes.TAIGA,
                    Biomes.TAIGA_HILLS,
                    Biomes.TAIGA_MOUNTAINS,
                    Biomes.WOODED_MOUNTAINS)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(-0.5D, 0.3D)
            .temperatureTolerance(-0.6D, 0.4D)
            .downfallOptimum(0.4D, 0.8D)
            .downfallTolerance(0.3D, 0.9D)
            .build();
    public static Group DWARF_MEGA_PINE_SPRUCE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_MEGA_PINE_SPRUCE)
                    .requiresAdjacentSaplings()
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.2D, 0.4D)
            .temperatureTolerance(0.0D, 0.6D)
            .downfallOptimum(0.7D, 0.9D)
            .downfallTolerance(0.5D, 1.1D)
            .build();
    public static Group DWARF_MEGA_SPRUCE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_MEGA_SPRUCE)
                    .requiresAdjacentSaplings()
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.15D, 0.35D)
            .temperatureTolerance(-0.05D, 0.55D)
            .downfallOptimum(0.7D, 0.9D)
            .downfallTolerance(0.5D, 1.1D)
            .build();
    public static Group DWARF_PINE_SPRUCE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_PINE_SPRUCE)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(-0.6D, 0.4D)
            .temperatureTolerance(-0.8D, 0.6D)
            .downfallOptimum(0.3D, 0.9D)
            .downfallTolerance(0.1D, 1.1D)
            .build();
    public static Group DWARF_SPRUCE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_SPRUCE)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(-0.6D, 0.4D)
            .temperatureTolerance(-0.8D, 0.6D)
            .downfallOptimum(0.3D, 0.9D)
            .downfallTolerance(0.1D, 1.1D)
            .build();
    public static Group SHRUB_SPRUCE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SHRUB_SPRUCE)
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(32, 191)
            .elevationTolerance(0, 255)
            .brightnessOptimum(4, 12)
            .brightnessTolerance(0, 16)
            .temperatureOptimum(-0.8D, 0.6D)
            .temperatureTolerance(-1.2D, 1.0D)
            .downfallOptimum(0.1D, 1.1D)
            .downfallTolerance(-0.4D, 1.5D)
            .build();

    public static Group TALL_BIRCH = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.TALL_BIRCH)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.TALL_BIRCH_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.TALL_BIRCH_FOREST,
                    Biomes.TALL_BIRCH_HILLS)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.5D, 0.6D)
            .temperatureTolerance(0.4D, 0.7D)
            .downfallOptimum(0.6D, 0.8D)
            .downfallTolerance(0.5D, 0.9D)
            .build();
    public static Group BIRCH = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.BIRCH)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.BIRCH_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.BIRCH_FOREST,
                    Biomes.BIRCH_FOREST_HILLS,
                    Biomes.DARK_FOREST,
                    Biomes.DARK_FOREST_HILLS,
                    Biomes.FLOWER_FOREST,
                    Biomes.FOREST,
                    Biomes.MOUNTAINS,
                    Biomes.MOUNTAIN_EDGE,
                    Biomes.TALL_BIRCH_FOREST,
                    Biomes.TALL_BIRCH_HILLS,
                    Biomes.WOODED_HILLS,
                    Biomes.WOODED_MOUNTAINS)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.6D, 0.7D)
            .temperatureTolerance(0.5D, 0.8D)
            .downfallOptimum(0.6D, 0.8D)
            .downfallTolerance(0.5D, 0.9D)
            .build();
    public static Group DWARF_TALL_BIRCH = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_TALL_BIRCH)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.4D, 0.7D)
            .temperatureTolerance(0.2D, 0.9D)
            .downfallOptimum(0.5D, 0.9D)
            .downfallTolerance(0.3D, 1.1D)
            .build();
    public static Group DWARF_BIRCH = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_BIRCH)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.5D, 0.8D)
            .temperatureTolerance(0.3D, 1.0D)
            .downfallOptimum(0.5D, 0.9D)
            .downfallTolerance(0.3D, 1.1D)
            .build();
    public static Group SHRUB_BIRCH = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SHRUB_BIRCH)
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(32, 191)
            .elevationTolerance(0, 255)
            .brightnessOptimum(4, 12)
            .brightnessTolerance(0, 16)
            .temperatureOptimum(0.2D, 1.0D)
            .temperatureTolerance(-0.2D, 1.4D)
            .downfallOptimum(0.3D, 1.1D)
            .downfallTolerance(-0.1D, 1.5D)
            .build();

    public static Group MEGA_JUNGLE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.MEGA_JUNGLE)
                    .requiresAdjacentSaplings()
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.MEGA_JUNGLE_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .requiresAdjacentSaplings()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.BAMBOO_JUNGLE,
                    Biomes.BAMBOO_JUNGLE_HILLS,
                    Biomes.JUNGLE,
                    Biomes.JUNGLE_HILLS,
                    Biomes.MODIFIED_JUNGLE)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.95D, 0.95D)
            .temperatureTolerance(0.85D, 1.05D)
            .downfallOptimum(0.9D, 0.9D)
            .downfallTolerance(0.8D, 1.0D)
            .build();
    public static Group JUNGLE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.JUNGLE)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.JUNGLE_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.JUNGLE,
                    Biomes.JUNGLE_EDGE,
                    Biomes.JUNGLE_HILLS,
                    Biomes.MODIFIED_JUNGLE,
                    Biomes.MODIFIED_JUNGLE_EDGE)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.95D, 0.95D)
            .temperatureTolerance(0.85D, 1.05D)
            .downfallOptimum(0.8D, 0.9D)
            .downfallTolerance(0.7D, 1.0D)
            .build();
    public static Group DWARF_MEGA_JUNGLE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_MEGA_JUNGLE)
                    .requiresAdjacentSaplings()
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.85D, 1.05D)
            .temperatureTolerance(0.65D, 1.25D)
            .downfallOptimum(0.8D, 1.0D)
            .downfallTolerance(0.6D, 1.2D)
            .build();
    public static Group DWARF_JUNGLE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_JUNGLE)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.95D, 1.05D)
            .temperatureTolerance(0.65D, 1.25D)
            .downfallOptimum(0.7D, 1.0D)
            .downfallTolerance(0.5D, 1.2D)
            .build();
    public static Group SHRUB_JUNGLE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SHRUB_JUNGLE)
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(32, 191)
            .elevationTolerance(0, 255)
            .brightnessOptimum(4, 12)
            .brightnessTolerance(0, 16)
            .temperatureOptimum(0.65D, 1.25D)
            .temperatureTolerance(0.25D, 1.65D)
            .downfallOptimum(0.5D, 1.2D)
            .downfallTolerance(0.1D, 1.6D)
            .build();

    public static Group ACACIA = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.ACACIA)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.ACACIA_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.SAVANNA,
                    Biomes.SAVANNA_PLATEAU,
                    Biomes.SHATTERED_SAVANNA,
                    Biomes.SHATTERED_SAVANNA_PLATEAU)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(2.0D, 2.0D)
            .temperatureTolerance(1.9D, 2.1D)
            .downfallOptimum(0.0D, 0.0D)
            .downfallTolerance(-0.1D, 0.1D)
            .build();
    public static Group DWARF_ACACIA = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_ACACIA)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(1.9D, 2.1D)
            .temperatureTolerance(1.7D, 2.3D)
            .downfallOptimum(-0.1D, 0.1D)
            .downfallTolerance(-0.3D, 0.3D)
            .build();
    public static Group SHRUB_ACACIA = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SHRUB_ACACIA)
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(32, 191)
            .elevationTolerance(0, 255)
            .brightnessOptimum(4, 12)
            .brightnessTolerance(0, 16)
            .temperatureOptimum(1.7D, 2.3D)
            .temperatureTolerance(1.3D, 2.7D)
            .downfallOptimum(-0.3D, 0.3D)
            .downfallTolerance(-0.7D, 0.7D)
            .build();

    public static Group DARK_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DARK_OAK)
                    .requiresAdjacentSaplings()
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.DARK_OAK_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .requiresAdjacentSaplings()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.DARK_FOREST,
                    Biomes.DARK_FOREST_HILLS)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.7D, 0.7D)
            .temperatureTolerance(0.6D, 0.8D)
            .downfallOptimum(0.8D, 0.8D)
            .downfallTolerance(0.7D, 0.9D)
            .build();
    public static Group DWARF_DARK_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_DARK_OAK)
                    .requiresAdjacentSaplings()
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.6D, 0.8D)
            .temperatureTolerance(0.4D, 1.0D)
            .downfallOptimum(0.7D, 0.9D)
            .downfallTolerance(0.5D, 1.1D)
            .build();
    public static Group SHRUB_DARK_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SHRUB_DARK_OAK)
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(32, 191)
            .elevationTolerance(0, 255)
            .brightnessOptimum(4, 12)
            .brightnessTolerance(0, 16)
            .temperatureOptimum(0.4D, 1.0D)
            .temperatureTolerance(0.0D, 1.4D)
            .downfallOptimum(0.5D, 1.1D)
            .downfallTolerance(0.1D, 1.5D)
            .build();

    public static Group AZALEA = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.AZALEA)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.AZALEA_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .biomeWhitelist(Biomes.LUSH_CAVES)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.5D, 0.5D)
            .temperatureTolerance(0.4D, 0.6D)
            .downfallOptimum(0.5D, 0.5D)
            .downfallTolerance(0.4D, 0.6D)
            .build();
    public static Group DWARF_AZALEA = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_AZALEA)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.4D, 0.6D)
            .temperatureTolerance(0.2D, 0.8D)
            .downfallOptimum(0.4D, 0.6D)
            .downfallTolerance(0.2D, 0.8D)
            .build();
    public static Group SHRUB_AZALEA = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SHRUB_AZALEA)
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION)
            .elevationOptimum(32, 191)
            .elevationTolerance(0, 255)
            .brightnessOptimum(4, 12)
            .brightnessTolerance(0, 16)
            .temperatureOptimum(0.2D, 0.8D)
            .temperatureTolerance(-0.2D, 1.2D)
            .downfallOptimum(0.2D, 0.8D)
            .downfallTolerance(-0.2D, 1.2D)
            .build();

}