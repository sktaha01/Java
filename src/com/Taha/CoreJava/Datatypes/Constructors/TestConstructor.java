package com.Taha.CoreJava.Datatypes.Constructors;

import java.lang.reflect.Constructor;

public class TestConstructor {


    public static void main(String... args) {
        //Default Constructor
//        Student std = new Student();

//        Constructor is automaticly get called when we create an object


//        Parameterized Constructor
        Student stud1 = new Student("Taha",21,101);
        System.out.println(stud1.getName());
        System.out.println(stud1.getAge());
        System.out.println(stud1.getRollNumber());

        Student stud2=new Student("Sohail");
        System.out.println(stud2.getName());

        Student stud3 = new Student(1001);
        System.out.println(stud3.getRollNumber());


    }


}
