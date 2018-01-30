package com.example.avi.obs.putterns;

/**
 * Created by avi on 23.01.18.
 */

public class Runner implements Component {
    Target target;

    public Runner(Target target) {
        this.target = target;
    }

    @Override
    public void run(String msg) {
        target.addMsg(msg);
    }
}
