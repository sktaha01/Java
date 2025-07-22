package com.Taha.CoreJava.Datatypes.Stringkachakkar;

public class StringKaChakkar {


    public static void main(String[] args){

        Cat a = new Cat();
        a.name="bob";
        makeCatNameUpperCase(a);
        System.out.println(a.name);
    }

    public static void makeCatNameUpperCase(Cat cat){
        cat.name=cat.name.toUpperCase();
    }

}
