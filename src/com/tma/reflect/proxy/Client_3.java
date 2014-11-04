package com.tma.reflect.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by thuynghi on 11/4/2014.
 */
public class Client_3 {
    public static void main(String[] args) {
//        IVehicle c = new Car("Ferrari");
//
//        ClassLoader cl = IVehicle.class.getClassLoader();
//
//        IVehicle v = (IVehicle) Proxy.newProxyInstance(cl,
//                new Class[]{IVehicle.class}, new VehicleHandler(c));
//
//        v.start();
//        v.forward();
//        v.stop();

        IVehicle c = new Car("Botar");
        ClassLoader cl = IVehicle.class.getClassLoader();
        IVehicle v = (IVehicle) Proxy.newProxyInstance(cl,
                new Class[] {IVehicle.class}, new GenericLogger(c));
        v.start();
        v.forward();
        v.stop();

    }
}
