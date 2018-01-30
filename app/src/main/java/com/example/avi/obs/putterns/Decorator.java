package com.example.avi.obs.putterns;

/**
 * Created by avi on 30.01.18.
 */

public abstract class Decorator implements Component{
    Component component;

    protected Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void run(String msg) {
        component.run(msg);
    }
}
