package com.example.avi.obs.putterns;

/**
 * Created by avi on 09.02.18.
 */

public abstract class Handler {
    public void addNext(Handler next) {
        this.next = next;
    }

    private Handler next;
    public void handle(Request request) {
        //do something
        if(next!=null){
            next.handle(request);
        }
    }
}
