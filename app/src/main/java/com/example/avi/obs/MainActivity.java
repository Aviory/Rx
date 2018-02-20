package com.example.avi.obs;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;

import com.example.avi.obs.mvc.Controller;
import com.example.avi.obs.putterns.Adapter;
import com.example.avi.obs.putterns.Component;
import com.example.avi.obs.putterns.ConsoleStrategy;
import com.example.avi.obs.putterns.Handler;
import com.example.avi.obs.putterns.HelloWorldHandler;
import com.example.avi.obs.putterns.InMemoryStr;
import com.example.avi.obs.putterns.Runner;
import com.example.avi.obs.putterns.RunnerFactory;
import com.example.avi.obs.putterns.ToUpperCaseDecorator;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbstractMethod factory = new SadMethod();
        String msg = "Hello World";

        process(factory, msg);
        //startMVC();
    }

    private void process(AbstractMethod factory, String msg) {
//        Runner runner = RunnerFactory.create();
//        runner.addTarget(new Adapter(ConsoleStrategy.getInstance()));
//
//        //-------------//nullpoint pattern + chainOfResposibility
//
//
//        runner.addHandler(new HelloWorldHandler(new AddEmotionsCommand(factory)));
//
//
//        //--------------//decorator
//        Component component = runner;
//        component = new ToReplaceDecorator(component,factory.getEmotion().get());
//        component.run(msg);


        Component runner = RunnerBuilder
                .forStrategy(ConsoleStrategy.getInstance())
                .andStrategy(new InMemoryStr())
                .andHellowWorldCommand(new AddEmotionsCommand(factory))
                .addHandler(Handler.NULL)
                .addDecorator(ToUpperCaseDecorator.class)
                .addDecorator(ToReplaceDecorator.class)
                .create();


        runner.run(msg);


    }

    private void startMVC(){
        fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, new Controller());
        fragmentTransaction.commit();
    }
}
