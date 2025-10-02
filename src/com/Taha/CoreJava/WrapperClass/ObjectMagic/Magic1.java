package com.Taha.CoreJava.WrapperClass.ObjectMagic;

public class Magic1 {

    public static void main(String[] args) {
        Student sd = new Student();
        sd.id=1;
        fun(sd);
        System.out.println(sd.id);
    }

    public static void fun(Student a){
        Student  sdt = new Student();
        sdt.id=2;
        a=sdt;
    }

}

class Student {

    public int id;

}

//Guess What is the output?
//o/p : 1

/*

As sd is the reference of object
sd is reference variable who is pointing to the memory location of one student

we sent sd in the fun ()
Now a and sd is pointing to the another student but sd is still pointing to the same student therefore the sd.id will be 1.

 */
