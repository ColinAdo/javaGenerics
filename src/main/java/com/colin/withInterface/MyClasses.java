package com.colin.withInterface;

public class MyClasses<K,V> implements MyInterface<K,V> {
    K k;
    V v;
    MyClasses(K k, V v){
        this.k = k;
        this.v = v;
    }
    public K getKey(){
        return k;
    }

    @Override
    public V getValue() {
        return v;
    }
}
