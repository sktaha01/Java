package com.Taha.CoreJava.ExceptionHandling.CheckedException;

import java.io.FileReader;
import java.io.IOException;
public class WithTryCatchFileReader {

    public static void main(String ... args){

        try{

            FileReader fr = new FileReader("a.txt");
        }catch(IOException i){
            System.out.println(i);
        }

    }

}
