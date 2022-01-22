package com.yurisuika.endemic;

import com.yurisuika.endemic.config.TinyConfig;

public class EndemicConfig extends TinyConfig {

    @Entry
    public static boolean enable = true;

    @Entry
    public static Realism enumRealism = Realism.Simple;

    public enum Realism {
        Simple, Realistic, Hardcore
    }

}