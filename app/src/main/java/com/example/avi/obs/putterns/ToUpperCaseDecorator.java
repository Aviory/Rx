package com.example.avi.obs.putterns;

/**
 * Created by avi on 30.01.18.
 */

public class ToUpperCaseDecorator extends Decorator {

    public ToUpperCaseDecorator(Component component) {
        super(component);
    }

    @Override
    public void run(String msg) {

        super.run(msg.toUpperCase());
    }
}
