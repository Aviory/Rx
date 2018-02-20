package com.example.avi.obs;

import com.example.avi.obs.putterns.Adapter;
import com.example.avi.obs.putterns.Command;
import com.example.avi.obs.putterns.Component;
import com.example.avi.obs.putterns.Handler;
import com.example.avi.obs.putterns.HelloWorldHandler;
import com.example.avi.obs.putterns.InMemoryStr;
import com.example.avi.obs.putterns.Runner;
import com.example.avi.obs.putterns.RunnerFactory;
import com.example.avi.obs.putterns.Strategy;
import com.example.avi.obs.putterns.ToUpperCaseDecorator;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by avi on 19.02.18.
 */

class RunnerBuilder {
    private Runner runner;
    private Component component;

    public RunnerBuilder(Runner runner) {
        this.runner = runner;
    }

    public static RunnerBuilder forStrategy(Strategy instance) {
        RunnerBuilder builder = new RunnerBuilder(RunnerFactory.create());
        builder.runner.addTarget(new Adapter(instance));
        return builder;
    }

    public RunnerBuilder andStrategy(Strategy instance) {
        runner.addTarget(new Adapter(instance));
        return this;
    }

    public RunnerBuilder andHellowWorldCommand(Command command) {
        runner.addHandler(new HelloWorldHandler(command));
        return this;
    }

    public RunnerBuilder addHandler(Handler handler) {
        runner.addHandler(handler);
        return this;

    }

    public RunnerBuilder addDecorator(Class<? extends Component> decoratorClass) {
        if(component==null){
            component=runner;
        }
        try {
            component = decoratorClass.getConstructor(Component.class).newInstance(component);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public Component create() {
        return component;
    }
}
