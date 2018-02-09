package com.example.avi.obs.putterns;

/**
 * Created by avi on 09.02.18.
 */

public class HelloWorldHandler extends Handler {
    private String s;

    public HelloWorldHandler(String s) {
        this.s = s;
    }

    @Override
    protected void handleRequest(Request request) {
        String s = request.getMessage().toLowerCase();

        if(s.contains("hello") && s.contains("world")){
            request.setMessage(request.getMessage()+this.s);
        }
    }
}
