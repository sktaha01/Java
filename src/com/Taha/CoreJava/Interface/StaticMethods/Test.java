package com.Taha.CoreJava.Interface.StaticMethods;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal.info();
        dog.eat();
        dog.sleep();
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
//        dog.info();             It will give error because the static methods in interface can only access by its interface not by the instance
    }

}
