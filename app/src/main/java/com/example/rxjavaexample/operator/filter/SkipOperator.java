package com.example.rxjavaexample.operator.filter;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import static com.example.rxjavaexample.utils.TAG;

//=================>>>>> TAKE, TAKE_LAST OPERATOR <<<<<=================
//=================>>>>> OBSERVER OBSERVER <<<<<=================
//=================>>>>> OBSERVABLE OBSERVABLE <<<<<=================

public class SkipOperator {

    Observable<Integer> observable;
    Observer<Integer> skipObserver,skipLastObserver;

    public SkipOperator() {
        observable = Observable.just(1, 2, 3, 4, 6, 7);

        skipObserver = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "onSubscribe : isDisposed : "+d.isDisposed());
            }

            @Override
            public void onNext(Integer aLong) {
                Log.d(TAG, "SKIP onNext : value : "+aLong);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError : "+e.getMessage());
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete : Download Complete");
            }
        };

        skipLastObserver = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "onSubscribe : isDisposed : "+d.isDisposed());
            }

            @Override
            public void onNext(Integer aLong) {
                Log.d(TAG, "SKIP LAST onNext : value : "+aLong);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError : "+e.getMessage());
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete : Download Complete");
            }
        };
    }

    public Observable<Integer> getObservable() {
        return observable;
    }

    public Observer<Integer> getSkipObserver() {
        return skipObserver;
    }

    public Observer<Integer> getSkipLastObserver() {
        return skipLastObserver;
    }
}
