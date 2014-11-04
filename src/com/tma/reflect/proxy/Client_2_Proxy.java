package com.tma.reflect.proxy;

/**
 * Created by thuynghi on 11/4/2014.
 */
public class Client_2_Proxy {
    public static void main(String[] args) {

        IVehicle car = new Car("Audi");
        VehicleProxy carProxy = new VehicleProxy(car); // Dynamic

        carProxy.start();
        carProxy.forward();
        carProxy.stop();

        System.out.println("----------------------------------------");
        IVehicle carDecorator = new VehicleProxy(car);
        carDecorator.start();
    }
}
