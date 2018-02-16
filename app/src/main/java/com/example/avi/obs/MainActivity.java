package com.example.avi.obs;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import com.example.avi.obs.mvc.Controller;
import com.example.avi.obs.putterns.Adapter;
import com.example.avi.obs.putterns.Component;
import com.example.avi.obs.putterns.ConsoleStrategy;
import com.example.avi.obs.putterns.Handler;
import com.example.avi.obs.putterns.HelloWorldHandler;
import com.example.avi.obs.putterns.Runner;
import com.example.avi.obs.putterns.RunnerFactory;
import com.example.avi.obs.putterns.RunnerImpl;
import com.example.avi.obs.putterns.ToUpperCaseDecorator;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbstractFactory factory = new SadFactory();
        String msg = "Hello World";

        process(factory, msg);
        //startMVC();
    }

    private void process(AbstractFactory factory, String msg) {
        Runner runner = RunnerFactory.create();
        runner.addTarget(new Adapter(ConsoleStrategy.getInstance()));

        //-------------//nullpoint pattern + chainOfResposibility


        runner.addHandler(new HelloWorldHandler(new AddSymvolCommand(factory)));
        runner.addHandler(new HelloWorldHandler(new AddEmotionsCommand(factory)));


        //--------------//decorator
        Component component = runner;
        component = new ToUpperCaseDecorator(component);
        component = new ToReplaceDecorator(component,factory.getSymvol().get());
        component.run(msg);
    }

    private void startMVC(){
        fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, new Controller());
        fragmentTransaction.commit();
    }
}
