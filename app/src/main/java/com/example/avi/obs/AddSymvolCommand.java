package com.example.avi.obs;

import com.example.avi.obs.putterns.Command;
import com.example.avi.obs.putterns.Request;

/**
 * Created by avi on 16.02.18.
 */

class AddSymvolCommand implements Command {
    private AbstractFactory factory;

    public AddSymvolCommand(AbstractFactory factory) {
        this.factory = factory;
    }

    @Override
    public void change(Request request) {
        request.setMessage(request.getMessage()+this.factory.getSymvol().get());
    }
}
