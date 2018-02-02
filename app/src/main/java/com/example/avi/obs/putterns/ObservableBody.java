package com.example.avi.obs.putterns;

import java.util.LinkedList;

/**
 * Created by avi on 02.02.18.
 */

public class ObservableBody implements Observable{
    LinkedList<Observer> observers = new LinkedList<>();
    @Override
    public void addObs(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObs(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObs(String msg) {
        for (Observer obs:observers) {
            obs.handleEvent(msg);
        }
    }
}
