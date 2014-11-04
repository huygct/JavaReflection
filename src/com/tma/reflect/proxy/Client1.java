package com.tma.reflect.proxy;

/**
 * Created by thuynghi on 11/4/2014.
 */
public class Client1 {
    public static void main(String[] args) {

        IVehicle v = new Car("toyota");

        v.start();
        v.forward();
        v.stop();
    }
}
