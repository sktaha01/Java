package com.Taha.CoreJava.Datatypes.Oops.Inheritacnce.Ex4;

public class Son extends Father{

    public Son(String name, int age ){
        super(name,age);            //In Constructor super should be the first Statement
    }

    public void SonMethod(){

        System.out.println("Hello From Son Method...");
        super.FatherMethod();           //We can Write super in different places in different method

    }

}
