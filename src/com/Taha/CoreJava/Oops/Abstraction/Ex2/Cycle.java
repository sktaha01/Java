package com.Taha.CoreJava.Oops.Abstraction.Ex2;

public class Cycle extends Vehicle{

    @Override
    public void accelerate(){
        System.out.println("Accelerating Cycle");
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating Cycle");

    }

}
