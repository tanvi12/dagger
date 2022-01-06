package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.example.myapplication.car.Car;
import com.example.myapplication.dagger.ActivityComponent;
import com.example.myapplication.dagger.DieselEngineModule;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car,car1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // DaggerCarComponent.create(); -> this method is only available if none of the module has an arguments
        ActivityComponent carComponent = ((App)getApplication()).getAppComponent().getActivityComponent(new DieselEngineModule(120));
        carComponent.inject(this);

        car.drive();
        car1.drive();

    }
}