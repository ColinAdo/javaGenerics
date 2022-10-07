package com.colin;

import java.util.*;
public class ArrayListGenerics {
    public static void method(List<?> list){
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Colin");
        list.add("Ado");
        method(list);
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        method(integers);
//        To get the second value in the String list
        String string = list.get(1);
        System.out.println(string);



    }
}
