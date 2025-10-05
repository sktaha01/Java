package com.Taha.CoreJava.Math;
import java.lang.Math;
public class MathClass {

    public static void main(String[] args) {
        int a = 10;
        int b=11;

        int max=Math.max(a,b);
        int min = Math.min(a,b);
        System.out.println(max);
        System.out.println(min);

        int c= -21;
        System.out.println(Math.abs(c));

        double d = 1.23;
        double ceil = Math.ceil(d);
        System.out.println(ceil);

        double floor = Math.floor(d);
        System.out.println(floor);

        double e= 144;
        double sqrt = Math.sqrt(e);
        System.out.println(sqrt);

        double pow = Math.pow(10,2);
        System.out.println(pow);

        System.out.println(Math.log(10));
        System.out.println(Math.log10(10));

        System.out.println("This Is The PI:"+Math.PI);

        System.out.println(Math.random());      //it will give random value btw 0 to 1 .

        System.out.println((int)(Math.random()*11));

        System.out.println(Math.nextAfter(1,2));



    }

}
