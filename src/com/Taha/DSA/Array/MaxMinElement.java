package com.Taha.DSA.Array;

import java.util.Arrays;

public class MaxMinElement {

    public static void main(String... args) {

        int [] arr =  {1,2,3,4,75,32,12,9};
        maxMin(arr);
        MinMax(arr);

    }

    public static void maxMin(int arr[]) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int sMax;
        int sMin;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        sMax = min;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        sMin = max;
        System.out.println("The Max Element In an Array :" + sMax);
        System.out.println("The Min Element In an Array :" + sMin);
    }

//    or

    public static void MinMax(int [] arr){
        Arrays.sort(arr);
        int n = arr.length-1;
        System.out.println("The Min Element In an Array :" + arr[0]);
        System.out.println("The Max Element In an Array :" + arr[n]);
    }

}
