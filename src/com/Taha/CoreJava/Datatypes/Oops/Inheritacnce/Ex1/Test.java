package com.Taha.CoreJava.Datatypes.Oops.Inheritacnce.Ex1;

public class Test {

    public static void main(String ... args){

        Dog dog=new Dog();
        dog.setName("Bob");
        dog.setAge(10);
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(7);
        cat.Eat();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getAge());

    }
}
