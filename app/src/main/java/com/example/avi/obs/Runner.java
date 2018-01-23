package com.example.avi.obs;

import android.util.Log;

/**
 * Created by avi on 23.01.18.
 */

class Runner {
    Strategy strategy;

    public Runner(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.print("hello");
    }
}
