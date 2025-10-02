package com.Taha.CoreJava.WrapperClass.AutoUnboxing;

//Converting Integer or Wrapper Class in to its primitive datatype is known as unboxing
public class AutoUnbox {

    public static void main(String[] args) {

        Integer i = 1;

        int c = i.intValue();       //It converts the Integer i into primitive datatype

//      instead we can write int c = i;

//        The java will automatically convert The Integer or wrapper class into its respective primitive datatype this is known as autounboxing
//        So instead of writing int c = i.intValue(); we can directly write int c = i;

    }

}
