package com.tma.reflect.clazz;

import java.lang.reflect.Modifier;

public class ShowClassInfo {

    public static void main(String[] args) {
        
        //get Object 'Class' description class ShowClassInfo
        Class<ShowClassInfo> aClass = ShowClassInfo.class;
        
        //print class name, have name package
        System.out.println("Class name = " +aClass.getName());
        
        
        //print class name simple
        System.out.println("Simple class Name = " +aClass.getSimpleName());
        
        //Imformation of package
        Package pkg = aClass.getPackage();
        System.out.println("Package Name = " +pkg.getName());
        
        //Modifier
        int modifiers = aClass.getModifiers();
        
        boolean isPublic = Modifier.isPublic(modifiers);
        boolean isInterface = Modifier.isInterface(modifiers);
        boolean isAbstract = Modifier.isAbstract(modifiers);
        boolean isFinal = Modifier.isFinal(modifiers);
        
        // true
        System.out.println("Is Public? " + isPublic);
        // true
        System.out.println("Is Final? " + isFinal);
        // false
        System.out.println("Is Interface? " + isInterface);
        // false
        System.out.println("Is Abstract? " + isAbstract);
        
    }

}
