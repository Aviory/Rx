package com.example.avi.obs.mvc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.avi.obs.R;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by avi on 25.01.18.
 */

public class Controller extends android.app.Fragment implements Observer{
    private Model model;
    Button b1;
    Button b2;
    Button b3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        LinearLayout linLayout = null;
        model = new Model();
        model.addObserver(this);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            b1 = new Button(getContext());
            b2 = new Button(getContext());
            b3 = new Button(getContext());
            linLayout = new LinearLayout(getContext());
            linLayout.addView(b1);
            linLayout.addView(b2);
            linLayout.addView(b3);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    model.setListValue(1);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    model.setListValue(2);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      model.setListValue(3);
                  }
              });
        }
        return linLayout;
    }

    @Override
    public void update(Observable observable, Object o) {
        b1.setText(String.valueOf(model.getList(1)));
        b2.setText(String.valueOf(model.getList(2)));
        b3.setText(String.valueOf(model.getList(3)));
    }

}
