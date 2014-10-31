package com.tma.reflect.field;

import java.lang.reflect.Field;

import com.tma.beans.Cat;

public class FieldExample {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        //Class Cat
        Class<Cat> aClass = Cat.class;
        
        //Get Field name: NUMBER_OF_LEGS
        Field field = aClass.getField("NUMBER_OF_LEGS");
        
        //print type of Field
        Class<?> fieldType = field.getType();
        System.out.println("Field Type: " +fieldType.getSimpleName());
        
        Field ageField = aClass.getField("age");
        Cat tom = new Cat("Tom", 5);
        
        //Get value age - Reflection
        Integer age = (Integer) ageField.get(tom);
        System.out.println("Age Reflection: " +age);
        
        //Set value for age
        ageField.set(tom, 10);
        System.out.println("New Age Reflection: " +tom.getAge());
        
        
        
    }

}
