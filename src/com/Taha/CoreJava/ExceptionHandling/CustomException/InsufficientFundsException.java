package com.Taha.CoreJava.ExceptionHandling.CustomException;

// You Have To Extends it with Exception

public class InsufficientFundsException extends Exception{

    private double amount ;
    public InsufficientFundsException(double amount){
        super("You Don't Have Enough Money!...");
        this.amount = amount;
    }

    public double getAmount(){
        return this.amount;
    }

}
