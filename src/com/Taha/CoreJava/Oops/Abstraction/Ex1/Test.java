package com.Taha.CoreJava.Oops.Abstraction.Ex1;

public class Test {


   // Animal animal = new Animal() ;      // We Cannot create the object of the abstract class

//    But we can give reference of the abstract class and create the object of the child class

    public static void main(String ... args){
    Animal dog = new Dog();

//    or
    Dog dog1 = new Dog();
    dog.sayHello();


//    For
    Cat cat = new Cat();
    cat.sayHello();
//    or
    Animal cat1 = new Cat();
    }

}
