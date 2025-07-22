package com.Taha.CoreJava.Loops;

public class Loops {

    public static void main(String[] args){

//        While Loop
        //        int i = 1;
//        while(i<=50){
//            System.out.println(i);
//            i=i+1;
//        }


//        Do-While Loop
//        int i = 1;
//        do{
//            System.out.println(i);
//            i=i+1;
//        }while(i<=50);

//        For loop
//        for(int j=1; j<=50; j++){
//            System.out.println(j);
//        }


      /*
      * 1
      * 10
      * 100
      * 1000
      * 10000
      * 100000
      * */

//        for(int i =1 ,j=1; j<=6; j++,i=i*10){
//            System.out.println(i);
//        }


//        Sum for 10 natural no.
//        int sum=0;
//        int i = 1;
//        while(i<=10){
//            sum=sum+i;
//            i++;
//        }
//        System.out.println(sum);


//        Count digits of a number

//        int n=453421732;
//        int count=0;
//        while(n>0){
//            n=n/10;
//            count++;
//        }
//        System.out.println(count);



//        Factorial of a number
//        int fac=6;
//        int ans=1;
//        while(fac>0){
//            ans=ans*fac;
//            fac--;
//        }
//        System.out.println(ans);
//

        /*
        *
        **
        ***
        ****
        *****/

//        for (int i =0; i<6;i++){
//            for (int j=0; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//            *
//           **
//          ***
//         ****
//        *****

//        for (int i =0 ; i<6 ; i++){
//            for (int j =6 ;j>i;j-- ){
//                System.out.print(" ");
//            }
//            for (int k=0; k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }


        /* *****
           ****
           ***
           **
           * */

//        for (int i=0;i<6;i++){
//            for (int j =6; j>i;j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        *****
         ****
          ***
           **
            *
        * */

//        for (int i=0; i<6;i++){
//            for (int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for (int k = 6; k>i;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        int i =1;
        while(i<=10){
            if (i==5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }




    }

}
