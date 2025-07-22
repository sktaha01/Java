package com.Taha.CoreJava.Oops.Encapsulation;

public class Client {
    public static void main(String... args){

        BankAccount bank=new BankAccount();         // Object Created

        bank.setAccountNumber(1234678876);
        System.out.println(bank.getAccountNumber());
        System.out.println(bank.getBalance());
        bank.deposit(-10);
        bank.withdraw(100);
        bank.deposit(100);
        bank.withdraw(10);
        System.out.println("Bank Balance Left:"+bank.getBalance());

    }
}
