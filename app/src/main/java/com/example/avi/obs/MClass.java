package com.example.avi.obs;

import android.util.Log;
import android.view.View;

import com.jakewharton.rxbinding.view.RxView;

import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action1;

/**
 * Created by avi on 13.11.17.
 */

class MClass {
    public Subscription any(View v){
        return new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                Log.v("TAG", "hays ");
            }
        };
    }
}
