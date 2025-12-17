package dev.yurisuika.endemic.world.level;

import java.util.Arrays;

public class Groups {

    public static Group SWAMP_OAK = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:swamp"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.8D, 0.8D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.7D, 0.9D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.9D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.8D, 1.0D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:swamp_oak",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group FANCY_OAK = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(
                                    "minecraft:swamp"
                            ),
                            Arrays.asList(
                                    "minecraft:bamboo_jungle",
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
                                    "minecraft:windswept_hills"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.0D, 0.95D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.1D, 1.05D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.3D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.2D, 1.0D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:fancy_oak",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    ),
                    new Group.Entry(
                            "minecraft:fancy_oak_bees_005",
                            1.0D,
                            new Group.Entry.Neighbors(true, false)
                    )
            )
    );
    public static Group OAK = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(
                                    "minecraft:swamp"
                            ),
                            Arrays.asList(
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
                                    "minecraft:wooded_badlands"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.0D, 2.0D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.1D, 2.1D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.0D, 0.8D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(-0.1D, 0.9D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:oak",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    ),
                    new Group.Entry(
                            "minecraft:oak_bees_005",
                            1.0D,
                            new Group.Entry.Neighbors(true, false)
                    )
            )
    );
    public static Group STUNTED_SWAMP_OAK = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:swamp"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.7D, 0.9D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.5D, 1.1D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.8D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.6D, 1.1D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_swamp_oak",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group STUNTED_FANCY_OAK = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(
                                    "minecraft:swamp"
                            ),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(-0.1D, 1.05D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.3D, 1.25D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.2D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.0D, 1.1D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_fancy_oak",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group STUNTED_OAK = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(
                                    "minecraft:swamp"
                            ),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(-0.1D, 2.1D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.3D, 2.3D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(-0.1D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(-0.3D, 1.1D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_oak",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group OAK_SHRUB = new Group(
            0.25D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(32, 191),
                                    new Group.Conditions.Location.Elevation.Tolerance(0, 255)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(4, 12),
                                    new Group.Conditions.Location.Brightness.Tolerance(0, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(-0.3D, 2.3D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.7D, 2.7D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(-0.3D, 1.1D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(-0.7D, 1.5D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:oak_shrub",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group MEGA_PINE = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:old_growth_pine_taiga"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.3D, 0.3D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.2D, 0.4D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.8D, 0.8D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.7D, 0.9D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:mega_pine",
                            1.0D,
                            new Group.Entry.Neighbors(false, true)
                    )
            )
    );
    public static Group MEGA_SPRUCE = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:old_growth_pine_taiga",
                                    "minecraft:old_growth_spruce_taiga"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.25D, 0.25D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.15D, 0.15D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.8D, 0.8D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.7D, 0.9D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:mega_spruce",
                            1.0D,
                            new Group.Entry.Neighbors(false, true)
                    )
            )
    );
    public static Group PINE = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:grove",
                                    "minecraft:old_growth_pine_taiga",
                                    "minecraft:old_growth_spruce_taiga",
                                    "minecraft:snowy_slopes",
                                    "minecraft:snowy_taiga",
                                    "minecraft:taiga"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(-0.5D, 0.3D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.6D, 0.4D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.4D, 0.8D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.3D, 0.9D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:pine",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group SPRUCE = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:grove",
                                    "minecraft:old_growth_pine_taiga",
                                    "minecraft:old_growth_spruce_taiga",
                                    "minecraft:frozen_river",
                                    "minecraft:snowy_plains",
                                    "minecraft:snowy_slopes",
                                    "minecraft:snowy_taiga",
                                    "minecraft:taiga",
                                    "minecraft:windswept_forest",
                                    "minecraft:windswept_gravelly_hills",
                                    "minecraft:windswept_hills"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(-0.5D, 0.3D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.6D, 0.4D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.4D, 0.8D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.3D, 0.9D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:spruce",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group STUNTED_MEGA_PINE = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.2D, 0.4D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.0D, 0.6D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.7D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.5D, 1.1D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_mega_pine",
                            1.0D,
                            new Group.Entry.Neighbors(false, true)
                    )
            )
    );
    public static Group STUNTED_MEGA_SPRUCE = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.15D, 0.35D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.05D, 0.55D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.7D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.5D, 1.1D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_mega_spruce",
                            1.0D,
                            new Group.Entry.Neighbors(false, true)
                    )
            )
    );
    public static Group STUNTED_PINE = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(-0.6D, 0.4D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.8D, 0.6D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.3D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.1D, 1.1D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_pine",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group STUNTED_SPRUCE = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(-0.6D, 0.4D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.8D, 0.6D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.3D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.1D, 1.1D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_spruce",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group SPRUCE_SHRUB = new Group(
            0.25D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(32, 191),
                                    new Group.Conditions.Location.Elevation.Tolerance(0, 255)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(4, 12),
                                    new Group.Conditions.Location.Brightness.Tolerance(0, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(-0.8D, 0.6D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-1.2D, 1.0D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.1D, 1.1D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(-0.4D, 1.5D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:spruce_shrub",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group SUPER_BIRCH = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:meadow",
                                    "minecraft:old_growth_birch_forest"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.5D, 0.6D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.4D, 0.7D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.6D, 0.8D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.5D, 0.9D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:super_birch_bees_0002",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    ),
                    new Group.Entry(
                            "minecraft:super_birch_bees",
                            1.0D,
                            new Group.Entry.Neighbors(true, false)
                    )
            )
    );
    public static Group BIRCH = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:birch_forest",
                                    "minecraft:dark_forest",
                                    "minecraft:flower_forest",
                                    "minecraft:forest",
                                    "minecraft:old_growth_birch_forest",
                                    "minecraft:windswept_forest",
                                    "minecraft:windswept_hills"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.6D, 0.7D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.5D, 0.8D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.6D, 0.8D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.5D, 0.9D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:birch",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    ),
                    new Group.Entry(
                            "minecraft:birch_bees_005",
                            1.0D,
                            new Group.Entry.Neighbors(true, false)
                    )
            )
    );
    public static Group STUNTED_SUPER_BIRCH = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.4D, 0.7D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.2D, 0.9D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.5D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.3D, 1.1D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_super_birch",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group STUNTED_BIRCH = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.5D, 0.8D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.3D, 1.0D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.5D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.3D, 1.1D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_birch",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group BIRCH_SHRUB = new Group(
            0.25D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(32, 191),
                                    new Group.Conditions.Location.Elevation.Tolerance(0, 255)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(4, 12),
                                    new Group.Conditions.Location.Brightness.Tolerance(0, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.2D, 1.0D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.2D, 1.4D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.3D, 1.1D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(-0.1D, 1.5D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:birch_shrub",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group MEGA_JUNGLE = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:bamboo_jungle",
                                    "minecraft:jungle"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.95D, 0.95D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.85D, 1.05D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.9D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.8D, 1.0D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:mega_jungle_tree",
                            1.0D,
                            new Group.Entry.Neighbors(false, true)
                    )
            )
    );
    public static Group JUNGLE = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:bamboo_jungle",
                                    "minecraft:jungle",
                                    "minecraft:sparse_jungle"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.95D, 0.95D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.85D, 1.05D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.8D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.7D, 1.0D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:jungle_tree",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    ),
                    new Group.Entry(
                            "minecraft:jungle_tree_no_vine",
                            0.1D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group STUNTED_MEGA_JUNGLE = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.85D, 1.05D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.65D, 1.25D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.8D, 1.0D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.6D, 1.2D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_mega_jungle",
                            1.0D,
                            new Group.Entry.Neighbors(false, true)
                    )
            )
    );
    public static Group STUNTED_JUNGLE = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.95D, 1.05D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.65D, 1.25D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.7D, 1.0D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.5D, 1.2D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_jungle",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group JUNGLE_SHRUB = new Group(
            0.25D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(32, 191),
                                    new Group.Conditions.Location.Elevation.Tolerance(0, 255)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(4, 12),
                                    new Group.Conditions.Location.Brightness.Tolerance(0, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.65D, 1.25D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.25D, 1.65D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.5D, 1.2D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.1D, 1.6D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:jungle_shrub",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group ACACIA = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:savanna",
                                    "minecraft:savanna_plateau",
                                    "minecraft:windswept_savanna"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(2.0D, 2.0D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(1.9D, 2.1D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.0D, 0.0D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(-0.1D, 0.1D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:acacia",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group STUNTED_ACACIA = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(1.9D, 2.1D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(1.7D, 2.3D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(-0.1D, 0.1D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(-0.3D, 0.3D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_acacia",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group ACACIA_SHRUB = new Group(
            0.25D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(32, 191),
                                    new Group.Conditions.Location.Elevation.Tolerance(0, 255)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(4, 12),
                                    new Group.Conditions.Location.Brightness.Tolerance(0, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(1.7D, 2.3D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(1.3D, 2.7D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(-0.3D, 0.3D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(-0.7D, 0.7D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:acacia_shrub",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group DARK_OAK = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:dark_forest"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.7D, 0.7D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.6D, 0.8D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.8D, 0.8D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.7D, 0.9D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:dark_oak",
                            1.0D,
                            new Group.Entry.Neighbors(false, true)
                    )
            )
    );
    public static Group STUNTED_DARK_OAK = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.6D, 0.8D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.4D, 1.0D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.7D, 0.9D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.5D, 1.1D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_dark_oak",
                            1.0D,
                            new Group.Entry.Neighbors(false, true)
                    )
            )
    );
    public static Group DARK_OAK_SHRUB = new Group(
            0.25D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(32, 191),
                                    new Group.Conditions.Location.Elevation.Tolerance(0, 255)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(4, 12),
                                    new Group.Conditions.Location.Brightness.Tolerance(0, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.4D, 1.0D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.0D, 1.4D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.5D, 1.1D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.1D, 1.5D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:dark_oak_shrub",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group AZALEA = new Group(
            1.0D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:lush_caves"
                            )
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(56, 95),
                                    new Group.Conditions.Location.Elevation.Tolerance(48, 127)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(15, 15),
                                    new Group.Conditions.Location.Brightness.Tolerance(14, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.5D, 0.5D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.4D, 0.6D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.5D, 0.5D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.4D, 0.6D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "minecraft:azalea_tree",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group STUNTED_AZALEA = new Group(
            0.5D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(48, 127),
                                    new Group.Conditions.Location.Elevation.Tolerance(32, 191)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(13, 14),
                                    new Group.Conditions.Location.Brightness.Tolerance(11, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.4D, 0.6D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(0.2D, 0.8D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.4D, 0.6D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(0.2D, 0.8D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:stunted_azalea",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );
    public static Group AZALEA_SHRUB = new Group(
            0.25D,
            new Group.Region(
                    new Group.Region.Dimensions(
                            Arrays.asList(),
                            Arrays.asList(
                                    "minecraft:overworld"
                            )
                    ),
                    new Group.Region.Biomes(
                            Arrays.asList(),
                            Arrays.asList()
                    )
            ),
            new Group.Conditions(
                    new Group.Conditions.Location(
                            new Group.Conditions.Location.Elevation(
                                    new Group.Conditions.Location.Elevation.Optimum(32, 191),
                                    new Group.Conditions.Location.Elevation.Tolerance(0, 255)
                            ),
                            new Group.Conditions.Location.Brightness(
                                    new Group.Conditions.Location.Brightness.Optimum(4, 12),
                                    new Group.Conditions.Location.Brightness.Tolerance(0, 16)
                            )
                    ),
                    new Group.Conditions.Climate(
                            new Group.Conditions.Climate.Temperature(
                                    new Group.Conditions.Climate.Temperature.Optimum(0.2D, 0.8D),
                                    new Group.Conditions.Climate.Temperature.Tolerance(-0.2D, 1.2D)
                            ),
                            new Group.Conditions.Climate.Downfall(
                                    new Group.Conditions.Climate.Downfall.Optimum(0.2D, 0.8D),
                                    new Group.Conditions.Climate.Downfall.Tolerance(-0.2D, 1.2D)
                            )
                    )
            ),
            Arrays.asList(
                    new Group.Entry(
                            "endemic:azalea_shrub",
                            1.0D,
                            new Group.Entry.Neighbors(false, false)
                    )
            )
    );

}