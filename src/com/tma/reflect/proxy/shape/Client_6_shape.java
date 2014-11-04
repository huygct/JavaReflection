package com.tma.reflect.proxy.shape;

import com.tma.reflect.proxy.GenericLogger;

import java.lang.reflect.Proxy;

/**
 * Created by thuynghi on 11/4/2014.
 */
public class Client_6_shape {
    public static void main(String[] args) {
        IShape rect = new Rectangle();
        ClassLoader cl = IShape.class.getClassLoader();
        IShape s = (IShape) Proxy.newProxyInstance(cl, new Class[] {IShape.class}, new GenericLogger(rect));

        s.draw();
    }
}
