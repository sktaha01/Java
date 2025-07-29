package com.Taha.DSA.Array;

/*      [10,20,30,40,50,60,70]

        after 3 rotation
        [50,60,70,10,20,30,40]

        soo
        we have to do :

        first:
        reverse the Whole Array
        [70,60,50,40,30,20,10]

        now we can see that the  3 elements are in reverse order thats why in  second step we will reverse the first k elements

        second:
        reverse the first k elements in this case k is 3
        thats why
        [50,60,70,40,30,20,10]

        Now We Can See the Elements Which Are After The K Elements are also reversed thats why in third step we will reverse the elements which are after the k elements

        third:
        reverse the elements after the k elements
        thats why
        [50,60,70,10,20,30,40]      //Final Answer
*/

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
