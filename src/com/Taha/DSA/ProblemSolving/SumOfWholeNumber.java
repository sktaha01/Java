package com.Taha.DSA.ProblemSolving;

import java.util.Scanner;

public class SumOfWholeNumber {

    // Fing The Sum of n Whole Number       -- 0,1,2,3.....,n


    public static int sumWholeNumber(int n){
        int sum = ((n-1)*n)/2 ;
        return sum;
    }

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No. Of Natural Number:");
        int wa=sc.nextInt();
        System.out.println(sumWholeNumber(wa));

    }

}
