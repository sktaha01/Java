package com.Taha.CoreJava.ExceptionHandling.CustomException;

public class Test {

    public static void main(String[] args) {
        BankAccount bk = new BankAccount(100);
        try{
            bk.withdraw(110);
        }catch (InsufficientFundsException e){
            System.out.println(e);
            System.out.println("You Have :"+e.getAmount());
        }
    }

}
