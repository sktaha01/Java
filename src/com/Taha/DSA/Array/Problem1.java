package com.Taha.DSA.Array;

public class Problem1 {

    public static void main(String... args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverseString(arr);

        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        swap2(arr1);

        System.out.println();

        int [] arr2={10,20,30,40,50,60,70,80,90};
        subStringReverse(arr2,2,6);


    }

    public static void reverseString(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            if (arr[i] == arr[arr.length - 1 - i]) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

//    or


    public static void swap2(int[] arr) {
        int sp = 0;
        int ep = arr.length - 1;

        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }


    public static void subStringReverse(int[] arr, int sp, int ep) {

        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }


}
