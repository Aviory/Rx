package com.example.avi.obs.putterns;

import java.util.LinkedList;

/**
 * Created by avi on 23.01.18.
 */

public class InMemoryStr implements Strategy{
    LinkedList linkedList = new LinkedList();

    public void setLinkedList(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void print(String d) {
        linkedList.add(d);

    }
}
