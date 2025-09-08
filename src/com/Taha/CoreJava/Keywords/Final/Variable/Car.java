package com.Taha.CoreJava.Keywords.Final.Variable;

public class Car extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Car Accelerating...");
    }

    @Override
    public void decelerate() {
        System.out.println("...Car Decelerating");
    }
}
