package com.Taha.CoreJava.Keywords.Static.StaticMethods;

public class Utils {

    // Static Methods

    public static int Max(int a , int b){
        if(a>b){
            return a;
        }
        return b;       //No Need to write Else
    }

    public static int Min(int a , int b){
        if(a<b){
            return a;
        }
        return b;       //No Need to write Else
    }

    public static String trimUpperCase(String str){
        if(str!=null){
            return str.trim().toUpperCase();
        }
        return " ";
    }

}
