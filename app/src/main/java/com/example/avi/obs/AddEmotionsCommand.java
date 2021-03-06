package com.example.avi.obs;

import com.example.avi.obs.putterns.Command;
import com.example.avi.obs.putterns.Request;

/**
 * Created by avi on 12.02.18.
 */

class AddEmotionsCommand implements Command {
    private AbstractMethod abstractMethod;

    public AddEmotionsCommand(AbstractMethod abstractMethod) {
        this.abstractMethod = abstractMethod;
    }

    @Override
    public void change(Request request) {
        request.setMessage(request.getMessage()+this.abstractMethod.getEmotion().get());
    }
}
