package com.colin.animals;

public class Main {
    public static void main(String[] args) {
        GenericClass<Dogs> newCats = new GenericClass<>(new Dogs("Jackson", 20));
        newCats.data();
        Dogs dogs = new Dogs("RakSel", 19);
        dogs.methodOne();
        dogs.run();
    }
}
