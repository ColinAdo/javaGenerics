package com.colin.animals;

public class Animals{
    String name;
    int age;
    public Animals(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void run(){
        System.out.println(name+" and "+age);
        System.out.println("Running at high speed......");
    }
}
