package com.Taha.CoreJava.Datatypes.Oops.Inheritacnce.Ex4;

public class Grandfather {
    private String name;
    private int age;
    //Parameterized Constructor

//    Now When We Write Parameterized Constructor The Error Will Occur In a First Child Class
//    Therefore we have to use super("name");
    public Grandfather(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
