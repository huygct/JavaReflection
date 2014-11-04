package com.tma.reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by thuynghi on 11/4/2014.
 */
public class VehicleHandler implements InvocationHandler {

    private IVehicle v;

    public VehicleHandler(IVehicle v) {
        this.v = v;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Vehicle Handler: Invoking " + method.getName());

        return method.invoke(v, args);
    }
}
