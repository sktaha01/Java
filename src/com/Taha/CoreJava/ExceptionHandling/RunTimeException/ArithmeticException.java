package com.Taha.CoreJava.ExceptionHandling.RunTimeException;

public class ArithmeticException {

    public static void main(String ... args){
        int Numerators[]={10,200,30,4000};
        int Enumerators[]={1,2,0,4};

        for(int i=0;i<Numerators.length;i++){
            System.out.println(Divide(Numerators[i],Enumerators[i]));
        }
    }

    public static int Divide(int a, int b){
        try{
            return a/b;
        }catch(Exception e){
            System.out.println(e);              //Here We Handle The Exception
            return -1;
        }
    }

}
