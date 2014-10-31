package com.tma.reflect.clazz;

import com.tma.beans.Cat;

public class ShowClassCatInfo {

    public static void main(String[] args) {
        //Object class description  class Cat
        Class<Cat> aClass = Cat.class;
        
        //Name Class
        System.out.println("Simple Class Name = " + aClass.getSimpleName());
        
        //Get Object facther of class Cat
        Class<?> aSuperClass = aClass.getSuperclass();
        System.out.println("Simple Class Name of Super Class = " + aSuperClass.getSimpleName());
        
        //Get array all class description interface Cat active
        Class<?>[] interfaceClasses = aClass.getInterfaces();
        for(Class<?> interClass : interfaceClasses) {
            System.out.println("Interface: " +interClass.getSimpleName());
        }
    }

}
