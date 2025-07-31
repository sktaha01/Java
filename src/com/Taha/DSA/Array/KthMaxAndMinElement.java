package com.Taha.DSA.Array;
import java.util.Arrays;
public class KthMaxAndMinElement {

    public static void main(String ... args){
        int [] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        kthMaxMin(arr,2);
    }

    public static void kthMaxMin(int [] arr,int k){
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("The"+k+"th Max Element In The Array Is :"+arr[0+k-1]);
        System.out.println("The"+k+"th Max Element In The Array Is :"+arr[n-k]);
    }

}
