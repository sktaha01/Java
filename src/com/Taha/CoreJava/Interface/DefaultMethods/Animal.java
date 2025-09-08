package com.Taha.CoreJava.Interface.DefaultMethods;

public interface Animal {

    void eat();
    void sleep();

    public default void  run (){
        System.out.println("Animal Is Running...");
    }

}
