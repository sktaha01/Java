package com.Taha.CoreJava.ExceptionHandling.RunTimeException;


public class NullPointerException {

    public static void main (String ... agrs){

        try{
            Student sd = null;
            sd.setId(123);
            System.out.println(sd.getId());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
