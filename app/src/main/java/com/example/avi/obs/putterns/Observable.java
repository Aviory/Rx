package com.example.avi.obs.putterns;

/**
 * Created by avi on 02.02.18.
 */

public interface Observable {
    void addObs(Observer obs);
    void removeObs(Observer obs);
    void notifyObs(String msg);
}
