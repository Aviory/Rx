package com.example.avi.obs.putterns;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.avi.obs.R;
import com.jakewharton.rxbinding.view.RxView;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by avi on 06.11.17.
 */

public class Frag extends Fragment {
    Button nextButton;
    private static final long TIMEOUT = 500;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment,
                container, false);
        nextButton = (Button) view.findViewById(R.id.button_first);

        Log.v("TAG", "hay sub");



        return view;
    }

    public void add(CompositeSubscription csubscription){
        Subscription subscription = RxView.clicks(nextButton)
                .throttleFirst(TIMEOUT, TimeUnit.MICROSECONDS)
                .subscribe(new Action1<Void>() {
                    @Override
                    public void call(Void aVoid) {
                        Log.v("TAG", "hay ");
                    }
                });
        csubscription.add(subscription);
    }
}

//    Observable obs = Observable.create(new Observable.OnSubscribe<String>() {
//
//        @Override
//        public void call(Subscriber<? super String> subscriber) {
//            subscriber.onNext("hay");
//        }
//    });