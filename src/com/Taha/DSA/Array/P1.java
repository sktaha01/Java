package com.Taha.DSA.Array;

import java.util.Scanner;

public class P1 {

//    int [] arr = new int [10];

//Array name = arr  and its size is 10
//    -----------------------------------------
//    | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
//    -----------------------------------------

/*
    If arr size is n
    then
First Index = 0;
Last Index = n-1;
*/


//    Create an array of size 5 and values 10,20,30,40,50

    public static void main(String... args){

//        Way 1

//        int [] arr = new int [5];       //Declaration
//
//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;                      //Initialization
//        arr[3]=40;
//        arr[4]=50;
//
////        Way 2
//
//        int[] arr1 = {10,20,30,40,50};
//
//
////        Find The Sum Of Array
//            int sum=0;
//        for(int i =0 ; i<arr1.length;i++){
//
//            sum+=arr1[i];
//        }
//        System.out.println(sum);

    // Find The Max Of the Array
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The Size Of Array:");
//        int n = sc.nextInt();
//       int [] arr2=new int[n];
//       for(int i =0 ; i<arr2.length;i++){
//           System.out.println("Enter The Array:");
//           arr2[i]=sc.nextInt();
//       }
//
//       int max = Integer.MIN_VALUE;
//       for (int i = 0 ; i<arr2.length;i++){
//           if (arr2[i]>max){
//               max=arr2[i];
//           }
//       }
//        System.out.println("The Max Of Array: "+max);
//

    int [] arr = {10,20,30,40,50,60,70,80,90,100};

    for(int i = 0 ; i< arr.length;i++){
        if (arr[i]!=arr[arr.length-1]){
        swap(arr[i],(arr[arr.length-i]));
        }
        else{
            break;
        }
    }
    for (int i =0 ; i<arr.length;i++){
        System.out.print(arr[i]);
    }
    }
    public static void swap(int a,int b){
        int temp= a;
        a=b;
        b= temp;
    }

}

