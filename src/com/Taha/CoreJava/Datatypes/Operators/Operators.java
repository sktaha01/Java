package com.Taha.CoreJava.Datatypes.Operators;

public class Operators {
    // Relational com.Taha.CoreJava.Datatypes.Operators
    // Relational com.Taha.CoreJava.Datatypes.Operators compare two values and returns a boolean value
    public  static void  main (String[] args){
        int a=1;
        int b=2;
        boolean c = a<b;
        System.out.println(c);

        boolean d = a==b;
        System.out.println(d);

        boolean e = a!=b;
        System.out.println(e);

        boolean f = a<=b;
        System.out.println(f);

        char a1= 'z';
        char a2 = 'a';
        boolean b1 = a1<a2;
        System.out.println(b1);

        String str1 = "Pool";
        String str2= "Pool";
        boolean c1 = str1==str2;
        System.out.println(c1);

        String str3 = new String("Pool");
        System.out.println(str3==str2);



    //Logical com.Taha.CoreJava.Datatypes.Operators
//        && Logical And
//        || Logical Or
//         ! Logical Not


        int ram = 36;
        int age = 55;
        System.out.println(ram>35 && age <20);



        String name = "Taha";
        int exp = 2;
        boolean tier1 = true;
        boolean cond1 = exp >=5;
        System.out.println(tier1 || cond1);


        //Conditional Statements

        int Age = 20;
        if (Age < 18){
            System.out.println("You are a minor!");
        }
        else{
            System.out.println("You are an Adult!");
        };




        int age1 =50;
        int marks=35;

        if (age1<=20 && marks>=33){
            System.out.println("Congrats !");
        }else {
            System.out.println("better luck next time");
        }



        if(true){
            System.out.println("Hello World!");
        }


        int mark= 94;
//        int mark= 85;
//        int mark= 70;
//        int mark= 61;
//        int mark= 55;

        if(mark>=90){
            System.out.println("You Got A Grade");
        } else if (mark>=80) {
            System.out.println("You Got B Grade");
        }
       else if(mark>=70) {
            System.out.println("You Got C Grade");
        }
        else if(mark>=60){
            System.out.println("You Got D Grade");
        }
        else {
            System.out.println("You Are Fail!");
        }

    }

}
