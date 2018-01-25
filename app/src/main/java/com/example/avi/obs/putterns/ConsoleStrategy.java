package com.example.avi.obs.putterns;

import android.util.Log;

/**
 * Created by avi on 23.01.18.
 */

public final class ConsoleStrategy implements Strategy {

    private static Strategy instance;

    private ConsoleStrategy() {
        //do nothing
    }

    @Override
    public void print(String d) {

        Log.d("tag",d);
    }

    public static Strategy getInstance() {
        return instance = instance==null?new ConsoleStrategy():instance;
    }
}
