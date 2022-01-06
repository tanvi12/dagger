package com.example.myapplication.dagger;

import com.example.myapplication.MainActivity;
import com.example.myapplication.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

// if any dependencies is singleton we have to define component as singleton
@PerActivity
@Subcomponent(modules = {WheelsModule.class,DieselEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

//    @Component.Builder
//    interface Builder{
//
//        ActivityComponent build();
//
//        Builder appComponent(AppComponent component);
//
//        @BindsInstance
//        Builder horsePower(@Named("horse power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
//    }
}
