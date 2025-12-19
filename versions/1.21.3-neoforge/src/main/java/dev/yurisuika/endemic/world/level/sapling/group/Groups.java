package dev.yurisuika.endemic.world.level.sapling.group;

import dev.yurisuika.endemic.data.worldgen.features.EndemicTreeFeatures;
import net.minecraft.data.worldgen.WinterDropBiomes;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;

public class Groups {

    public static Group SWAMP_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SWAMP_OAK)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.SWAMP_OAK_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.SWAMP,
                    Biomes.MANGROVE_SWAMP)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeBlacklist(Biomes.SWAMP,
                    Biomes.MANGROVE_SWAMP)
            .biomeWhitelist(Biomes.BAMBOO_JUNGLE,
                    Biomes.COLD_OCEAN,
                    Biomes.DARK_FOREST,
                    Biomes.DEEP_COLD_OCEAN,
                    Biomes.DEEP_FROZEN_OCEAN,
                    Biomes.DEEP_LUKEWARM_OCEAN,
                    Biomes.DEEP_OCEAN,
                    Biomes.FLOWER_FOREST,
                    Biomes.FOREST,
                    Biomes.FROZEN_OCEAN,
                    Biomes.FROZEN_RIVER,
                    Biomes.JUNGLE,
                    Biomes.LUKEWARM_OCEAN,
                    Biomes.MEADOW,
                    Biomes.OCEAN,
                    Biomes.PLAINS,
                    Biomes.RIVER,
                    Biomes.SNOWY_PLAINS,
                    Biomes.SPARSE_JUNGLE,
                    Biomes.SUNFLOWER_PLAINS,
                    Biomes.WARM_OCEAN,
                    Biomes.WINDSWEPT_FOREST,
                    Biomes.WINDSWEPT_GRAVELLY_HILLS,
                    Biomes.WINDSWEPT_HILLS)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeBlacklist(Biomes.SWAMP,
                    Biomes.MANGROVE_SWAMP)
            .biomeWhitelist(Biomes.COLD_OCEAN,
                    Biomes.DARK_FOREST,
                    Biomes.DEEP_COLD_OCEAN,
                    Biomes.DEEP_FROZEN_OCEAN,
                    Biomes.DEEP_LUKEWARM_OCEAN,
                    Biomes.DEEP_OCEAN,
                    Biomes.FLOWER_FOREST,
                    Biomes.FOREST,
                    Biomes.FROZEN_OCEAN,
                    Biomes.FROZEN_RIVER,
                    Biomes.LUKEWARM_OCEAN,
                    Biomes.MEADOW,
                    Biomes.OCEAN,
                    Biomes.PLAINS,
                    Biomes.RIVER,
                    Biomes.SAVANNA,
                    Biomes.SAVANNA_PLATEAU,
                    Biomes.SNOWY_PLAINS,
                    Biomes.SUNFLOWER_PLAINS,
                    Biomes.WARM_OCEAN,
                    Biomes.WINDSWEPT_FOREST,
                    Biomes.WINDSWEPT_GRAVELLY_HILLS,
                    Biomes.WINDSWEPT_HILLS,
                    Biomes.WINDSWEPT_SAVANNA,
                    Biomes.WOODED_BADLANDS)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.SWAMP,
                    Biomes.MANGROVE_SWAMP)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeBlacklist(Biomes.SWAMP,
                    Biomes.MANGROVE_SWAMP)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeBlacklist(Biomes.SWAMP,
                    Biomes.MANGROVE_SWAMP)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.OLD_GROWTH_PINE_TAIGA)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.OLD_GROWTH_PINE_TAIGA,
                    Biomes.OLD_GROWTH_SPRUCE_TAIGA)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.GROVE,
                    Biomes.OLD_GROWTH_PINE_TAIGA,
                    Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                    Biomes.SNOWY_SLOPES,
                    Biomes.SNOWY_TAIGA,
                    Biomes.TAIGA)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.GROVE,
                    Biomes.OLD_GROWTH_PINE_TAIGA,
                    Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                    Biomes.FROZEN_RIVER,
                    Biomes.SNOWY_PLAINS,
                    Biomes.SNOWY_SLOPES,
                    Biomes.SNOWY_TAIGA,
                    Biomes.TAIGA,
                    Biomes.WINDSWEPT_FOREST,
                    Biomes.WINDSWEPT_GRAVELLY_HILLS,
                    Biomes.WINDSWEPT_HILLS)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.MEADOW,
                    Biomes.OLD_GROWTH_BIRCH_FOREST)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.BIRCH_FOREST,
                    Biomes.DARK_FOREST,
                    Biomes.FLOWER_FOREST,
                    Biomes.FOREST,
                    Biomes.OLD_GROWTH_BIRCH_FOREST,
                    Biomes.WINDSWEPT_FOREST,
                    Biomes.WINDSWEPT_HILLS)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.BAMBOO_JUNGLE,
                    Biomes.JUNGLE)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.BAMBOO_JUNGLE,
                    Biomes.JUNGLE,
                    Biomes.SPARSE_JUNGLE)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.SAVANNA,
                    Biomes.SAVANNA_PLATEAU,
                    Biomes.WINDSWEPT_SAVANNA)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.DARK_FOREST)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .elevationOptimum(32, 191)
            .elevationTolerance(0, 255)
            .brightnessOptimum(4, 12)
            .brightnessTolerance(0, 16)
            .temperatureOptimum(0.2D, 0.8D)
            .temperatureTolerance(-0.2D, 1.2D)
            .downfallOptimum(0.2D, 0.8D)
            .downfallTolerance(-0.2D, 1.2D)
            .build();

    public static Group TALL_MANGROVE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.TALL_MANGROVE)
                    .weight(0.85D)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.TALL_MANGROVE_WITH_BEE_NEST)
                    .weight(0.85D * 0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.MANGROVE_SWAMP)
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
            new Group.Entry.Builder(EndemicTreeFeatures.MANGROVE)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.MANGROVE_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.MANGROVE_SWAMP)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.8D, 0.8D)
            .temperatureTolerance(0.7D, 0.9D)
            .downfallOptimum(0.9D, 0.9D)
            .downfallTolerance(0.8D, 1.0D)
            .build();
    public static Group DWARF_TALL_MANGROVE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_TALL_MANGROVE)
                    .weight(0.85D)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.7D, 0.9D)
            .temperatureTolerance(0.5D, 1.1D)
            .downfallOptimum(0.8D, 1.0D)
            .downfallTolerance(0.6D, 1.2D)
            .build();
    public static Group DWARF_MANGROVE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_MANGROVE)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.7D, 0.9D)
            .temperatureTolerance(0.5D, 1.1D)
            .downfallOptimum(0.8D, 1.0D)
            .downfallTolerance(0.6D, 1.2D)
            .build();
    public static Group SHRUB_MANGROVE = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SHRUB_MANGROVE)
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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
            new Group.Entry.Builder(EndemicTreeFeatures.CHERRY)
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.CHERRY_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .build())
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(Biomes.CHERRY_GROVE)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.5D, 0.5D)
            .temperatureTolerance(0.4D, 0.6D)
            .downfallOptimum(0.8D, 0.8D)
            .downfallTolerance(0.7D, 0.9D)
            .build();
    public static Group DWARF_CHERRY = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_CHERRY)
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.4D, 0.6D)
            .temperatureTolerance(0.2D, 0.8D)
            .downfallOptimum(0.7D, 0.9D)
            .downfallTolerance(0.5D, 1.1D)
            .build();
    public static Group SHRUB_CHERRY = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SHRUB_CHERRY)
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .elevationOptimum(32, 191)
            .elevationTolerance(0, 255)
            .brightnessOptimum(4, 12)
            .brightnessTolerance(0, 16)
            .temperatureOptimum(0.2D, 0.8D)
            .temperatureTolerance(-0.2D, 1.2D)
            .downfallOptimum(0.5D, 1.1D)
            .downfallTolerance(0.1D, 1.5D)
            .build();

    public static Group CREAKING_PALE_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.CREAKING_PALE_OAK)
                    .weight(0.01D)
                    .requiresAdjacentSaplings()
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.CREAKING_PALE_OAK_WITH_BEE_NEST)
                    .weight(0.01D * 0.05D)
                    .requiresFlowersNearby()
                    .requiresAdjacentSaplings()
                    .build())
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(WinterDropBiomes.PALE_GARDEN)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.7D, 0.7D)
            .temperatureTolerance(0.6D, 0.8D)
            .downfallOptimum(0.8D, 0.8D)
            .downfallTolerance(0.7D, 0.9D)
            .build();
    public static Group PALE_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.PALE_OAK)
                    .requiresAdjacentSaplings()
                    .build(),
            new Group.Entry.Builder(EndemicTreeFeatures.PALE_OAK_WITH_BEE_NEST)
                    .weight(0.05D)
                    .requiresFlowersNearby()
                    .requiresAdjacentSaplings()
                    .build())
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .biomeWhitelist(WinterDropBiomes.PALE_GARDEN)
            .elevationOptimum(56, 95)
            .elevationTolerance(48, 127)
            .brightnessOptimum(15, 15)
            .brightnessTolerance(14, 16)
            .temperatureOptimum(0.7D, 0.7D)
            .temperatureTolerance(0.6D, 0.8D)
            .downfallOptimum(0.8D, 0.8D)
            .downfallTolerance(0.7D, 0.9D)
            .build();
    public static Group DWARF_CREAKING_PALE_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_CREAKING_PALE_OAK)
                    .weight(0.01D)
                    .requiresAdjacentSaplings()
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.6D, 0.8D)
            .temperatureTolerance(0.4D, 1.0D)
            .downfallOptimum(0.7D, 0.9D)
            .downfallTolerance(0.5D, 1.1D)
            .build();
    public static Group DWARF_PALE_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.DWARF_PALE_OAK)
                    .requiresAdjacentSaplings()
                    .build())
            .weight(0.5D)
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
            .elevationOptimum(48, 127)
            .elevationTolerance(32, 191)
            .brightnessOptimum(13, 14)
            .brightnessTolerance(11, 16)
            .temperatureOptimum(0.6D, 0.8D)
            .temperatureTolerance(0.4D, 1.0D)
            .downfallOptimum(0.7D, 0.9D)
            .downfallTolerance(0.5D, 1.1D)
            .build();
    public static Group SHRUB_PALE_OAK = new Group.Builder(
            new Group.Entry.Builder(EndemicTreeFeatures.SHRUB_PALE_OAK)
                    .build())
            .weight(0.25D)
            .dimensionWhitelist(BuiltinDimensionTypes.OVERWORLD)
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