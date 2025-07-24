package com.Taha.CoreJava.Oops.Abstraction.Ex2;

public class Car extends Vehicle{

    @Override
    public void accelerate(){
        System.out.println("Accelerating Car");
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating Car");

    }

}
