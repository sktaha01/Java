package com.Taha.DSA.ProblemSolving;

public class FloorSqrt {

    // Find floor Square root of n without using Math.sqrt()

    public static int floorSqrt(int n){
        int ans=0;
        for(int i =1 ; i*i<=n;i++){
            ans=i;
        }
        return ans;
    }

    public static void main(String... args){
        System.out.println(floorSqrt(24));
    }

}
