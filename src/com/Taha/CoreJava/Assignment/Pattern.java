package com.Taha.CoreJava.Assignment;

public class Pattern {

    public static void main(String... args){

//        ***
//        ***
//        ***
//        int n=3;
//        for(int i=0 ; i<n;i++){
//            for (int j=0; j<n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        *
//        **
//        ***
//        int n=3;
//        for (int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        1
//        23
//        456

//        int n=4;
//        int k=1;
//        for (int i=0; i<n;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print(k);
//                k++;
//            }
//            System.out.println();
//        }


//        * 1 2 3 *
//        * 5 6 7 *
//        * 9 10 11 *

//        int count =1;
//
//        for(int i=1 ; i<=3;i++){
//            System.out.print("*");
//            for(int j=1 ; j<=3 ;j++){
//                System.out.print(" "+(count++));
//            }
//            System.out.print(" "+"*");
//            count++;
//            System.out.println();
//        }

            //        * 1 2 3 *
            //        * 5 6 7 *
            //        * 10 11 12 *

//        int count =1;
//
//            for (int j=1;j<=3;j++){
//                System.out.print("*");
//                for(int k =1; k<=3;k++){
//                    System.out.print(" "+(count++));
//                }
//                System.out.print(" *\n");
//                count=count+j;
//            }

//           *
//           **
//           ***

//        for (int i=1;i<=3;i++){
//            for (int j =0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//           *
//          **
//         ***
//        ****

//        for (int i=1;i<=4;i++){
//            for (int j =3;j>=i;j--){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//                ****
//                ***
//                **
//                *
//
//        for (int i=1;i<=4;i++){
//            for (int j=4;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//            ****
//             ***
//              **
//               *

//        for (int i=1;i<=4;i++){
//            for (int j=1;j<i;j++){
//                System.out.print(" ");
//            }
//            for (int k=4;k>=i;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//   *
//  ***
// *****
//*******
       int  s=1;

        for (int i =1; i<=4;i++){
            for (int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<s;k++){
                System.out.print("*");
            }
            s+=2;
            System.out.println();
        }



    }

}
