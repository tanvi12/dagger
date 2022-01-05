package com.example.myapplication.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    private Car car;

    @Inject
    public Remote(){

    }

    public void setListener(Car car) {
        Log.d(TAG,"Remote Connected");
        this.car = car;
    }
}
