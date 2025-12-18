package dev.yurisuika.endemic.world.level.sapling.group;

public class Groups {

    public static Group SWAMP_OAK = new Group.Builder(
            new Group.Entry.Builder("minecraft:swamp_oak")
                    .build())
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:swamp",
                    "minecraft:mangrove_swamp")
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
                    "minecraft:mangrove_swamp")
            .biomeWhitelist("minecraft:bamboo_jungle",
                    "minecraft:cold_ocean",
                    "minecraft:dark_forest",
                    "minecraft:deep_cold_ocean",
                    "minecraft:deep_frozen_ocean",
                    "minecraft:deep_lukewarm_ocean",
                    "minecraft:deep_ocean",
                    "minecraft:flower_forest",
                    "minecraft:forest",
                    "minecraft:frozen_ocean",
                    "minecraft:frozen_river",
                    "minecraft:jungle",
                    "minecraft:lukewarm_ocean",
                    "minecraft:meadow",
                    "minecraft:ocean",
                    "minecraft:plains",
                    "minecraft:river",
                    "minecraft:snowy_plains",
                    "minecraft:sparse_jungle",
                    "minecraft:sunflower_plains",
                    "minecraft:warm_ocean",
                    "minecraft:windswept_forest",
                    "minecraft:windswept_gravelly_hills",
                    "minecraft:windswept_hills")
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
                    "minecraft:mangrove_swamp")
            .biomeWhitelist("minecraft:cold_ocean",
                    "minecraft:dark_forest",
                    "minecraft:deep_cold_ocean",
                    "minecraft:deep_frozen_ocean",
                    "minecraft:deep_lukewarm_ocean",
                    "minecraft:deep_ocean",
                    "minecraft:flower_forest",
                    "minecraft:forest",
                    "minecraft:frozen_ocean",
                    "minecraft:frozen_river",
                    "minecraft:lukewarm_ocean",
                    "minecraft:meadow",
                    "minecraft:ocean",
                    "minecraft:plains",
                    "minecraft:river",
                    "minecraft:savanna",
                    "minecraft:savanna_plateau",
                    "minecraft:snowy_plains",
                    "minecraft:sunflower_plains",
                    "minecraft:warm_ocean",
                    "minecraft:windswept_forest",
                    "minecraft:windswept_gravelly_hills",
                    "minecraft:windswept_hills",
                    "minecraft:windswept_savanna",
                    "minecraft:wooded_badlands")
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
                    "minecraft:mangrove_swamp")
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
                    "minecraft:mangrove_swamp")
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
                    "minecraft:mangrove_swamp")
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
            .biomeWhitelist("minecraft:old_growth_pine_taiga")
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
            .biomeWhitelist("minecraft:old_growth_pine_taiga",
                    "minecraft:old_growth_spruce_taiga")
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
            .biomeWhitelist("minecraft:grove",
                    "minecraft:old_growth_pine_taiga",
                    "minecraft:old_growth_spruce_taiga",
                    "minecraft:snowy_slopes",
                    "minecraft:snowy_taiga",
                    "minecraft:taiga")
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
            .biomeWhitelist("minecraft:grove",
                    "minecraft:old_growth_pine_taiga",
                    "minecraft:old_growth_spruce_taiga",
                    "minecraft:frozen_river",
                    "minecraft:snowy_plains",
                    "minecraft:snowy_slopes",
                    "minecraft:snowy_taiga",
                    "minecraft:taiga",
                    "minecraft:windswept_forest",
                    "minecraft:windswept_gravelly_hills",
                    "minecraft:windswept_hills")
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
                    "minecraft:old_growth_birch_forest")
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
                    "minecraft:dark_forest",
                    "minecraft:flower_forest",
                    "minecraft:forest",
                    "minecraft:old_growth_birch_forest",
                    "minecraft:windswept_forest",
                    "minecraft:windswept_hills")
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
                    "minecraft:jungle")
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
            .biomeWhitelist("minecraft:bamboo_jungle",
                    "minecraft:jungle",
                    "minecraft:sparse_jungle")
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
                    "minecraft:windswept_savanna")
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
            .biomeWhitelist("minecraft:dark_forest")
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
    public static Group TALL_MANGROVE = new Group.Builder(
            new Group.Entry.Builder("minecraft:tall_mangrove")
                    .weight(0.85D)
                    .build())
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:mangrove_swamp")
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.8D, 0.8D)
            .temperatureTolerance(0.7D, 0.9D)
            .downfallOptimum(0.9D, 0.9D)
            .downfallTolerance(0.8D, 1.0D)
            .build();
    public static Group MANGROVE = new Group.Builder(
            new Group.Entry.Builder("minecraft:mangrove")
                    .build())
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:mangrove_swamp")
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.8D, 0.8D)
            .temperatureTolerance(0.7D, 0.9D)
            .downfallOptimum(0.9D, 0.9D)
            .downfallTolerance(0.8D, 1.0D)
            .build();
    public static Group STUNTED_TALL_MANGROVE = new Group.Builder(
            new Group.Entry.Builder("endemic:stunted_tall_mangrove")
                    .weight(0.85D)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist("minecraft:overworld")
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.7D, 0.9D)
            .temperatureTolerance(0.5D, 1.1D)
            .downfallOptimum(0.8D, 1.0D)
            .downfallTolerance(0.6D, 1.2D)
            .build();
    public static Group STUNTED_MANGROVE = new Group.Builder(
            new Group.Entry.Builder("endemic:stunted_mangrove")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist("minecraft:overworld")
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.7D, 0.9D)
            .temperatureTolerance(0.5D, 1.1D)
            .downfallOptimum(0.8D, 1.0D)
            .downfallTolerance(0.6D, 1.2D)
            .build();
    public static Group MANGROVE_SHRUB = new Group.Builder(
            new Group.Entry.Builder("endemic:mangrove_shrub")
                    .build())
            .weight(0.25D)
            .dimensionWhitelist("minecraft:overworld")
            .elevationOptimum(32, 191)
            .elevationTolerance(0, 255)
            .brightnessOptimum(4, 12)
            .brightnessTolerance(0, 16)
            .temperatureOptimum(0.5D, 1.1D)
            .temperatureTolerance(0.1D, 1.5D)
            .downfallOptimum(0.6D, 1.2D)
            .downfallTolerance(0.2D, 1.6D)
            .build();
    public static Group CHERRY = new Group.Builder(
            new Group.Entry.Builder("minecraft:cherry")
                    .build())
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:cherry_grove")
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.5D, 0.5D)
            .temperatureTolerance(0.4D, 0.6D)
            .downfallOptimum(0.8D, 0.8D)
            .downfallTolerance(0.7D, 0.9D)
            .build();
    public static Group STUNTED_CHERRY = new Group.Builder(
            new Group.Entry.Builder("endemic:stunted_cherry")
                    .build())
            .weight(0.5D)
            .dimensionWhitelist("minecraft:overworld")
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.4D, 0.6D)
            .temperatureTolerance(0.2D, 0.8D)
            .downfallOptimum(0.7D, 0.9D)
            .downfallTolerance(0.5D, 1.1D)
            .build();
    public static Group CHERRY_SHRUB = new Group.Builder(
            new Group.Entry.Builder("endemic:cherry_shrub")
                    .build())
            .weight(0.25D)
            .dimensionWhitelist("minecraft:overworld")
            .elevationOptimum(32, 191)
            .elevationTolerance(0, 255)
            .brightnessOptimum(4, 12)
            .brightnessTolerance(0, 16)
            .temperatureOptimum(0.2D, 0.8D)
            .temperatureTolerance(-0.2D, 1.2D)
            .downfallOptimum(0.5D, 1.1D)
            .downfallTolerance(0.1D, 1.5D)
            .build();
    public static Group AZALEA = new Group.Builder(
            new Group.Entry.Builder("minecraft:azalea_tree")
                    .build())
            .dimensionWhitelist("minecraft:overworld")
            .biomeWhitelist("minecraft:lush_caves")
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
            .dimensionWhitelist("minecraft:overworld")
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
            .dimensionWhitelist("minecraft:overworld")
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