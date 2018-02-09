package com.example.avi.obs.putterns;

/**
 * Created by avi on 09.02.18.
 */

public class HelloWorldHandler extends Handler {
    @Override
    public void handle(Request request) {
        //do something

        String s = request.getMessage().toLowerCase();
        if(s.contains("hello") && s.contains("world")){
            request.setMessage(request.getMessage()+"!");
        }
        super.handle(request);
    }
}
