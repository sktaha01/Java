package com.Taha.CoreJava.ExceptionHandling.Throws.Ex1;

import java.io.FileReader;
import java.io.IOException;

/*
* It Is use to made caller responsible about the Exception.
* Caller Ko Responsible kar dete ho ki dhayan rakhna yea Exception Throw kar sakta hai.
*
* throws IOException // This is known as adding Exception to method signature
* */

public class EX1 {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        // Now iska caller JVM hai i.e it will terminate the program when exception occurs
        // Matlab Kahi na kahi aap ko try catch lagana hi padega or JVM will be responsible for it or take it in its own hand
    }

}
