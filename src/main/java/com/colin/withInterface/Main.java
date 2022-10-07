package com.colin.withInterface;

public class Main {
    public static void main(String[] args) {
        MyInterface<String, Integer> obj = new MyClasses<>("Deluxe",38);
        MyInterface<String, String> obj2 = new MyClasses<>("Deluxe","other");
        System.out.println(obj.getKey());
        System.out.println(obj.getValue());
        System.out.println(obj2.getValue());
        System.out.println(obj2.getKey());
    }
}
