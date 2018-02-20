package com.example.avi.obs;

import com.example.avi.obs.putterns.Component;
import com.example.avi.obs.putterns.Decorator;

/**
 * Created by avi on 30.01.18.
 */

class ToReplaceDecorator extends Decorator {

    private final String replace="-";


    @Override
    public void run(String msg) {

        super.run(msg.replace(" ",replace));
    }

    protected ToReplaceDecorator(Component component) {
        super(component);
    }
}
