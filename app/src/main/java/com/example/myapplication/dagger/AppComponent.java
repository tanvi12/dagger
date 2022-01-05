package com.example.myapplication.dagger;

import com.example.myapplication.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    Driver getDriver();
}
