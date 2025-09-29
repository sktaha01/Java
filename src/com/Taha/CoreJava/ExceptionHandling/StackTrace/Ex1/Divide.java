package com.Taha.CoreJava.ExceptionHandling.StackTrace.Ex1;

/*  This Is Nothing But The Stack Trace
* java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 4
java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 4
java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 4
* */

public class Divide {

    public static void main(String[] args) {
        int[] arr= {10,20,30,40};
        int[] arr1= {1,2,3,4};
        for(int i=0;i<10;i++){
            try {

                System.out.println(divide(arr[i],arr1[i]));
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static int divide(int a , int b){
        try{
            return a/b;
        }catch (Exception e){
            System.out.println(e);
            return -1;
        }
    }

}
