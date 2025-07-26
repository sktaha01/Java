package com.Taha.DSA.ProblemSolving;

public class DiffBtwProductAndSumOfDigit {

    // Given An Integer n Return the difference btw the product and the sum of digits

    public static int diffProductSum(int n){
        int product =1;
        int sum=0;

        while(n>0){
            int lastDigit=n%10;
            product*=lastDigit;
            sum+=lastDigit;
            n=n/10;
        }

        return product - sum;
    }

    public static void main(String... args){
        System.out.println(diffProductSum(234));
    }

}
