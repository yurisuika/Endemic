package dev.yurisuika.endemic.world.level.sapling.group;

import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.dimension.DimensionType;

public class Groups {

    public static Group SWAMP_OAK = new Group.Builder(
            new Group.Entry.Builder("minecraft:swamp_oak")
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.SWAMP.location(),
                    Biomes.SWAMP_HILLS.location())
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
            new Group.Entry.Builder("minecraft:fancy_oak")
                    .build(),
            new Group.Entry.Builder("minecraft:fancy_oak_bees_005")
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeBlacklist(Biomes.SWAMP.location(),
                    Biomes.SWAMP_HILLS.location())
            .biomeWhitelist(Biomes.BAMBOO_JUNGLE.location(),
                    Biomes.BAMBOO_JUNGLE_HILLS.location(),
                    Biomes.COLD_OCEAN.location(),
                    Biomes.DARK_FOREST.location(),
                    Biomes.DEEP_COLD_OCEAN.location(),
                    Biomes.DEEP_FROZEN_OCEAN.location(),
                    Biomes.DEEP_LUKEWARM_OCEAN.location(),
                    Biomes.DEEP_OCEAN.location(),
                    Biomes.DEEP_WARM_OCEAN.location(),
                    Biomes.FLOWER_FOREST.location(),
                    Biomes.FOREST.location(),
                    Biomes.FROZEN_OCEAN.location(),
                    Biomes.FROZEN_RIVER.location(),
                    Biomes.GRAVELLY_MOUNTAINS.location(),
                    Biomes.JUNGLE.location(),
                    Biomes.JUNGLE_EDGE.location(),
                    Biomes.JUNGLE_HILLS.location(),
                    Biomes.LUKEWARM_OCEAN.location(),
                    Biomes.MODIFIED_GRAVELLY_MOUNTAINS.location(),
                    Biomes.MODIFIED_JUNGLE.location(),
                    Biomes.MODIFIED_JUNGLE_EDGE.location(),
                    Biomes.MOUNTAINS.location(),
                    Biomes.MOUNTAIN_EDGE.location(),
                    Biomes.OCEAN.location(),
                    Biomes.PLAINS.location(),
                    Biomes.RIVER.location(),
                    Biomes.SUNFLOWER_PLAINS.location(),
                    Biomes.WARM_OCEAN.location(),
                    Biomes.WOODED_HILLS.location(),
                    Biomes.WOODED_MOUNTAINS.location())
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
            new Group.Entry.Builder("minecraft:oak")
                    .build(),
            new Group.Entry.Builder("minecraft:oak_bees_005")
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeBlacklist(Biomes.SWAMP.location(),
                    Biomes.SWAMP_HILLS.location())
            .biomeWhitelist(Biomes.COLD_OCEAN.location(),
                    Biomes.DARK_FOREST.location(),
                    Biomes.DEEP_COLD_OCEAN.location(),
                    Biomes.DEEP_FROZEN_OCEAN.location(),
                    Biomes.DEEP_LUKEWARM_OCEAN.location(),
                    Biomes.DEEP_OCEAN.location(),
                    Biomes.DEEP_WARM_OCEAN.location(),
                    Biomes.FLOWER_FOREST.location(),
                    Biomes.FOREST.location(),
                    Biomes.FROZEN_OCEAN.location(),
                    Biomes.FROZEN_RIVER.location(),
                    Biomes.GRAVELLY_MOUNTAINS.location(),
                    Biomes.LUKEWARM_OCEAN.location(),
                    Biomes.MODIFIED_GRAVELLY_MOUNTAINS.location(),
                    Biomes.MODIFIED_WOODED_BADLANDS_PLATEAU.location(),
                    Biomes.MOUNTAINS.location(),
                    Biomes.MOUNTAIN_EDGE.location(),
                    Biomes.OCEAN.location(),
                    Biomes.PLAINS.location(),
                    Biomes.RIVER.location(),
                    Biomes.SAVANNA.location(),
                    Biomes.SAVANNA_PLATEAU.location(),
                    Biomes.SHATTERED_SAVANNA.location(),
                    Biomes.SHATTERED_SAVANNA_PLATEAU.location(),
                    Biomes.SUNFLOWER_PLAINS.location(),
                    Biomes.WARM_OCEAN.location(),
                    Biomes.WOODED_BADLANDS_PLATEAU.location(),
                    Biomes.WOODED_HILLS.location(),
                    Biomes.WOODED_MOUNTAINS.location())
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
            new Group.Entry.Builder("endemic:stunted_swamp_oak")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.SWAMP.location(),
                    Biomes.SWAMP_HILLS.location())
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
            new Group.Entry.Builder("endemic:stunted_fancy_oak")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeBlacklist(Biomes.SWAMP.location(),
                    Biomes.SWAMP_HILLS.location())
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
            new Group.Entry.Builder("endemic:stunted_oak")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeBlacklist(Biomes.SWAMP.location(),
                    Biomes.SWAMP_HILLS.location())
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
            new Group.Entry.Builder("endemic:oak_shrub")
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("minecraft:mega_pine")
                    .requiresAdjacentSaplings()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.GIANT_TREE_TAIGA.location(),
                    Biomes.GIANT_TREE_TAIGA_HILLS.location())
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
            new Group.Entry.Builder("minecraft:mega_spruce")
                    .requiresAdjacentSaplings()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.GIANT_SPRUCE_TAIGA.location(),
                    Biomes.GIANT_SPRUCE_TAIGA_HILLS.location(),
                    Biomes.GIANT_TREE_TAIGA.location(),
                    Biomes.GIANT_TREE_TAIGA_HILLS.location())
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
            new Group.Entry.Builder("minecraft:pine")
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.GIANT_SPRUCE_TAIGA.location(),
                    Biomes.GIANT_SPRUCE_TAIGA_HILLS.location(),
                    Biomes.GIANT_TREE_TAIGA.location(),
                    Biomes.GIANT_TREE_TAIGA_HILLS.location(),
                    Biomes.SNOWY_TAIGA.location(),
                    Biomes.SNOWY_TAIGA_HILLS.location(),
                    Biomes.SNOWY_TAIGA_MOUNTAINS.location(),
                    Biomes.TAIGA.location(),
                    Biomes.TAIGA_HILLS.location(),
                    Biomes.TAIGA_MOUNTAINS.location())
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
            new Group.Entry.Builder("minecraft:spruce")
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.FROZEN_RIVER.location(),
                    Biomes.GIANT_SPRUCE_TAIGA.location(),
                    Biomes.GIANT_SPRUCE_TAIGA_HILLS.location(),
                    Biomes.GIANT_TREE_TAIGA.location(),
                    Biomes.GIANT_TREE_TAIGA_HILLS.location(),
                    Biomes.GRAVELLY_MOUNTAINS.location(),
                    Biomes.MODIFIED_GRAVELLY_MOUNTAINS.location(),
                    Biomes.MOUNTAINS.location(),
                    Biomes.MOUNTAIN_EDGE.location(),
                    Biomes.SNOWY_MOUNTAINS.location(),
                    Biomes.SNOWY_TAIGA.location(),
                    Biomes.SNOWY_TAIGA_HILLS.location(),
                    Biomes.SNOWY_TAIGA_MOUNTAINS.location(),
                    Biomes.SNOWY_TUNDRA.location(),
                    Biomes.TAIGA.location(),
                    Biomes.TAIGA_HILLS.location(),
                    Biomes.TAIGA_MOUNTAINS.location(),
                    Biomes.WOODED_MOUNTAINS.location())
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
            new Group.Entry.Builder("endemic:stunted_mega_pine")
                    .requiresAdjacentSaplings()
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("endemic:stunted_mega_spruce")
                    .requiresAdjacentSaplings()
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("endemic:stunted_pine")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("endemic:stunted_spruce")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("endemic:spruce_shrub")
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("minecraft:super_birch_bees_0002")
                    .build(),
            new Group.Entry.Builder("minecraft:super_birch_bees")
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.TALL_BIRCH_FOREST.location(),
                    Biomes.TALL_BIRCH_HILLS.location())
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
            new Group.Entry.Builder("minecraft:birch")
                    .build(),
            new Group.Entry.Builder("minecraft:birch_bees_005")
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.BIRCH_FOREST.location(),
                    Biomes.BIRCH_FOREST_HILLS.location(),
                    Biomes.DARK_FOREST.location(),
                    Biomes.DARK_FOREST_HILLS.location(),
                    Biomes.FLOWER_FOREST.location(),
                    Biomes.FOREST.location(),
                    Biomes.MOUNTAINS.location(),
                    Biomes.MOUNTAIN_EDGE.location(),
                    Biomes.TALL_BIRCH_FOREST.location(),
                    Biomes.TALL_BIRCH_HILLS.location(),
                    Biomes.WOODED_HILLS.location(),
                    Biomes.WOODED_MOUNTAINS.location())
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
            new Group.Entry.Builder("endemic:stunted_super_birch")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("endemic:stunted_birch")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("endemic:birch_shrub")
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("minecraft:mega_jungle_tree")
                    .requiresAdjacentSaplings()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.BAMBOO_JUNGLE.location(),
                    Biomes.BAMBOO_JUNGLE_HILLS.location(),
                    Biomes.JUNGLE.location(),
                    Biomes.JUNGLE_HILLS.location(),
                    Biomes.MODIFIED_JUNGLE.location())
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
            new Group.Entry.Builder("minecraft:jungle_tree")
                    .build(),
            new Group.Entry.Builder("minecraft:jungle_tree_no_vine")
                    .weight(0.1D)
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.JUNGLE.location(),
                    Biomes.JUNGLE_EDGE.location(),
                    Biomes.JUNGLE_HILLS.location(),
                    Biomes.MODIFIED_JUNGLE.location(),
                    Biomes.MODIFIED_JUNGLE_EDGE.location())
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
            new Group.Entry.Builder("endemic:stunted_mega_jungle")
                    .requiresAdjacentSaplings()
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("endemic:stunted_jungle")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("endemic:jungle_shrub")
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("minecraft:acacia")
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.SAVANNA.location(),
                    Biomes.SAVANNA_PLATEAU.location(),
                    Biomes.SHATTERED_SAVANNA.location(),
                    Biomes.SHATTERED_SAVANNA_PLATEAU.location())
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
            new Group.Entry.Builder("endemic:stunted_acacia")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("endemic:acacia_shrub")
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("minecraft:dark_oak")
                    .requiresAdjacentSaplings()
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.DARK_FOREST.location(),
                    Biomes.DARK_FOREST_HILLS.location())
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
            new Group.Entry.Builder("endemic:stunted_dark_oak")
                    .requiresAdjacentSaplings()
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("endemic:dark_oak_shrub")
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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
            new Group.Entry.Builder("minecraft:azalea_tree")
                    .build())
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .biomeWhitelist(Biomes.LUSH_CAVES.location())
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.5D, 0.5D)
            .temperatureTolerance(0.4D, 0.6D)
            .downfallOptimum(0.5D, 0.5D)
            .downfallTolerance(0.4D, 0.6D)
            .build();
    public static Group STUNTED_AZALEA = new Group.Builder(
            new Group.Entry.Builder("endemic:stunted_azalea")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.4D, 0.6D)
            .temperatureTolerance(0.2D, 0.8D)
            .downfallOptimum(0.4D, 0.6D)
            .downfallTolerance(0.2D, 0.8D)
            .build();
    public static Group AZALEA_SHRUB = new Group.Builder(
            new Group.Entry.Builder("endemic:azalea_shrub")
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(DimensionType.OVERWORLD_LOCATION.location())
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