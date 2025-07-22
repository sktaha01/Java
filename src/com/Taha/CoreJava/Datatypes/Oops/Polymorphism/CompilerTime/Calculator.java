package com.Taha.CoreJava.Datatypes.Oops.Polymorphism.CompilerTime;

public class Calculator {

    public static void main(String... args){
        System.out.println(add(1,4));
        System.out.println(add(10.2,31.32));
        System.out.println(add(22,33,1));
    }

    public static int add (int a , int b){
        return a+b;
    }

    public static int add (int a , int b,int c ){
        return a+b+c;
    }

    public static double add (double a , double b){
        return a+b;
    }



}
