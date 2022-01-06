package com.example.myapplication.dagger;

import com.example.myapplication.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    // We have to pass all the module that are not abstract and don't have defalut constructor
    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
}
