package com.tma.reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by thuynghi on 11/4/2014.
 */
public class GenericLogger implements InvocationHandler {

    private Object target;

    public GenericLogger(Object c) {
        this.target = c;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Generic logger Entry: Invoking " + method.getName());

        return method.invoke(this.target, args);
    }
}
