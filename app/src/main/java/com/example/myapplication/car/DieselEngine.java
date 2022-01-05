package com.example.myapplication.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{
    private static final String TAG = "Car";

    private int housePower;

    @Inject
    public DieselEngine(){
    }


    public void start(){
         Log.d(TAG,"Diesel engine started "+housePower);
     }
}
