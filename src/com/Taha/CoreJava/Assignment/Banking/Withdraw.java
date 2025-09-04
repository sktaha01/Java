package com.Taha.CoreJava.Assignment.Banking;

public class Withdraw {

    private double Balance;
    public void Withdraw(int amount){
        if(amount>0 && amount<=Balance){
            Balance-=amount;
            System.out.println("Amount Withdrawed:"+amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

}
