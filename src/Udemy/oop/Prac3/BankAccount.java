package Udemy.oop.Prac3;

public class BankAccount {
    private static String name;
    private static int accountNumber;
    private static double balance;


    public BankAccount(String name,int accountNumber, double balance) {
        BankAccount.name = name;
        BankAccount.accountNumber = accountNumber;
        BankAccount.balance = balance;
    }

    public BankAccount(String name, int accountNumber) {
        BankAccount.name = name;
        accountNumber =accountNumber;
        balance=1000;
    }

    public void display(){
        System.out.println("Name: "+name+" Account Number: "+accountNumber+" Balance: "+balance);
    }
}
