package com.Taha.DSA.Array;

/*Check if there exist a pair (i,j) such that arr[i]+arr[j]=k and i!=j

note: i and j are index value , k is sum
*/
public class ExistPair {


    public static void main(String ... args){

        int arr[]= {3,4,5,2,7,5};
        System.out.println("There Exists A Pair :"+ExistPairOfIJ(arr,13));
        System.out.println("There Exists A Pair :"+ExistPairOfIJ(arr,12));

    }


    public static boolean ExistPairOfIJ(int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < n - 1 || i <= n - 2; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == k) {
                    return true;
                }

            }

        }

        return false;
    }

}
