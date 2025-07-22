package com.Taha.CoreJava.Datatypes;

public class Strings {
    public static void main(String[] args){
//        Student student = new Student();        //We Can write any think in place of student
//        Student s = new Student();            //Then we have to use s instead of student
//        student.name="Taha";
//        student.address="India";
//        student.standard=10;
//        student.rollNo=1101;
//
//        System.out.println(student.standard);

        String x = "Ram";                      //ek baar declare hogaya hai ram it will go to string pool
        String a= new String("Ram");   //new string will be created at new memory location
        String b= new String("Ram");   //----//--------------------//--------//----------
        String c ="Ram";                       //this will point a the same memory location
        String d = "Ram";                      //----------------//------------//---------//

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==d);

        //Length
        int length = x.length();
        System.out.println(length);

        //find character
        char ch= x.charAt(0);
        System.out.println(ch);

        //Compare strings
        String name1="Taha";
        String name2="Taha";
        System.out.println(name1.equals(name2));

        //It compare letters and iqnore upper and lower case
        String name3="Taha";
        String name4="taha";
        System.out.println(name3.equalsIgnoreCase(name4));

        //SubString
        String name = "Taha Shaikh";
        String substring1=name.substring(5);
        String substring2=name.substring(5,8);
        System.out.println(substring1);
        System.out.println(substring2);

        System.out.println(name.subSequence(2,7));      //Same as Substring in java

        //UpperCase
        System.out.println(name.toUpperCase());

        //LowerCase
        System.out.println(name.toLowerCase());

        //Remove Extra White space start and end white space are removed
        String namet="        Taha Shaikh       ";
        System.out.println(namet.trim());   //New String Is Created
        System.out.println(namet);          //Strings are immutable

        //Replace
        String Newname=name.replace("Taha","Sohail");   //String replace
        System.out.println(Newname);

        String chname=name.replace('a','0');             //Character replace
        System.out.println(chname);


//        contains
        System.out.println(name.contains("Sha"));
        System.out.println(name.contains("Ta"));
        System.out.println(name.contains("ha"));
        System.out.println(name.contains("f"));
        System.out.println(name.contains("t"));

        //Check
        System.out.println(name.startsWith("Ta"));
        System.out.println(name.endsWith("ikh"));
        String str = "";
        System.out.println(str.isEmpty());
        String str1 = " ";
        System.out.println(str1.isEmpty());
        String str3 = "       ";
        System.out.println(str3.isBlank());


//        Index Check
        System.out.println(name.indexOf('k'));
        int i = name.indexOf("ai");             //Starting Index
        System.out.println(i);

        System.out.println(name.lastIndexOf("a"));

        int in = 10;
        String s = String.valueOf(in);
        System.out.println(s);


        String formattedStr=String.format("My name is %s and I am %d years old ","Taha Shaikh",21);
        System.out.println(formattedStr);

    }
}

