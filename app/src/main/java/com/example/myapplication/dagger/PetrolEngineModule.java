package com.example.myapplication.dagger;

import com.example.myapplication.car.Engine;
import com.example.myapplication.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

//    @Provides
//    Engine provideEngine(PetrolEngine petrolEngine){
//        return petrolEngine;
//    }

    // binds takes only single argument, so when using interface and only wants to return implementation it
    // is good idea to use Binds
    @Binds
    abstract Engine bindEngine(PetrolEngine petrolEngine);
}
