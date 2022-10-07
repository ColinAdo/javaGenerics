package com.colin;

import java.util.*;
public class BoxDemo {
    public static <U> void addBox(U u, List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(List<Box<U>> boxes) {
        int counter = 1;
        for (Box<U> box: boxes) {
            U boxContents = box.get();
            System.out.println(
                    "Box # " + counter + " contains [" +
                            boxContents.toString() + "]");
            counter++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Box<Integer>> listOfIntegerBoxes =
                new ArrayList<>();
        BoxDemo.addBox(10, listOfIntegerBoxes);
        BoxDemo.addBox(20, listOfIntegerBoxes);
        BoxDemo.addBox(30, listOfIntegerBoxes);// Alternative for boxing below
        BoxDemo.addBox(40, listOfIntegerBoxes);// Alternative for boxing below
//        BoxDemo.addBox(Integer.sizeOf(30), listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);
    }
}
