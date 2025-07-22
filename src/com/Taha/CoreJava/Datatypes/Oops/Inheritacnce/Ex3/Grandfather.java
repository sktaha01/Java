package com.Taha.CoreJava.Datatypes.Oops.Inheritacnce.Ex3;

//Multilevel Inheritance
public class Grandfather {

    private String name;
    private int age;
    private String gender;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }


    public Grandfather(){
        System.out.println("GrandFather Constructor...");
    }


}
