package com.Taha.CoreJava.Datatypes.Oops.Inheritacnce.Ex4;

public class Father extends Grandfather{

//    Now If I Will Add Parameters To The Fathers Constructor The Error Will Occur in The Son Constructor
    public Father(String name, int age){
        super(name,age);
    }

    public void FatherMethod(){
        System.out.println("Hello From Father Method...");
    }

}
