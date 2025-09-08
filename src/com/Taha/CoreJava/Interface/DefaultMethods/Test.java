package com.Taha.CoreJava.Interface.DefaultMethods;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
//      Animal.run();           // It Will Give Error Because Default Methods can Only Access by the instance not by the Interface

    }

}
