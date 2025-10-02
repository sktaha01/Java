package com.Taha.CoreJava.ExceptionHandling.TryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// This is nowadays used instead of finally block to close the resource
// if we create the object of the class inside the try whose is implementing autocloseable interface then it will be automatically get closed.
// in this case the BufferReader's object is created inside the try block and it also implements the autocloseable interface i.e it will get automatically closed

public class Trywithresource {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("a.txt"))){
            String line ;
            while((line= reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IO Exception : "+e.getMessage());
        }
    }

}
