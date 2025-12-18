package dev.yurisuika.endemic.world.level.sapling.group;

public class Groups {

    public static Group SWAMP_OAK = new Group.Builder(
            new Group.Entry.Builder("minecraft:swamp_oak")
                    .build())
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:swamp",
                    "minecraft:swamp_hills")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeBlacklist("minecraft:swamp",
                    "minecraft:swamp_hills")
            .biomeWhitelist("minecraft:bamboo_jungle",
                    "minecraft:bamboo_jungle_hills",
                    "minecraft:cold_ocean",
                    "minecraft:dark_forest",
                    "minecraft:deep_cold_ocean",
                    "minecraft:deep_frozen_ocean",
                    "minecraft:deep_lukewarm_ocean",
                    "minecraft:deep_ocean",
                    "minecraft:deep_warm_ocean",
                    "minecraft:flower_forest",
                    "minecraft:forest",
                    "minecraft:frozen_ocean",
                    "minecraft:frozen_river",
                    "minecraft:gravelly_mountains",
                    "minecraft:grove",
                    "minecraft:jungle",
                    "minecraft:jungle_edge",
                    "minecraft:jungle_hills",
                    "minecraft:lukewarm_ocean",
                    "minecraft:meadow",
                    "minecraft:modified_gravelly_mountains",
                    "minecraft:modified_jungle",
                    "minecraft:modified_jungle_edge",
                    "minecraft:mountains",
                    "minecraft:mountain_edge",
                    "minecraft:ocean",
                    "minecraft:plains",
                    "minecraft:river",
                    "minecraft:sunflower_plains",
                    "minecraft:warm_ocean",
                    "minecraft:wooded_hills",
                    "minecraft:wooded_mountains")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeBlacklist("minecraft:swamp",
                    "minecraft:swamp_hills")
            .biomeWhitelist("minecraft:cold_ocean",
                    "minecraft:dark_forest",
                    "minecraft:deep_cold_ocean",
                    "minecraft:deep_frozen_ocean",
                    "minecraft:deep_lukewarm_ocean",
                    "minecraft:deep_ocean",
                    "minecraft:deep_warm_ocean",
                    "minecraft:flower_forest",
                    "minecraft:forest",
                    "minecraft:frozen_ocean",
                    "minecraft:frozen_river",
                    "minecraft:gravelly_mountains",
                    "minecraft:grove",
                    "minecraft:lukewarm_ocean",
                    "minecraft:meadow",
                    "minecraft:modified_gravelly_mountains",
                    "minecraft:modified_wooded_badlands_plateau",
                    "minecraft:mountains",
                    "minecraft:mountain_edge",
                    "minecraft:ocean",
                    "minecraft:plains",
                    "minecraft:river",
                    "minecraft:savanna",
                    "minecraft:savanna_plateau",
                    "minecraft:shattered_savanna",
                    "minecraft:shattered_savanna_plateau",
                    "minecraft:sunflower_plains",
                    "minecraft:warm_ocean",
                    "minecraft:wooded_badlands_plateau",
                    "minecraft:wooded_hills",
                    "minecraft:wooded_mountains")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:swamp",
                    "minecraft:swamp_hills")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeBlacklist("minecraft:swamp",
                    "minecraft:swamp_hills")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeBlacklist("minecraft:swamp",
                    "minecraft:swamp_hills")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:giant_tree_taiga",
                    "minecraft:giant_tree_taiga_hills")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:giant_spruce_taiga",
                    "minecraft:giant_spruce_taiga_hills",
                    "minecraft:giant_tree_taiga",
                    "minecraft:giant_tree_taiga_hills")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:giant_spruce_taiga",
                    "minecraft:giant_spruce_taiga_hills",
                    "minecraft:giant_tree_taiga",
                    "minecraft:giant_tree_taiga_hills",
                    "minecraft:grove",
                    "minecraft:snowy_slopes",
                    "minecraft:snowy_taiga",
                    "minecraft:snowy_taiga_hills",
                    "minecraft:snowy_taiga_mountains",
                    "minecraft:taiga",
                    "minecraft:taiga_hills",
                    "minecraft:taiga_mountains")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:frozen_river",
                    "minecraft:giant_spruce_taiga",
                    "minecraft:giant_spruce_taiga_hills",
                    "minecraft:giant_tree_taiga",
                    "minecraft:giant_tree_taiga_hills",
                    "minecraft:gravelly_mountains",
                    "minecraft:grove",
                    "minecraft:modified_gravelly_mountains",
                    "minecraft:mountains",
                    "minecraft:mountain_edge",
                    "minecraft:snowy_mountains",
                    "minecraft:snowy_slopes",
                    "minecraft:snowy_taiga",
                    "minecraft:snowy_taiga_hills",
                    "minecraft:snowy_taiga_mountains",
                    "minecraft:snowy_tundra",
                    "minecraft:taiga",
                    "minecraft:taiga_hills",
                    "minecraft:taiga_mountains",
                    "minecraft:wooded_mountains")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:meadow",
                    "minecraft:tall_birch_forest",
                    "minecraft:tall_birch_forest_hills")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:birch_forest",
                    "minecraft:birch_forest_hills",
                    "minecraft:dark_forest",
                    "minecraft:dark_forest_hills",
                    "minecraft:flower_forest",
                    "minecraft:forest",
                    "minecraft:mountains",
                    "minecraft:mountain_edge",
                    "minecraft:tall_birch_forest",
                    "minecraft:tall_birch_forest_hills",
                    "minecraft:wooded_hills",
                    "minecraft:wooded_mountains")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:bamboo_jungle",
                    "minecraft:bamboo_jungle_hills",
                    "minecraft:jungle",
                    "minecraft:jungle_hills",
                    "minecraft:modified_jungle")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:jungle",
                    "minecraft:jungle_edge",
                    "minecraft:jungle_hills",
                    "minecraft:modified_jungle",
                    "minecraft:modified_jungle_edge")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:savanna",
                    "minecraft:savanna_plateau",
                    "minecraft:shattered_savanna",
                    "minecraft:shattered_savanna_plateau")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:dark_forest",
                    "minecraft:dark_forest_hills")
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
                    .build())
            .weight(0.5D)
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
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