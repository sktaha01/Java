package com.Taha.CoreJava.Interface.DefaultMethods;

public class Dog implements Animal{


    @Override
    public void eat() {
        System.out.println("Dog Is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog Is Sleeping...");
    }
}
