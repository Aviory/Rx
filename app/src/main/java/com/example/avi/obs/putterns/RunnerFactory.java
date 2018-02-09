package com.example.avi.obs.putterns;

/**
 * Created by avi on 09.02.18.
 */

public class RunnerFactory {
    public static Runner create() {
        return new RunnerImpl();
    }
}
