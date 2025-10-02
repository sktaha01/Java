package com.Taha.CoreJava.WrapperClass.ObjectMagic;

public class Magic2 {


        public static void main(String[] args) {
            Students sd = new Students();
            sd.id=1;
            fun(sd);
            System.out.println(sd.id);
        }

        public static void fun(Students a){
            a.id=2;
        }

}
class Students {

    public int id;

}

//Guess The output ?
//o/p:2

/*

But now instead of creating a new student we directly change id

because we are not changing the reference i.e a and sd are now pointing to the same student and we changed the id of that same
student therefore the id will now become 2.

*/