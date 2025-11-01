package dev.yurisuika.endemic.config;

import dev.yurisuika.endemic.world.level.Seed;

import java.util.Arrays;
import java.util.TreeMap;

public class Options {

    public TreeMap<String, Seed[]> saplings = new TreeMap<String, Seed[]>() {
        {
            put("minecraft:oak_sapling", new Seed[] {
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:swamp",
                                                    "minecraft:swamp_hills"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:swamp_oak",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:gravelly_mountains",
                                                    "minecraft:grove",
                                                    "minecraft:meadow",
                                                    "minecraft:modified_gravelly_mountains",
                                                    "minecraft:modified_wooded_badlands_plateau",
                                                    "minecraft:mountains",
                                                    "minecraft:mountain_edge",
                                                    "minecraft:plains",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:wooded_badlands_plateau",
                                                    "minecraft:wooded_hills",
                                                    "minecraft:wooded_mountains"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:oak",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:oak_bees_005",
                                    100,
                                    new Seed.Entry.Proximity(true, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:fancy_oak",
                                    10,
                                    new Seed.Entry.Proximity(false, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:fancy_oak_bees_005",
                                    10,
                                    new Seed.Entry.Proximity(true, false)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:bamboo_jungle_hills",
                                                    "minecraft:jungle",
                                                    "minecraft:jungle_edge",
                                                    "minecraft:jungle_hills",
                                                    "minecraft:modified_jungle",
                                                    "minecraft:modified_jungle_edge"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:fancy_oak",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:fancy_oak_bees_005",
                                    100,
                                    new Seed.Entry.Proximity(true, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:jungle_bush",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:badlands",
                                                    "minecraft:badlands_plateau",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:birch_forest_hills",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:dark_forest_hills",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:deep_warm_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:desert_hills",
                                                    "minecraft:desert_lakes",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:giant_spruce_taiga",
                                                    "minecraft:giant_spruce_taiga_hills",
                                                    "minecraft:giant_tree_taiga",
                                                    "minecraft:giant_tree_taiga_hills",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:modified_badlands_plateau",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:mushroom_field_shore",
                                                    "minecraft:ocean",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:shattered_savanna",
                                                    "minecraft:shattered_savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_mountains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:snowy_taiga_hills",
                                                    "minecraft:snowy_taiga_mountains",
                                                    "minecraft:snowy_tundra",
                                                    "minecraft:stone_shore",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:taiga",
                                                    "minecraft:taiga_hills",
                                                    "minecraft:taiga_mountains",
                                                    "minecraft:tall_birch_forest",
                                                    "minecraft:tall_birch_forest_hills",
                                                    "minecraft:warm_ocean"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "endemic:oak_bush",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    )
            });
            put("minecraft:spruce_sapling", new Seed[] {
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:giant_tree_taiga",
                                                    "minecraft:giant_tree_taiga_hills"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:mega_pine",
                                    100,
                                    new Seed.Entry.Proximity(false, true)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:giant_spruce_taiga",
                                                    "minecraft:giant_spruce_taiga_hills",
                                                    "minecraft:giant_tree_taiga",
                                                    "minecraft:giant_tree_taiga_hills"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:mega_spruce",
                                    100,
                                    new Seed.Entry.Proximity(false, true)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:frozen_river",
                                                    "minecraft:gravelly_mountains",
                                                    "minecraft:modified_gravelly_mountains",
                                                    "minecraft:mountains",
                                                    "minecraft:mountain_edge",
                                                    "minecraft:snowy_mountains",
                                                    "minecraft:snowy_tundra",
                                                    "minecraft:wooded_mountains"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:spruce",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:giant_spruce_taiga",
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
                                                    "minecraft:taiga_mountains"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:spruce",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:pine",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:badlands",
                                                    "minecraft:badlands_plateau",
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:bamboo_jungle_hills",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:birch_forest_hills",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:dark_forest_hills",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:deep_warm_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:desert_hills",
                                                    "minecraft:desert_lakes",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:jungle_edge",
                                                    "minecraft:jungle_hills",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:meadow",
                                                    "minecraft:modified_badlands_plateau",
                                                    "minecraft:modified_jungle",
                                                    "minecraft:modified_jungle_edge",
                                                    "minecraft:modified_wooded_badlands_plateau",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:mushroom_field_shore",
                                                    "minecraft:ocean",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:shattered_savanna",
                                                    "minecraft:shattered_savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:stone_shore",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:swamp_hills",
                                                    "minecraft:tall_birch_forest",
                                                    "minecraft:tall_birch_forest_hills",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:wooded_badlands_plateau",
                                                    "minecraft:wooded_hills"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "endemic:spruce_bush",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    )
            });
            put("minecraft:birch_sapling", new Seed[] {
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:meadow",
                                                    "minecraft:tall_birch_forest",
                                                    "minecraft:tall_birch_forest_hills"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:birch_bees_005",
                                    100,
                                    new Seed.Entry.Proximity(true, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:birch_bees_0002",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:super_birch_bees_0002",
                                    50,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:birch_forest",
                                                    "minecraft:birch_forest_hills",
                                                    "minecraft:dark_forest",
                                                    "minecraft:dark_forest_hills",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:mountains",
                                                    "minecraft:mountain_edge",
                                                    "minecraft:wooded_hills",
                                                    "minecraft:wooded_mountains"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:birch",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:birch_bees_005",
                                    100,
                                    new Seed.Entry.Proximity(true, false)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:badlands",
                                                    "minecraft:badlands_plateau",
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:bamboo_jungle_hills",
                                                    "minecraft:beach",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:deep_warm_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:desert_hills",
                                                    "minecraft:desert_lakes",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:giant_spruce_taiga",
                                                    "minecraft:giant_spruce_taiga_hills",
                                                    "minecraft:giant_tree_taiga",
                                                    "minecraft:giant_tree_taiga_hills",
                                                    "minecraft:gravelly_mountains",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:jungle_edge",
                                                    "minecraft:jungle_hills",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:meadow",
                                                    "minecraft:modified_badlands_plateau",
                                                    "minecraft:modified_gravelly_mountains",
                                                    "minecraft:modified_jungle",
                                                    "minecraft:modified_jungle_edge",
                                                    "minecraft:modified_wooded_badlands_plateau",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:mushroom_field_shore",
                                                    "minecraft:ocean",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:shattered_savanna",
                                                    "minecraft:shattered_savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_mountains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:snowy_taiga_hills",
                                                    "minecraft:snowy_taiga_mountains",
                                                    "minecraft:snowy_tundra",
                                                    "minecraft:stone_shore",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:swamp_hills",
                                                    "minecraft:taiga",
                                                    "minecraft:taiga_hills",
                                                    "minecraft:taiga_mountains",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:wooded_badlands_plateau"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "endemic:birch_bush",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    )
            });
            put("minecraft:jungle_sapling", new Seed[] {
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:bamboo_jungle_hills",
                                                    "minecraft:jungle",
                                                    "minecraft:jungle_edge",
                                                    "minecraft:jungle_hills",
                                                    "minecraft:modified_jungle",
                                                    "minecraft:modified_jungle_edge"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:mega_jungle_tree",
                                    100,
                                    new Seed.Entry.Proximity(false, true)
                            ),
                            new Seed.Entry(
                                    "minecraft:jungle_tree_no_vine",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:jungle_tree",
                                    100,
                                    new Seed.Entry.Proximity(true, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:jungle_tree_no_vine",
                                    5,
                                    new Seed.Entry.Proximity(true, false)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:badlands",
                                                    "minecraft:badlands_plateau",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:birch_forest_hills",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:dark_forest_hills",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:deep_warm_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:desert_hills",
                                                    "minecraft:desert_lakes",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:giant_spruce_taiga",
                                                    "minecraft:giant_spruce_taiga_hills",
                                                    "minecraft:giant_tree_taiga",
                                                    "minecraft:giant_tree_taiga_hills",
                                                    "minecraft:gravelly_mountains",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:meadow",
                                                    "minecraft:modified_badlands_plateau",
                                                    "minecraft:modified_gravelly_mountains",
                                                    "minecraft:modified_wooded_badlands_plateau",
                                                    "minecraft:mountains",
                                                    "minecraft:mountain_edge",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:mushroom_field_shore",
                                                    "minecraft:ocean",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:shattered_savanna",
                                                    "minecraft:shattered_savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_mountains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:snowy_taiga_hills",
                                                    "minecraft:snowy_taiga_mountains",
                                                    "minecraft:snowy_tundra",
                                                    "minecraft:stone_shore",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:swamp_hills",
                                                    "minecraft:taiga",
                                                    "minecraft:taiga_hills",
                                                    "minecraft:taiga_mountains",
                                                    "minecraft:tall_birch_forest",
                                                    "minecraft:tall_birch_forest_hills",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:wooded_badlands_plateau",
                                                    "minecraft:wooded_hills",
                                                    "minecraft:wooded_mountains"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "endemic:jungle_bush",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    )
            });
            put("minecraft:acacia_sapling", new Seed[] {
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:shattered_savanna",
                                                    "minecraft:shattered_savanna_plateau"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:acacia",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:badlands",
                                                    "minecraft:badlands_plateau",
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:bamboo_jungle_hills",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:birch_forest_hills",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:dark_forest_hills",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:deep_warm_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:desert_hills",
                                                    "minecraft:desert_lakes",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:giant_spruce_taiga",
                                                    "minecraft:giant_spruce_taiga_hills",
                                                    "minecraft:giant_tree_taiga",
                                                    "minecraft:giant_tree_taiga_hills",
                                                    "minecraft:gravelly_mountains",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:jungle_edge",
                                                    "minecraft:jungle_hills",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:meadow",
                                                    "minecraft:modified_badlands_plateau",
                                                    "minecraft:modified_gravelly_mountains",
                                                    "minecraft:modified_jungle",
                                                    "minecraft:modified_jungle_edge",
                                                    "minecraft:modified_wooded_badlands_plateau",
                                                    "minecraft:mountains",
                                                    "minecraft:mountain_edge",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:mushroom_field_shore",
                                                    "minecraft:ocean",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_mountains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:snowy_taiga_hills",
                                                    "minecraft:snowy_taiga_mountains",
                                                    "minecraft:snowy_tundra",
                                                    "minecraft:stone_shore",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:swamp_hills",
                                                    "minecraft:taiga",
                                                    "minecraft:taiga_hills",
                                                    "minecraft:taiga_mountains",
                                                    "minecraft:tall_birch_forest",
                                                    "minecraft:tall_birch_forest_hills",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:wooded_badlands_plateau",
                                                    "minecraft:wooded_hills",
                                                    "minecraft:wooded_mountains"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "endemic:acacia_bush",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    )
            });
            put("minecraft:dark_oak_sapling", new Seed[] {
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:dark_forest",
                                                    "minecraft:dark_forest_hills"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:dark_oak",
                                    100,
                                    new Seed.Entry.Proximity(false, true)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:badlands",
                                                    "minecraft:badlands_plateau",
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:bamboo_jungle_hills",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:birch_forest_hills",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:dark_forest_hills",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:deep_warm_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:desert_hills",
                                                    "minecraft:desert_lakes",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:giant_spruce_taiga",
                                                    "minecraft:giant_spruce_taiga_hills",
                                                    "minecraft:giant_tree_taiga",
                                                    "minecraft:giant_tree_taiga_hills",
                                                    "minecraft:gravelly_mountains",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:jungle_edge",
                                                    "minecraft:jungle_hills",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:meadow",
                                                    "minecraft:modified_badlands_plateau",
                                                    "minecraft:modified_gravelly_mountains",
                                                    "minecraft:modified_jungle",
                                                    "minecraft:modified_jungle_edge",
                                                    "minecraft:modified_wooded_badlands_plateau",
                                                    "minecraft:mountains",
                                                    "minecraft:mountain_edge",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:mushroom_field_shore",
                                                    "minecraft:ocean",
                                                    "minecraft:pale_garden",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:shattered_savanna",
                                                    "minecraft:shattered_savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_mountains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:snowy_taiga_hills",
                                                    "minecraft:snowy_taiga_mountains",
                                                    "minecraft:snowy_tundra",
                                                    "minecraft:stone_shore",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:swamp_hills",
                                                    "minecraft:taiga",
                                                    "minecraft:taiga_hills",
                                                    "minecraft:taiga_mountains",
                                                    "minecraft:tall_birch_forest",
                                                    "minecraft:tall_birch_forest_hills",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:wooded_badlands_plateau",
                                                    "minecraft:wooded_hills",
                                                    "minecraft:wooded_mountains"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "endemic:dark_oak_bush",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    )
            });
            put("minecraft:azalea", new Seed[] {
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:lush_caves"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:azalea_tree",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:badlands",
                                                    "minecraft:badlands_plateau",
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:bamboo_jungle_hills",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:birch_forest_hills",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:dark_forest_hills",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:deep_warm_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:desert_hills",
                                                    "minecraft:desert_lakes",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:giant_spruce_taiga",
                                                    "minecraft:giant_spruce_taiga_hills",
                                                    "minecraft:giant_tree_taiga",
                                                    "minecraft:giant_tree_taiga_hills",
                                                    "minecraft:gravelly_mountains",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:jungle_edge",
                                                    "minecraft:jungle_hills",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:meadow",
                                                    "minecraft:modified_badlands_plateau",
                                                    "minecraft:modified_gravelly_mountains",
                                                    "minecraft:modified_jungle",
                                                    "minecraft:modified_jungle_edge",
                                                    "minecraft:modified_wooded_badlands_plateau",
                                                    "minecraft:mountains",
                                                    "minecraft:mountain_edge",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:mushroom_field_shore",
                                                    "minecraft:ocean",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:shattered_savanna",
                                                    "minecraft:shattered_savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_mountains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:snowy_taiga_hills",
                                                    "minecraft:snowy_taiga_mountains",
                                                    "minecraft:snowy_tundra",
                                                    "minecraft:stone_shore",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:swamp_hills",
                                                    "minecraft:taiga",
                                                    "minecraft:taiga_hills",
                                                    "minecraft:taiga_mountains",
                                                    "minecraft:tall_birch_forest",
                                                    "minecraft:tall_birch_forest_hills",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:wooded_badlands_plateau",
                                                    "minecraft:wooded_hills",
                                                    "minecraft:wooded_mountains"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "endemic:azalea_bush",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    )
            });
            put("minecraft:flowering_azalea", new Seed[] {
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:lush_caves"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "minecraft:azalea_tree",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    ),
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:badlands",
                                                    "minecraft:badlands_plateau",
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:bamboo_jungle_hills",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:birch_forest_hills",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:dark_forest_hills",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:deep_warm_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:desert_hills",
                                                    "minecraft:desert_lakes",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:giant_spruce_taiga",
                                                    "minecraft:giant_spruce_taiga_hills",
                                                    "minecraft:giant_tree_taiga",
                                                    "minecraft:giant_tree_taiga_hills",
                                                    "minecraft:gravelly_mountains",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:jungle_edge",
                                                    "minecraft:jungle_hills",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:meadow",
                                                    "minecraft:modified_badlands_plateau",
                                                    "minecraft:modified_gravelly_mountains",
                                                    "minecraft:modified_jungle",
                                                    "minecraft:modified_jungle_edge",
                                                    "minecraft:modified_wooded_badlands_plateau",
                                                    "minecraft:mountains",
                                                    "minecraft:mountain_edge",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:mushroom_field_shore",
                                                    "minecraft:ocean",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:shattered_savanna",
                                                    "minecraft:shattered_savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_mountains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:snowy_taiga_hills",
                                                    "minecraft:snowy_taiga_mountains",
                                                    "minecraft:snowy_tundra",
                                                    "minecraft:stone_shore",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:swamp_hills",
                                                    "minecraft:taiga",
                                                    "minecraft:taiga_hills",
                                                    "minecraft:taiga_mountains",
                                                    "minecraft:tall_birch_forest",
                                                    "minecraft:tall_birch_forest_hills",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:wooded_badlands_plateau",
                                                    "minecraft:wooded_hills",
                                                    "minecraft:wooded_mountains"
                                            )
                                    ),
                                    new Seed.Conditions.Location(
                                            new Seed.Conditions.Location.Elevation(-2032, 2032),
                                            new Seed.Conditions.Location.Luminance(0, 15)
                                    ),
                                    new Seed.Conditions.Climate(
                                            new Seed.Conditions.Climate.Temperature(0.0F, 2.0F),
                                            new Seed.Conditions.Climate.Precipitation(0.0F, 1.0F)
                                    )
                            ),
                            new Seed.Entry(
                                    "endemic:azalea_bush",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            )
                    )
            });
        }
    };

    public TreeMap<String, Seed[]> getSaplings() {
        return saplings;
    }

    public void setSaplings(TreeMap<String, Seed[]> saplings) {
        this.saplings = saplings;
    }

}