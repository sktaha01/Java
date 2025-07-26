package com.Taha.DSA.ProblemSolving;

import java.util.Scanner;

public class ProblemSolving {

    //Find the no. of factors

//    solution 1        -- This Solution Is No Optimized for the n=10^18 because computer can do 10^8 iteration per sec

//        1 sec = 10^8
//        x sec = 10^18
//    x sec = 1/10^8  * 10^18     = 10^10 sec approx = 317 years
//    public static int noOfFactors(int n){
//        int count=0;
//
//        for(int i = 1; i<=n;i++){
//            if(n%i==0){
//                count++;
//            }
//        }
//
//        return count;
//    }



//    Solution 2 -- This Solution is also Not Optimized It carry out half of n factors
//    public static int noOfFactors(int n){
//        int count = 1;
//        for(int i =1 ; i<=n/2;i++){
//            if(n%i==0){
//                count++;
//           }
//        }
//        return count;
//    }



//    Solution 3 --

   /* suppose factors are i and j
    Therefore i * j = n
    then j = n/i

    i       n/i        n=24
    1       24      =  24
    2       12      =  24           //Part1
    3       8       =  24
    4       6       =  24
-------------------------------
    6       4       =  24
    8       3       =  24
    12      2       =  24           //Part2
    24      1       =  24

    We can see the pattern in part 1 and 2 that it is reversing from part 1 to part 2
    therefore we have to only consider part 1

    And also see the pattern
    as in part 1 : i < n/i
    and in part 2 : i > n/i

    therefore we can write it as for part 1 : i^2 < n   or i < sqrt(n)
    */

//    public static int noOfFactors(int n){
//        int count = 0;
//
//        for(int i =1;i*i<n;i++){
//            if(n%i==0){
//                count+=2;
//            }
//        }
//
//        return count;
//    }

//    But This Solution is not suitable for perfect sqrt no.
    /*
    * such as n=36
    *       i               n/i             n=36
    *       1        <       36      =       36
    *       2        <       18      =       36
    *       3        <       12      =       36
    *       4        <       9       =       36
    * -----------------------------------------------
    *       6        =       6       =       36
    * -----------------------------------------------
    *       9        >       4       =       36
    *       12       >       3       =       36
    *       18       >       2       =       36
    *       36       >       1       =       36
    *
    *   therefore i*i<=n
    *
    *   we can see the repetition like before but 6 * 6 = 36 we count is a  2 but it is actually 1 factor
    *
    * */

    public static int noOfFactors(int n){
        int count =0;

        for(int i =1; i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }
                else {
                    count+=2;
                }
            }
        }

        return count;
    }


    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n=sc.nextInt();
        System.out.println(noOfFactors(n));
    }



}
