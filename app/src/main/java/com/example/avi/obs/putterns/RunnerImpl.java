package com.example.avi.obs.putterns;

/**
 * Created by avi on 23.01.18.
 */

public class RunnerImpl implements Runner {

    private Observable observable = new ObservableBody();
    private Handler handler = Handler.NULL;

    @Override
  public void addTarget(Target target){
      observable.addObs(new TargetObserverAdapter(target));
  }

    @Override
    public void addHandler(Handler handler) {
        if(this.handler==Handler.NULL){
            this.handler = handler;
        }else{
            this.handler.addNext(handler);
        }
    }

    @Override
    public void run(String msg) {
        Request request = new Request(msg);
        handler.handle(request);
        observable.notifyObs(request.getMessage());
    }
}
