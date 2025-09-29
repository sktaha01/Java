package com.Taha.CoreJava.ExceptionHandling.Hierarchy;

/*
*
* Java.Lang.Object
*   |- Java.Lang.Throwable
*       |-Java.Lang.Error
*          |-Java.Lang.VirtualMachineError
*          |    |-Java.Lang.OutOfMemoryError
*          |    |-Java.Lang.StackOverFlowError
*          |-Java.Lang.LinkageError
*          |    |-Java.Lang.ClassFormatError
*          |    |-Java.Lang.NoClassDeffFoundError
*          |-Java.Lang.Exception
*               |-Java.Lang.RuntimeException
*               |   |-Java.Lang.ArithmeticException
*               |   |-Java.Lang.NullPointerException
*               |   |-Java.Lang.IndexOutOfBoundException
*               |   |-Java.Lang.IllegalArgumentException
*               |-Java.io.IOException
*               |   |-Java.io.FileNotFoundException
*               |   |-Java.io.EOFException
*               |-Java.sql.SQLException
*               |-Java.Lang.Reflect.InvocationTargetException
*               |-Java.Net.SocketException
*               |-Java.Net.UnknownHostException
* */

public class Hierarchy {

    public static void main(String ... args){
        int arr[]={10,200,30,4000};
        int arr1[]={1,2,0,4};

        for(int i=0;i<arr.length;i++){
            System.out.println(divide(arr[i],arr1[i]));
        }
    }

    public static int divide(int a,int b){
        try{
            return a/b;
        }catch(ArithmeticException e){          //We can write RuntimeException or Exception or Error or Throwable Because they are the parent class of ArithmeticException
            System.out.println(e);
            return -1;
        }
    }

}
