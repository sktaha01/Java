package com.Taha.DSA.ProblemSolving;

import java.util.Scanner;

public class SumOfNaturalNumber {


    // Fing The Sum of n Natural Number     -- 1,2,3,4,...,n
    public static int sumNaturalNumber(int n){
        int sum = ((n+1)*n)/2 ;
        return sum;
    }

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No. Of Natural Number:");
        int na=sc.nextInt();
        System.out.println(sumNaturalNumber(na));

    }

}
