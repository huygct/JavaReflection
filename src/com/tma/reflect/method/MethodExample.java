package com.tma.reflect.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.tma.beans.Cat;

public class MethodExample {
    public static void main(String[] args) throws NoSuchMethodException,
            SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {

        // Lấy ra đối tượng Class mô tả class Cat
        Class<Cat> aClass = Cat.class;

        // Lấy ra đối tượng 'Method' mô tả method getAge()
        Method getAgeMethod = aClass.getMethod("getAge");

        // Kiểu trả về của method getAge
        Class<?> returnType = getAgeMethod.getReturnType();
        System.out.println("Return type of getAge: "
                + returnType.getSimpleName());

        Cat tom = new Cat("Tom", 7);

        // Gọi method 'getAge' theo cách của Reflect
        // Nó tương đương với gọi: tom.getAge()
        int age = (Integer) getAgeMethod.invoke(tom);

        System.out.println("Age = " + age);

        // Lấy ra đối tượng 'Method' mô tả method setAge(int) của class Cat.
        Method setAgeMethod = aClass.getMethod("setAge", int.class);

        // Gọi method setAge(int) theo cách của Reflect.
        // Nó tương đương với gọi: tom.setAge(5);
        setAgeMethod.invoke(tom, 5);

        System.out.println("New Age = " + tom.getAge());
    }
}
