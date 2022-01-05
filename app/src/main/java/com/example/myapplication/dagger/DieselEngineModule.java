package com.example.myapplication.dagger;

import com.example.myapplication.car.DieselEngine;
import com.example.myapplication.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public  class  DieselEngineModule {

    private int horsePower;

   public DieselEngineModule(int horsePower){
        this.horsePower = horsePower;
    }
    @Provides
    Engine provideEngine(DieselEngine dieselEngine){
        return dieselEngine;
    }

    @Provides
    int provideHorsePower(){
       return horsePower;
    }


    // binds takes only single argument, so when using interface and only wants to return implementation it
    // is good idea to use Binds, also it doens't support any configuration
//    @Binds
//    abstract Engine bindEngine(DieselEngine dieselEngine);
}
