package com.Taha.CoreJava.ExceptionHandling.Finally;

public class Ex2 {

    public static void main(String[] args) {
        System.out.println(divide(10,0));
    }
    public static int divide(int a, int b){
        try{
            System.out.println("Inside The Try Block");
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("Inside The Catch Block");
            return -1;
        }
        finally{
            System.out.println("Inside The Finally Block");
        }
    }

    /*  Output Will BE like this

       Inside The Try Block
       Inside The Catch Block
       Inside The Finally Block
       -1
    */

}
