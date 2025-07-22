package com.Taha.CoreJava.Array;

public class Array {

    public static void main(String[] args) {

        // type[] variableName;

        int[] integerArray;                //Declaration

        int[] arr = new int[10];           //Initialization

        int[] arr1 = {1, 2, 3, 4};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for (int i : arr1) {
            System.out.println(i);          //Here i is not index it is direct no.
        }


//        Match Found
//        int [] arr2 ={1,4,2,55,7,-2};
//        for(int i=0 ; i< arr2.length;i++){
//            if (arr2[i]==55){
//                System.out.println("Found!");
//            }
//        }
//


//        Find Max Value in com.Taha.CoreJava.Datatypes.Array
//        int [] arr3 = {2,12,4322,-32,22};
//
//        int res=Integer.MIN_VALUE;
//        for (int i = 0; i< arr3.length;i++){
//
//            if (arr3[i]>res){
//                res=arr3[i];
//            }
//
//        }
//        System.out.println(res);


//        Reverse Print com.Taha.CoreJava.Datatypes.Array
//        int [] arr4 = {1,2,3,4,5,6,7,8,9,10};
//
//        for (int i = arr4.length-1; i>=0; i--){
//            System.out.print(arr4[i]);
//        }


//        Sum of com.Taha.CoreJava.Datatypes.Array
//        int[] arr5 = {-2, 4, 5, 7, 2, -4, -5, -7};
//        int sum = 0;
//
//        for (int i = 0; i < arr5.length; i++) {
//            sum += arr5[i];
//        }
//        System.out.println(sum);
//
//
////        Using for each loop
//        int sum1=0;
//        for (int i : arr5){
//            sum1+=i;
//        }
//        System.out.println(sum1);


//        2D array

        int[][] arr6 = new int[3][3];
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


        char arr7[][] = new char[3][2];

        arr7[0][0]='a';
        arr7[0][1]='b';
        arr7[1][0]='c';
        arr7[1][1]='d';
        arr7[2][0]='e';
        arr7[2][1]='f';

        for(int i =0 ; i< arr7.length;i++){
            for (int j=0 ; j< arr7[i].length;j++){
                System.out.print(arr7[i][j] + " ");
            }
            System.out.println();
        }

//        Jagged com.Taha.CoreJava.Datatypes.Array

        char arr8 [][] = new char [3][];
        arr8[0]=new char[2];
        arr8[1]=new char[3];
        arr8[2]=new char[1];

        arr8[0][0]='a';
        arr8[0][1]='b';
        arr8[1][0]='c';
        arr8[1][1]='d';
        arr8[1][2]='e';
        arr8[2][0]='f';


        for (int i =0 ; i<arr8.length;i++){
            for (int j =0 ; j<arr8[i].length; j++){
                System.out.print(arr8[i][j] + " ");
            }
            System.out.println();
        }

    }

}

