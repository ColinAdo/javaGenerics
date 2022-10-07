package com.colin;

public class GenericFunctions {
    public static <T> void method(T element){
        System.out.println(element.getClass().getName()
                +" = "+element);
    }

    public static void main(String[] args) {
        method(10);
        method(25.00);
        method("I love programming");
    }
}
