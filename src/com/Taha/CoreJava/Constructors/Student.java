package com.Taha.CoreJava.Constructors;

public class Student {

    private String name;
    private int age;
    private int rollNumber;


//    public Student() {
//        this.name = "Taha";
//        System.out.println(name);
//    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public Student(String name, int age, int rollNumber){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
    }
//    We Can Also Overload Constuctor

    public Student(String name){
        this.name=name;
    }
    public Student(int rollNumber){
        this.rollNumber=rollNumber;
    }

}
