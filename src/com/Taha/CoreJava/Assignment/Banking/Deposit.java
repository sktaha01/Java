package com.Taha.CoreJava.Assignment.Banking;

public class Deposit {

    private double Balance;

    public void Deposit(double amount){
        if (amount>0){
            Balance+=amount;
            System.out.println("Deposited:"+amount);
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

}
