package com.colin.otherExample;

public class ClasOne<T> {
    T object;
    public T method(T object){
        this.object = object;
        return  object;
    }
}
