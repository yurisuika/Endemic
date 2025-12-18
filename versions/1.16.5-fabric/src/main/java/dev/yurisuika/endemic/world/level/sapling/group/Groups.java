package dev.yurisuika.endemic.world.level.sapling.group;

import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.dimension.DimensionType;

public class Groups {

    public static Group SWAMP_OAK = new Group.Builder(
            new Group.Entry.Builder(TreeFeatures.SWAMP_TREE)
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
            new Group.Entry.Builder(TreeFeatures.FANCY_OAK)
                    .build(),
            new Group.Entry.Builder(TreeFeatures.FANCY_OAK_BEES_005)
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
            new Group.Entry.Builder(TreeFeatures.OAK)
                    .build(),
            new Group.Entry.Builder(TreeFeatures.OAK_BEES_005)
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
    public static Group STUNTED_SWAMP_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_SWAMP_OAK)
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
    public static Group STUNTED_FANCY_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_FANCY_OAK)
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
    public static Group STUNTED_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_OAK)
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
    public static Group OAK_SHRUB = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.OAK_SHRUB)
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
    public static Group MEGA_PINE = new Group.Builder(
            new Group.Entry.Builder(TreeFeatures.MEGA_PINE)
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
            new Group.Entry.Builder(TreeFeature.MEGA_SPRUCE)
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
    public static Group PINE = new Group.Builder(
            new Group.Entry.Builder(TreeFeatures.PINE)
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
            new Group.Entry.Builder(TreeFeatures.SPRUCE)
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
    public static Group STUNTED_MEGA_PINE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_MEGA_PINE)
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
    public static Group STUNTED_MEGA_SPRUCE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_MEGA_SPRUCE)
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
    public static Group STUNTED_PINE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_PINE)
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
    public static Group STUNTED_SPRUCE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_SPRUCE)
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
    public static Group SPRUCE_SHRUB = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SPRUCE_SHRUB)
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
    public static Group SUPER_BIRCH = new Group.Builder(
            new Group.Entry.Builder(TreeFeatures.SUPER_BIRCH_BEES_0002)
                    .build(),
            new Group.Entry.Builder(TreeFeatures.SUPER_BIRCH_BEES)
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
            new Group.Entry.Builder(TreeFeatures.BIRCH)
                    .build(),
            new Group.Entry.Builder(TreeFeatures.BIRCH_BEES_005)
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
    public static Group STUNTED_SUPER_BIRCH = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_SUPER_BIRCH)
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
    public static Group STUNTED_BIRCH = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_BIRCH)
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
    public static Group BIRCH_SHRUB = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.BIRCH_SHRUB)
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
            new Group.Entry.Builder(TreeFeatures.MEGA_JUNGLE_TREE)
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
            new Group.Entry.Builder(TreeFeatures.JUNGLE_TREE)
                    .build(),
            new Group.Entry.Builder(TreeFeatures.JUNGLE_TREE_NO_VINE)
                    .weight(0.1D)
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
    public static Group STUNTED_MEGA_JUNGLE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_MEGA_JUNGLE)
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
    public static Group STUNTED_JUNGLE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_JUNGLE)
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
    public static Group JUNGLE_SHRUB = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.JUNGLE_SHRUB)
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
            new Group.Entry.Builder(TreeFeatures.ACACIA)
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
    public static Group STUNTED_ACACIA = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_ACACIA)
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
    public static Group ACACIA_SHRUB = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.ACACIA_SHRUB)
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
            new Group.Entry.Builder(TreeFeatures.DARK_OAK)
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
    public static Group STUNTED_DARK_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.STUNTED_DARK_OAK)
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
    public static Group DARK_OAK_SHRUB = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DARK_OAK_SHRUB)
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

}