package com.Taha.CoreJava.Datatypes.Oops.Inheritacnce.Ex4;

public class Test {

    public static void main(String ... args){

        Son son = new Son("Taha",22);
        System.out.println(son.getName());
        System.out.println(son.getAge());

        Father father = new Father("Iliyas",62);
        System.out.println(father.getName());
        System.out.println(father.getAge());

        Grandfather grand = new Grandfather("Razzak",101);
        System.out.println(grand.getName());
        System.out.println(grand.getAge());

        son.SonMethod();

    }

}
