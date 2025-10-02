package com.Taha.CoreJava.ExceptionHandling.Throw;

import java.io.FileNotFoundException;
import java.io.FileReader;

//IT Is Use To Forcefully throw the exception
//It required the adding Exception to the method Signature

public class Levels {

    public static void main(String[] args) throws FileNotFoundException {
        level1();
    }
    public static void level1() throws FileNotFoundException {
        level2();
    }
    public static void level2() throws FileNotFoundException {
        level3();
    }
    public static void level3() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
