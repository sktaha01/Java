package com.Taha.CoreJava.ExceptionHandling.CustomException;

public class BankAccount {
    private double Balance ;
    public BankAccount(double amount){
        this.Balance=amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount>Balance){
            throw new InsufficientFundsException(Balance);
        }
        Balance-=amount;
    }

}
