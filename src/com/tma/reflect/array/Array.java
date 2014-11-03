package com.tma.reflect.array;

/**
 * Created by thuynghi on 11/3/2014.
 */
public class Array {
    public static void main(String[] args) {

        int[] var = {1, 2, 3, 4};
        Class varcls = var.getClass();
        if(varcls.isArray()) {
            System.out.printf("var is an array : " +varcls.getComponentType());
        }

        int[] intArray = (int[]) java.lang.reflect.Array.newInstance(int.class, 3);

        java.lang.reflect.Array.set(intArray, 0, 123);
        java.lang.reflect.Array.set(intArray, 1, 1234);
        java.lang.reflect.Array.set(intArray, 2, 12345);

        System.out.println("Creating an array by reflect: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("==== : " +intArray[i]);
            System.out.printf("----- " + java.lang.reflect.Array.get(var, i));
        }

    }
}
