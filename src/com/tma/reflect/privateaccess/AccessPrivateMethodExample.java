package com.tma.reflect.privateaccess;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.tma.beans.Cat;

public class AccessPrivateMethodExample {
    public static void main(String[] args) throws NoSuchMethodException,
            SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {

        // Tạo một đối tượng Class mô tả class Cat.
        Class<Cat> aClass = Cat.class;

        // Class.getField(String) chỉ lấy được các trường public.
        // Sử dụng Class.getDeclaredField(String):
        // Lấy ra đối tượng Method mô tả method setName(String) của class Cat.
        Method private_setNameMethod = aClass.getDeclaredMethod("setName", String.class);

        // Cho phép để truy cập vào các method private.
        // Nếu không sẽ bị ngoại lệ IllegalAccessException
        private_setNameMethod.setAccessible(true);

        Cat tom = new Cat("Tom");

        // Sét đặt trường name giá trị mới.
        private_setNameMethod.invoke(tom, "Tom Cat");

        System.out.println("New name = " + tom.getName());
    }
}
