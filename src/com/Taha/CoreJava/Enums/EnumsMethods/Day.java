package com.Taha.CoreJava.Enums.EnumsMethods;

// We can also write methods in enums

public enum Day {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THUSDAY,FRIDAY,SATARDAY;

    public void display(){
        System.out.println("This is "+this.name());
    }
}
