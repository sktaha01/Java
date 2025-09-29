package com.Taha.CoreJava.ExceptionHandling.SimpleEx;

public class WithoutTryCatch {

    //The Program Will Stop Working If Exception Occurs Without Try Catch Block

    public static void main(String ... args){
        int Numerators[]={10,200,30,4000};
        int Enumerators[]={1,2,0,4};

        for(int i=0;i<Numerators.length;i++){
            System.out.println(Divide(Numerators[i],Enumerators[i]));
        }
    }

    public static int Divide(int a, int b){
        return a/b;
    }

}
