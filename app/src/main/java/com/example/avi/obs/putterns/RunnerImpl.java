package com.example.avi.obs.putterns;

/**
 * Created by avi on 23.01.18.
 */

public class RunnerImpl implements Runner {
    private Observable observable = new ObservableBody();

  @Override
  public void addTarget(Target target){
      observable.addObs(new TargetObserverAdapter(target));
  }

    @Override
    public void run(String msg) {

        observable.notifyObs(msg);
    }
}
