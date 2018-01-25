package com.example.avi.obs.putterns;

/**
 * Created by avi on 23.01.18.
 */

public class Adapter implements Target {
    private final Strategy strategy;

    public Adapter(Strategy strategy) {
        this.strategy=strategy;
    }

    @Override
    public void addMsg(String... msgs) {
        for (String s:msgs) {
            strategy.print(s);
        }
    }
}
