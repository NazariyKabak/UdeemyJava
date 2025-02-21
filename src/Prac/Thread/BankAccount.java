package Prac.Thread;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public synchronized void deposit(double amount){
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " Deposit: " + amount +" | Balance: " + balance);
    }

    public synchronized void withdraw(double amount){
        if (balance>=amount){
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Withdraw: " + amount +" | Balance: " + balance);
        }else {
            System.out.println(Thread.currentThread().getName() + " Withdraw: Insufficient funds");
        }
    }

    public double getBalance(){
        return balance;
    }
}
