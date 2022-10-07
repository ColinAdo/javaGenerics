package com.colin.WildCards;

import java.util.*;
import java.util.List;

public class WildCards {
    public static double sumOfList(List<? extends Number> list){
        double s = 0.0;
        for(Number n: list)
            s += n.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        List<Integer> ans = Arrays.asList(1,3,5);
        System.out.println("Sum : "+sumOfList(ans));

        List<Double> dou = Arrays.asList(2.2,3.3,4.0);
        System.out.println("Sum of doubles: "+sumOfList(dou));
    }
}
