package com.tma.reflect.hellorefelect;

import java.lang.reflect.Method;

public class ListMethod {

    //Protected method
    protected void info() {
        
    }
    
    public static void testMethod1() {
        
    }
    
    public void testMethod2() {
        
    }
    
    
    public static void main(String[] args) {
        //Get list method public of class here
        //have method inher class father or interface
        Method[] methods = ListMethod.class.getMethods();
        
        for (Method method : methods) {
            System.out.println("Method " + method.getName());
        }
    }

}
