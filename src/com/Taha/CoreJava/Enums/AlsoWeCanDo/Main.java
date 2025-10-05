package com.Taha.CoreJava.Enums.AlsoWeCanDo;

public class Main {

    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        switch(day){
            case SUNDAY :{
                System.out.println("This is Sunday!");
                break;
            }
            case FRIDAY:{
                System.out.println("This is Friday!");
                break;
            }
            default:{
                System.out.println("This is Weekend!");
            }
        }

//        or

        switch(day){
            case SUNDAY ->{
                System.out.println("This is Sunday!");
            }
            case FRIDAY ->{
                System.out.println("This is Friday!");
            }
            default ->{
                System.out.println("This is Weekend!");
            }
        }

//        Now if we want to return something

       String res= switch(day){
            case SUNDAY ->"S";
            case FRIDAY -> "F";         //If we dont write default we have to handle all of the enums constants
            default ->"D";
        };

        System.out.println(res);

    }

}
