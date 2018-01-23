package com.example.avi.obs;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Runner(new Adapter(ConsoleStrategy.getInstance())).run();

    }

}
