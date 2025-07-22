package com.Taha.CoreJava.Datatypes;

public class Datatypes {
        public static void main (String[] args){
            // Whole Number
            // byte
            // short
            // int
            // long


            // byte age1 = -21;
            // short age2 = 21;
            // int age = 20;
            // long age3 = 21;
            // System.out.println("Byte Length");
            // System.out.println(Byte.MIN_VALUE);
            // System.out.println(Byte.MAX_VALUE);
            // System.out.println("Short Length");
            // System.out.println(Short.MIN_VALUE);
            // System.out.println(Short.MAX_VALUE);
            // System.out.println("Integer Length");
            // System.out.println(Integer.MIN_VALUE);
            // System.out.println(Integer.MAX_VALUE);
            // System.out.println("Long Length");
            // System.out.println(Long.MIN_VALUE);
            // System.out.println(Long.MAX_VALUE);




            // Decimal Number
            // float
            // double

            // System.out.println("Float Length");
            // System.out.println(Float.MIN_VALUE);
            // System.out.println(Float.MAX_VALUE);
            // System.out.println("Double Length");
            // System.out.println(Double.MIN_VALUE);
            // System.out.println(Double.MAX_VALUE);

            // float num = 23.2134f;
            // double num1 = 23.2134;


            // characters
            // char

            // char myCharacter= 'A';

            // Boolean
            // boolean

            // boolean bool = true;





            // Program

            // int a= 2;
            // long b = a;
            // float c =a;
            // System.out.println(a);
            // System.out.println(b);
            // System.out.println(c);


            // float f=22.32f;
            // int g = (int)f;     //Type Casting
            // long h=(long)f;

            // System.out.println(f);
            // System.out.println(g);
            // System.out.println(h);




            // Memory Space

            byte bytenum=10;                    // 1 Byte
            short shortnum=bytenum;             // 2 Byte
            int intnum=shortnum;                // 4 Byte
            long longnum=intnum;                // 8 Byte
            float floatnum=longnum;             // 4 Byte
            double doublenum = floatnum;        // 8 Byte
            boolean bool=true;                  // 1 Bit

            // Conversion of one datatype to another is called widning or implecit or automatic conversion

            System.out.println("Byte Value:" + bytenum);
            System.out.println("Short Value:" + shortnum);
            System.out.println("Int Value:" + intnum);
            System.out.println("Long Value:" + longnum);
            System.out.println("Float Value:" + floatnum);
            System.out.println("Double Value:" + doublenum);

            char my_char='A';
            float Chtof=my_char;
            System.out.println(Chtof);





            // This Is Know As Narowing Conversion

            double dnum=1231.312;
            float fnum=(float)dnum;
            long lnum=(long)fnum;
            int inum=(int) lnum;

            System.out.println(dnum);
            System.out.println(fnum);
            System.out.println(lnum);
            System.out.println(inum);
        }
    }



