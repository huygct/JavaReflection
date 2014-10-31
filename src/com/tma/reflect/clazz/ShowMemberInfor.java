package com.tma.reflect.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.tma.beans.Cat;

public class ShowMemberInfor {

    public static void main(String[] args) {
        
        //Get Object class Cat
        Class<Cat> aClass = Cat.class;
        
        //Get Contructor of Cat
        Constructor<?>[] constructors = aClass.getConstructors();
        
        System.out.println("-----CONTRUCTORS:------");
        for(Constructor<?> constructor : constructors) {
            System.out.println("Constructor: " +constructor.getName());
        }
        
        //Get list field public
        //include field inher class super and interface
        Field[] fields = aClass.getFields();
        
        System.out.println("-----FIELDs:------");
        for(Field field : fields) {
            System.out.println("Field: " +field.getName());
        }
        
        //Get list Method public
        //include Method inher class super and interface
        Method[] methods = aClass.getMethods();
        
        System.out.println("-----FIELDs:------");
        for(Method method : methods) {
            System.out.println("Field: " +method.getName());
        }
    }

}
