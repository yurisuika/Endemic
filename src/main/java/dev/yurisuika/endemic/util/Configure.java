package dev.yurisuika.endemic.util;

import dev.yurisuika.endemic.config.Config;
import dev.yurisuika.endemic.world.level.Seed;

import java.util.TreeMap;

public class Configure {

    public static TreeMap<String, Seed[]> getSaplings() {
        return Config.getOptions().getSaplings();
    }

    public static void setSaplings(TreeMap<String, Seed[]> saplings) {
        Config.getOptions().setSaplings(saplings);
        Config.saveConfig();
    }

}