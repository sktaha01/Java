package com.Taha.DSA.Array;

import java.util.Scanner;

public class RotatingArray {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of the Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("You Entered Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("How Many Rotation You Want To Perform On Array:");
        int k = sc.nextInt();
        k = k % n;                      //To Remove The n Multiples


        // Reverse The Whole Array
        reverseArray(arr,0,n-1);
        // Reverse The K Elements
        reverseArray(arr,0,k-1);
        // Reverse The Elements After The K Elements
        reverseArray(arr,k,n-1);

        System.out.println( k + " Times Rotated Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr, int sp , int ep ){


        while (sp<ep){
            int temp = arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }

    }
}
