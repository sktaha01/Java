package com.Taha.CoreJava.Methods;

public class Methods {

    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        System.out.println(sumOfArray(a));
//
//        String name = "     taHa                   ";
//        System.out.println(upperStr(name));
//
//        String lastName="Shaikh";
//        String firstName="Mohammad Taha";
//        String middleName="Iliyas";
//        System.out.println(sum(lastName,firstName));
//        System.out.println(sum(lastName,firstName,middleName));
//

        int xa=10;
        System.out.println(multiplyBy10(xa));
        System.out.println(xa);


        //String ka chakkar
        String a= "taha";
        System.out.println(upper(a));
        System.out.println(a);




    }

    public static String upper(String str){
        return str.toUpperCase();
    }

    public static int sumOfArray(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res = res + i;
        }
        return res;
    }

    public static String upperStr(String str) {
        return str.trim().toUpperCase();
    }


//    Method Overloading
//    Name Are Same And Parameters Are Different

    public static float sum(float a, float b) {
        return a + b;
    }
    public static float sum(int a, int b) {
        return a + b;
    }

    public static String sum(String a , String b){
        return a+b;
    }

    public static String sum(String a, String b , String c) {
        return a + b + c;
    }


    public static int multiplyBy10(int x){
        return x*10;
    }


    //String Ka Chakkar




}
