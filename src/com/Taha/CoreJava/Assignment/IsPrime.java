package com.Taha.CoreJava.Assignment;

public class IsPrime {

    public static void main(String[] args) {
//    public static void main(String... args)     We can write [] args as ... args to pass Command line Arguments

        System.out.println(isPrime(13));
        System.out.println(isPrime(23));
        System.out.println(isPrime(10));
        System.out.println(isPrime(17));

    }

    public static boolean isPrime(int a) {
        int res = 0;

        for (int i = 1; i < a / 2; i++) {
            if (a % i == 0) {
                res++;
            }
        }

        return res == 1;
    }

    ;

}
