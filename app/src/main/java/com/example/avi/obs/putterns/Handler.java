package com.example.avi.obs.putterns;

/**
 * Created by avi on 09.02.18.
 */

public abstract class Handler {
    public static final Handler NULL = new NullHandler();

    private Handler next;

    public void addNext(Handler next) {
        this.next = next;
    }

    public void handle(Request request) {//this is Template pattern
        //do something
        handleRequest(request);

        if(next!=null){
            next.handle(request);
        }

        doAfterAll(request);
    }

    protected void doAfterAll(Request request) {
        //implement in subclass
    }

    protected abstract void handleRequest(Request request);
}
