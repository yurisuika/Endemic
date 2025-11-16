package dev.yurisuika.endemic.config;

import dev.yurisuika.endemic.util.LightSource;
import dev.yurisuika.endemic.util.Transition;

public class Options {

    public LightSource lightSource = LightSource.SKY;
    public Transition transition = Transition.EASE_IN_CIRC;

    public LightSource getLightSource() {
        return lightSource;
    }

    public void setLightSource(LightSource lightSource) {
        this.lightSource = lightSource;
    }

    public Transition getTransition() {
        return transition;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }

}