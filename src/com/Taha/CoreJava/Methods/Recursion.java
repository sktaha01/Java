package com.Taha.CoreJava.Methods;

public class Recursion {

    public static void main(String... args){

        System.out.println(factorial(5));
        System.out.println(naturalNumberSum(5));

    }
//    public static int factorial(int n){
//        int res=1;
//        for(int i=1;i<=n;i++){
//            res=res*i;
//        }
//        return res;
//    }
//    or we can write it as same with recursion

    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int naturalNumberSum(int n){
        if(n==1){
            return 1;
        }
        return n + naturalNumberSum(n-1);
    }

}
