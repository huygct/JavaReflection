package com.tma.reflect.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.tma.beans.Cat;

public class ConstructorExample {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        //Class Cat
        Class<Cat> aClass = Cat.class;
        
        //Get constructor have parameter (String, int) of class Cat
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);
        //Get type parameter of Constructor
        Class<?>[] paramClasses = constructor.getParameterTypes();
        
        for(Class<?> paramClass : paramClasses) {
            System.out.println("Param: " +paramClass.getSimpleName());
        }
        
        
        //Create Object Cat - Normal
        Cat tom = new Cat("Tom", 3);
        System.out.println("Cat 1: " + tom.getName() + ", age =" + tom.getAge());

        //Create Object Cat - reflection
        Cat tom2 = (Cat) constructor.newInstance("Tom Reflection", 4);
        System.out.println("Cat reflection: " + tom2.getName() + ", age =" + tom2.getAge());

    }
}
