package com.Taha.DSA.Array;

//Given N array element find total no. of element having atleast 1 element grater than itself

public class NoOFElementHavingAtleastOneGreater {

    public static void main(String... args) {
        int arr[] = {1, 2, 534, 23, 43, 21, 54, 3, 534};
        System.out.println("No Of Element Which Has Atleast One Greater No From Itself:" + NoOfElements(arr));
    }

    public static int NoOfElements(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                count++;
            }
        }
        return arr.length - count;
    }

}
