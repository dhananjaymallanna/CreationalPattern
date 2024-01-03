package org.example;

enum Singleton {
    INSTANCE;
    public String someName;
    public Singleton getInstance(){
        return INSTANCE;
    }
}