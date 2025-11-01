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
                                                    "minecraft:swamp"
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
                                                    "minecraft:grove",
                                                    "minecraft:meadow",
                                                    "minecraft:plains",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:windswept_forest",
                                                    "minecraft:windswept_gravelly_hills",
                                                    "minecraft:windswept_hills",
                                                    "minecraft:wooded_badlands"
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
                                                    "minecraft:jungle",
                                                    "minecraft:sparse_jungle"
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
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_dark",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:mangrove_swamp",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:ocean",
                                                    "minecraft:old_growth_birch_forest",
                                                    "minecraft:old_growth_pine_taiga",
                                                    "minecraft:old_growth_spruce_taiga",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_plains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:stony_shore",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:taiga",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:windswept_savanna"
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
                                                    "minecraft:old_growth_pine_taiga"
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
                                                    "minecraft:old_growth_pine_taiga",
                                                    "minecraft:old_growth_spruce_taiga"
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
                                                    "minecraft:snowy_plains",
                                                    "minecraft:windswept_forest",
                                                    "minecraft:windswept_gravelly_hills",
                                                    "minecraft:windswept_hills"
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
                                                    "minecraft:grove",
                                                    "minecraft:old_growth_pine_taiga",
                                                    "minecraft:old_growth_spruce_taiga",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:taiga"
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
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_dark",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:mangrove_swamp",
                                                    "minecraft:meadow",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:ocean",
                                                    "minecraft:old_growth_birch_forest",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:sparse_jungle",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:stony_shore",
                                                    "minecraft:swamp",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:windswept_savanna",
                                                    "minecraft:wooded_badlands"
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
                                                    "minecraft:old_growth_birch_forest"
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
                                                    "minecraft:dark_forest",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:windswept_forest",
                                                    "minecraft:windswept_hills"
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
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:beach",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_dark",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:mangrove_swamp",
                                                    "minecraft:meadow",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:ocean",
                                                    "minecraft:old_growth_pine_taiga",
                                                    "minecraft:old_growth_spruce_taiga",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_plains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:sparse_jungle",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:stony_shore",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:taiga",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:windswept_gravelly_hills",
                                                    "minecraft:windswept_savanna",
                                                    "minecraft:wooded_badlands"
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
                                                    "minecraft:jungle",
                                                    "minecraft:sparse_jungle"
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
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_dark",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:mangrove_swamp",
                                                    "minecraft:meadow",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:ocean",
                                                    "minecraft:old_growth_birch_forest",
                                                    "minecraft:old_growth_pine_taiga",
                                                    "minecraft:old_growth_spruce_taiga",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_plains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:stony_shore",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:taiga",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:windswept_forest",
                                                    "minecraft:windswept_gravelly_hills",
                                                    "minecraft:windswept_hills",
                                                    "minecraft:windswept_savanna",
                                                    "minecraft:wooded_badlands"
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
                                                    "minecraft:windswept_savanna"
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
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_dark",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:mangrove_swamp",
                                                    "minecraft:meadow",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:ocean",
                                                    "minecraft:old_growth_birch_forest",
                                                    "minecraft:old_growth_pine_taiga",
                                                    "minecraft:old_growth_spruce_taiga",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_plains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:sparse_jungle",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:stony_shore",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:taiga",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:windswept_forest",
                                                    "minecraft:windswept_gravelly_hills",
                                                    "minecraft:windswept_hills",
                                                    "minecraft:wooded_badlands"
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
                                                    "minecraft:dark_forest"
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
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_dark",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:mangrove_swamp",
                                                    "minecraft:meadow",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:ocean",
                                                    "minecraft:old_growth_birch_forest",
                                                    "minecraft:old_growth_pine_taiga",
                                                    "minecraft:old_growth_spruce_taiga",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_plains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:sparse_jungle",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:stony_shore",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:taiga",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:windswept_forest",
                                                    "minecraft:windswept_gravelly_hills",
                                                    "minecraft:windswept_hills",
                                                    "minecraft:windswept_savanna",
                                                    "minecraft:wooded_badlands"
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
            put("minecraft:mangrove_propagule", new Seed[] {
                    new Seed(
                            new Seed.Conditions(
                                    new Seed.Conditions.Region(
                                            Arrays.asList(
                                                    "minecraft:overworld"
                                            ),
                                            Arrays.asList(
                                                    "minecraft:mangrove_swamp"
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
                                    "minecraft:mangrove",
                                    100,
                                    new Seed.Entry.Proximity(false, false)
                            ),
                            new Seed.Entry(
                                    "minecraft:tall_mangrove",
                                    85,
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
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_dark",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:lush_caves",
                                                    "minecraft:meadow",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:ocean",
                                                    "minecraft:old_growth_birch_forest",
                                                    "minecraft:old_growth_pine_taiga",
                                                    "minecraft:old_growth_spruce_taiga",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_plains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:sparse_jungle",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:stony_shore",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:taiga",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:windswept_forest",
                                                    "minecraft:windswept_gravelly_hills",
                                                    "minecraft:windswept_hills",
                                                    "minecraft:windswept_savanna",
                                                    "minecraft:wooded_badlands"
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
                                    "endemic:mangrove_bush",
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
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_dark",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:mangrove_swamp",
                                                    "minecraft:meadow",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:ocean",
                                                    "minecraft:old_growth_birch_forest",
                                                    "minecraft:old_growth_pine_taiga",
                                                    "minecraft:old_growth_spruce_taiga",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_plains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:sparse_jungle",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:stony_shore",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:taiga",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:windswept_forest",
                                                    "minecraft:windswept_gravelly_hills",
                                                    "minecraft:windswept_hills",
                                                    "minecraft:windswept_savanna",
                                                    "minecraft:wooded_badlands"
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
                                                    "minecraft:bamboo_jungle",
                                                    "minecraft:beach",
                                                    "minecraft:birch_forest",
                                                    "minecraft:cold_ocean",
                                                    "minecraft:dark_forest",
                                                    "minecraft:deep_cold_ocean",
                                                    "minecraft:deep_dark",
                                                    "minecraft:deep_frozen_ocean",
                                                    "minecraft:deep_lukewarm_ocean",
                                                    "minecraft:deep_ocean",
                                                    "minecraft:desert",
                                                    "minecraft:dripstone_caves",
                                                    "minecraft:eroded_badlands",
                                                    "minecraft:flower_forest",
                                                    "minecraft:forest",
                                                    "minecraft:frozen_ocean",
                                                    "minecraft:frozen_peaks",
                                                    "minecraft:frozen_river",
                                                    "minecraft:grove",
                                                    "minecraft:ice_spikes",
                                                    "minecraft:jagged_peaks",
                                                    "minecraft:jungle",
                                                    "minecraft:lukewarm_ocean",
                                                    "minecraft:mangrove_swamp",
                                                    "minecraft:meadow",
                                                    "minecraft:mushroom_fields",
                                                    "minecraft:ocean",
                                                    "minecraft:old_growth_birch_forest",
                                                    "minecraft:old_growth_pine_taiga",
                                                    "minecraft:old_growth_spruce_taiga",
                                                    "minecraft:plains",
                                                    "minecraft:river",
                                                    "minecraft:savanna",
                                                    "minecraft:savanna_plateau",
                                                    "minecraft:snowy_beach",
                                                    "minecraft:snowy_plains",
                                                    "minecraft:snowy_slopes",
                                                    "minecraft:snowy_taiga",
                                                    "minecraft:sparse_jungle",
                                                    "minecraft:stony_peaks",
                                                    "minecraft:stony_shore",
                                                    "minecraft:sunflower_plains",
                                                    "minecraft:swamp",
                                                    "minecraft:taiga",
                                                    "minecraft:warm_ocean",
                                                    "minecraft:windswept_forest",
                                                    "minecraft:windswept_gravelly_hills",
                                                    "minecraft:windswept_hills",
                                                    "minecraft:windswept_savanna",
                                                    "minecraft:wooded_badlands"
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