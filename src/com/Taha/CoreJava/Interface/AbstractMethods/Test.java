package com.Taha.CoreJava.Interface.AbstractMethods;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        System.out.println(Animal.Max_Age);
//      System.out.println(dog.Max_Age);        // It is Not used It should we access by its interface like the above line
    }

}
