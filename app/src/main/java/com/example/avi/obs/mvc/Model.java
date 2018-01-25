package com.example.avi.obs.mvc;

import android.graphics.PorterDuff;

import java.util.LinkedList;
import java.util.Observable;

/**
 * Created by avi on 25.01.18.
 */

public class Model extends Observable {
    LinkedList<Integer> list;

    Model(){
        list = new LinkedList();
        list.add(0,1);
        list.add(1,1);
        list.add(2,1);
        list.add(3,1);
    }


    public int getList(int i) {
        return list.get(i);
    }

    public void setListValue(int index) {
        list.set(index,(int)list.get(index)+1);

        setChanged();
        notifyObservers();
    }
}
