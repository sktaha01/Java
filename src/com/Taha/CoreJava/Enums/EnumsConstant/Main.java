package com.Taha.CoreJava.Enums.EnumsConstant;

public class Main {

    public static void main(String ... args){
        System.out.println(Day.MONDAY);
        System.out.println(Day.FRIDAY);

//        Methods In Enums

        Day monday = Day.MONDAY;
        int ordinal=monday.ordinal();           //It is given after compiling the code
        System.out.println(ordinal);

        String name = monday.name();
        System.out.println(name);               //It Is the name your write in enums as enums constants
        //or
        System.out.println(monday.toString());


        Day enumsDay = Day.valueOf("MONDAY");       //It checks the given string is present in the enums constants if it is present it will return it otherwise if it is not present it will return or throw the Exception
        System.out.println(enumsDay);


//        Day enumsDay = Day.valueOf("MONdaY");       //It will throw Exception
//        System.out.println(enumsDay);


        Day[] values = Day.values();                    //It will give all the enums constants

        for (Day i : values){
            System.out.println(i);
        }

    }

}
