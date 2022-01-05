package com.example.myapplication.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    // It calls Constructor, Fields and Method Injections in sequence
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        //Vroom...
        Log.d(TAG, driver + " Driving " + this+"\n");
        engine.start();
    }
}
