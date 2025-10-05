package com.Taha.CoreJava.Enums.EnumsFeatures;

public enum Day {

    //We have to write everything below enums constants otherwise it will give error

    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATARDAY("Satarday");

    private String lower;

    private Day(String lower){
        System.out.println("Constructor Called");
        this.lower=lower;
    }

    public String getLower(){
        return lower;
    }

}
