package com.example.avi.obs;

/**
 * Created by avi on 23.01.18.
 */

class Adapter implements Target {
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
