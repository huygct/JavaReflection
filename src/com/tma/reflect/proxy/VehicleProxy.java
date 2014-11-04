package com.tma.reflect.proxy;

/**
 * Created by thuynghi on 11/4/2014.
 */
public class VehicleProxy implements IVehicle {

    private IVehicle v;

    public VehicleProxy(IVehicle v) {
        this.v = v;
    }

    @Override
    public void start() {
        System.out.println("VehicleProxy: Begin of start()" );
        v.start();
        System.out.println("VehicleProxy: End of start()");

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
