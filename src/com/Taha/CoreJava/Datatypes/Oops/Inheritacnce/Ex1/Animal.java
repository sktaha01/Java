package com.Taha.CoreJava.Datatypes.Oops.Inheritacnce.Ex1;

public class Animal {

    private String name;
    private int age ;
    public void Eat(){
        System.out.println("Eating...");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

}
