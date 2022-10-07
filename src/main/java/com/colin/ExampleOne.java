package com.colin;

public class ExampleOne <T>{
    T objectOne;
    ExampleOne(T objectOne){
        this.objectOne = objectOne;
    }
    public T method(){
        return objectOne;
    }
}
