package com.Taha.CoreJava.ExceptionHandling.Throws.Ex2;

import java.io.FileReader;
import java.io.IOException;

//We Have To Handle The Exception Somewhere

public class EX2 {


//    public static void main(String[] args) {
//
//        try{
//            method1();
//        }catch (IOException e){
//            System.out.println("File Not Found Exception");
//        }
//        System.out.println("Hello");
//    }
//    public static void method1() throws IOException {
//        method2();
//    }
//    public static void method2() throws IOException {
//        method3();
//    }
//    public static void method3()throws IOException {
//        FileReader fr = new FileReader("a.txt");
//    }


//    OR


    public static void main(String[] args) {

        method1();
        System.out.println("Hello");
    }
    public static void method1()  {
        try{
            method2();
        } catch (IOException e) {
            System.out.println("File Not Found Exception");
        }
    }
    public static void method2() throws IOException {
        method3();
    }
    public static void method3()throws IOException {
        FileReader fr = new FileReader("a.txt");
    }
}
