package com.Taha.CoreJava.Interface.StaticMethods;

public interface Animal {

//    Its Can Contain Static Methods After JAVA-8

    void eat();
    void sleep();

    public static void info(){
        System.out.println("This is an Animal Interface");     //We can Only Access The Static Methods by the interface not by there Instance
    }

}
