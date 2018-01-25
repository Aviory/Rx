package com.example.avi.obs.putterns;

/**
 * Created by avi on 23.01.18.
 */

public class Runner {
    Target target;

    public Runner(Target target) {
        this.target = target;
    }

    public void run() {
        target.addMsg("hello", "sss");
    }
}
