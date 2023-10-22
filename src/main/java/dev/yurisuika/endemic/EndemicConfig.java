package dev.yurisuika.endemic;

import dev.yurisuika.endemic.config.Config;

public class EndemicConfig extends Config {

    @Entry
    public static boolean enable = true;

    @Comment public static Comment lightDescription;

    @Entry(max = 15, min = 0)
    public static int lightLevel = 7;

    @Entry(max = 100, min = 0)
    public static int lightNormalChance = 0;

    @Entry(max = 100, min = 0)
    public static int lightStuntedChance = 100;

    @Entry(max = 100, min = 0)
    public static int lightDeadChance = 100;

    @Comment public static Comment endemicDescription;

    @Entry(max = 100, min = 0)
    public static int endemicChance = 100;

    @Comment public static Comment overworldDescription;

    @Entry(max = 100, min = 0)
    public static int overworldNormalChance = 10;

    @Entry(max = 100, min = 0)
    public static int overworldStuntedChance = 50;

    @Entry(max = 100, min = 0)
    public static int overworldDeadChance = 100;

    @Comment public static Comment netherDescription;

    @Entry(max = 100, min = 0)
    public static int netherNormalChance = 0;

    @Entry(max = 100, min = 0)
    public static int netherStuntedChance = 0;

    @Entry(max = 100, min = 0)
    public static int netherDeadChance = 100;

    @Comment public static Comment endDescription;

    @Entry(max = 100, min = 0)
    public static int endNormalChance = 0;

    @Entry(max = 100, min = 0)
    public static int endStuntedChance = 0;

    @Entry(max = 100, min = 0)
    public static int endDeadChance = 0;

}