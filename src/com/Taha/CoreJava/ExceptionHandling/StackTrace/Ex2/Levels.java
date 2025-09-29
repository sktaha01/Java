package com.Taha.CoreJava.ExceptionHandling.StackTrace.Ex2;

import java.util.Arrays;

public class Levels {

    public static void main(String[] args) {
        try{
            level1();
        }catch (Exception e){

            //WE CAN WRITE
//            e.printStackTrace();



            //OR
            //WE CAN DO IT MANUALLY AS BELOW
            StackTraceElement[] stacktrace = e.getStackTrace();
            for (int i=0; i<stacktrace.length;i++){
                System.out.println(stacktrace[i]);
            }

        }
    }

    public static void level1(){
        level2();
    }

    public static void level2(){
        level3();
    }
    public static void level3(){
        int [] arr= new int [5];
        arr[5]=10;
    }

}
