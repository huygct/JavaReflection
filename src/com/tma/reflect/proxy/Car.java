package com.tma.reflect.proxy;

/**
 * Created by Nghi Tran on 11/4/2014.
 */
public class Car implements IVehicle{

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Car " + name + " Started");
    }

    @Override
    public void stop() {

    }

    @Override
    public void forward() {

    }

    @Override
    public void reverse() {

    }

    @Override
    public void getName() {

    }
}
