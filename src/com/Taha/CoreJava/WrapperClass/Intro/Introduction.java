package com.Taha.CoreJava.WrapperClass.Intro;

//Java is not a pure object-oriented programming language because of primitive datatypes
//Primitive datatypes like int , char , etc we cannot apply method or use method like .toString(),etc

//Wrapper class is nothing but use to wrap a primitive datatypes into an object where we now can use different methods

public class Introduction {

    public static void main(String[] args) {
        int a= 10;          //The data will store in stack memory
        Integer b=10;       //The data will store in Heap memory because it is an object
        Integer c=102;
        boolean hasGraphicCard=true;
        Boolean isAdult=true;

        Float f =123f;
        Double d = 12.2;
        Character ch = 'a';
        Byte bb = 1;
        Short s = 12;
        Long l = 24352l;


//        The wrapper class can do what primitive datatype can do
        System.out.println(b+c);        // we can do it


//        Also as these are objects they can store null
                Integer i =null;

//      but int ia = null ; it will give error
//      it cannot store null values it can store int ia = 0;


//        Now

        Integer ab = 1;
        Integer bc = 1;

//        we can check they are equal as
        System.out.println(ab==bc);

//        As they are object now we can also check it as
        System.out.println(ab.equals(bc));



        // We can also convert string value into integer
        String str = "123";
        Integer st = Integer.valueOf(str);
        System.out.println(st);

    }

}
