package com.Taha.CoreJava.ExceptionHandling.Finally;

public class Ex1 {

    //Either try or catch execute the finally block will always execute

    // Finally is mainly use to close open resources
//    where we return something

    public static void main(String[] args) {
        try{
            System.out.println("Inside The Try Block");
            int Result = 10/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Inside The Finally Block");
        }
    }

}
