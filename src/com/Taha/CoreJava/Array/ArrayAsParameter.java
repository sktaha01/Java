package com.Taha.CoreJava.Array;

public class ArrayAsParameter {

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
    }

    public static int sum(int... a) {
        int sum = 0;
//        for (int i =0 ; i<a.length;i++){
//            sum=sum+a[i];
//        }
//        Or
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

}
