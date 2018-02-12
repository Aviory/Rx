package com.example.avi.obs.putterns;

/**
 * Created by avi on 09.02.18.
 */

public class HelloWorldHandler extends Handler {
    private Command command;

    public HelloWorldHandler(Command command) {
        this.command = command;
    }

    @Override
    protected void handleRequest(Request request) {
        String s = request.getMessage().toLowerCase();
        if(s.contains("hello") && s.contains("world")){
            command.change(request);
        }
    }
}
