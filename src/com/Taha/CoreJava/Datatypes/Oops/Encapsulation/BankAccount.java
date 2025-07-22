package com.Taha.CoreJava.Datatypes.Oops.Encapsulation;

public class BankAccount {

    private long accountNumber;         //It Cannot be directly access
    private double balance;

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited:"+amount);
        }
        else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("WithDrew Amount:"+amount);
        }
        else{
            System.out.println("Invalid Amount or Insufficient Balance");
        }
    }

//    Setters

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

//    to setBalance Method is of no use as we created deposit and withdraw method

//    Getters

    public double getBalance(){
        return balance;
    }
    public long getAccountNumber(){
        return accountNumber;
    }

}
