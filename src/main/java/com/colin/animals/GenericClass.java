package com.colin.animals;

public class GenericClass<T extends Animals> {
    T other;
     GenericClass(T other) {
        this.other = other;
    }
    public void data(){
        other.run();
    }
}
