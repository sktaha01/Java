package com.Taha.CoreJava.Datatypes.Oops.Polymorphism.RunTime;

public class Test {

    public static void main(String... args) {
        Animal dog = new Dog();             //Upcasting - lower hierarchy wale object ko aap higher hierarchy wale reference me dalte ho!
        dog.sayHello();

        Animal cat = new Cat();
        cat.sayHello();

//      we can also do this
        Dog mydog = (Dog) dog;          //Its valid  // Lowercasting
    }

}
