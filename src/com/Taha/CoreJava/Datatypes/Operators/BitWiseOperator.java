package com.Taha.CoreJava.Datatypes.Operators;

public class BitWiseOperator {

    public static void main (String[] args){
        // and operator &
        // or operator |
        // xor operator ^
        // not operator ~
        // left shift <<
        // right shift >>
        // unsigned right shift >>>

        // there are 32 bit
        // 00000000000000000000000000000000

        //AND
        int c = 5 & 4;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(c);

        //OR
        int d = 5 | 7;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(7));
        System.out.println(d);

        //XOR
        int e = 5 ^ 7;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(7));
        System.out.println(e);

        //NOT
        int f = 5;
        System.out.println(Integer.toBinaryString(5));
        int g = ~f;
        System.out.println(g);
        System.out.println(Integer.toBinaryString(g));

        //Left Shift
        int h = 5;
        System.out.println(Integer.toBinaryString(5));
        int i = h << 1;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));

        //Right Shift       replace 11 in the leftmost block if -int value or 00 if +int value depends on the sign of variable
        int j = 5;
        System.out.println(Integer.toBinaryString(5));
        int k = j >> 1;
        System.out.println(k);
        System.out.println(Integer.toBinaryString(k));

        //Unsigned Right Shift replace 00 in the leftmost block
        int l = 5;
        System.out.println(Integer.toBinaryString(5));
        int m = l >>> 1;
        System.out.println(m);
        System.out.println(Integer.toBinaryString(m));
    }

}
