package com.example.avi.obs;

import android.util.Log;

/**
 * Created by avi on 23.01.18.
 */

class Runner {
    Target target;

    public Runner(Target target) {
        this.target = target;
    }

    public void run() {
        target.addMsg("hello", "sss");
    }
}
