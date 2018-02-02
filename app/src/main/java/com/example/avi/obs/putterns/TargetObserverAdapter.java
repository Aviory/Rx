package com.example.avi.obs.putterns;

/**
 * Created by avi on 02.02.18.
 */

class TargetObserverAdapter implements Observer {
    private Target target;

    public TargetObserverAdapter(Target target) {
        this.target = target;
    }

    @Override
    public void handleEvent(String msg) {
        target.addMsg(msg);
    }
}
