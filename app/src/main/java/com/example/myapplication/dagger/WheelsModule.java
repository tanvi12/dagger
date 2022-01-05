package com.example.myapplication.dagger;

import com.example.myapplication.car.Rims;
import com.example.myapplication.car.Tires;
import com.example.myapplication.car.Wheels;

import dagger.Module;
import dagger.Provides;


// when we can not access constructor or classes coomes from third party library we use modules and also when
// we have to do some extra configuration before returning objects modules is used
@Module
abstract public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        return new Tires();
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
