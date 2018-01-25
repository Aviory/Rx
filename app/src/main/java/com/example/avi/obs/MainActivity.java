package com.example.avi.obs;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import com.example.avi.obs.mvc.Controller;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // new Runner(new Adapter(ConsoleStrategy.getInstance())).run();FragmentManager fragmentManager = getFragmentManager()
        startMVC();
    }
    private void startMVC(){
        fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, new Controller());
        fragmentTransaction.commit();

    }
}
