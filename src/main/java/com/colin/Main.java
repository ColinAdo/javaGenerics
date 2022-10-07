package com.colin;

public class Main {
    public static void main(String[] args) {
        ExampleOne<Integer> answer = new ExampleOne<>(10);
        System.out.println(answer.method());
        ExampleOne<String> string = new ExampleOne<>("My name is Deluxe");
        System.out.println(string.method());
    }
}
