package com.Taha.CoreJava.Keywords.Static.StaticVariable;

public class Test {

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student st5 = new Student();

        //System.out.println(st1.count);          // Without Static it will show 1
        System.out.println(st1.count);          //With Static it will show 5

//        You Can Directly Access The Count Without Creating its instance

        System.out.println(Student.count);

    }

}
