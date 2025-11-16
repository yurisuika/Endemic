package dev.yurisuika.endemic.util;

import dev.yurisuika.endemic.config.Config;

public class Configure {

    public static LightSource getLightSource() {
        return Config.getOptions().getLightSource();
    }

    public static void setLightSource(LightSource lightSource) {
        Config.getOptions().setLightSource(lightSource);
        Config.saveConfig();
    }

    public static Transition getTransition() {
        return Config.getOptions().getTransition();
    }

    public static void setTransition(Transition transition) {
        Config.getOptions().setTransition(transition);
        Config.saveConfig();
    }

}