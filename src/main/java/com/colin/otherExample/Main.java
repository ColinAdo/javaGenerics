package com.colin.otherExample;

public class Main {
    public static void main(String[] args) {
        ClasOne<String> obj1 = new ClasOne<>();
        System.out.println(obj1.method("Deli"));
        ClasOne<Integer> obj2 = new ClasOne<>();
        System.out.println(obj2.method(15));
        ClasOne<Double> obj3 = new ClasOne<>();
        System.out.println(obj3.method(15.155));
    }
}
