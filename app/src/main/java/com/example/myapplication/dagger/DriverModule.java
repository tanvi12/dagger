package com.example.myapplication.dagger;

import com.example.myapplication.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
abstract class DriverModule {

    @Singleton
    @Provides
    static Driver provideDriver(){
        return new Driver();
    }
}
