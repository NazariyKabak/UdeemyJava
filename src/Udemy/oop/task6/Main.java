package Udemy.oop.task6;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount [] accounts = {
                new BankAccount("123", "John", 1000),
                new BankAccount("124", "Jane", 2000),
                new BankAccount("125", "Jim", 3000)
        };
        Bank bank = new Bank(accounts);
        userInput(bank);

    }

    public static void displayMenu(){
        System.out.println("1. Add account");
        System.out.println("2. Delete account");
        System.out.println("3. Display accounts");
        System.out.println("4. Total balance");
        System.out.println("5. Exit");
    }

    public static void addAccount(Bank bank){
        System.out.println("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.println("Enter owner name: ");
        String ownerName = scanner.next();
        System.out.println("Enter balance: ");
        double balance = scanner.nextDouble();
        bank.addAccount(new BankAccount(accountNumber, ownerName, balance));
    }

    public static void deleteAccount(Bank bank){
        System.out.println("Enter account index: ");
        int index = scanner.nextInt();
        bank.deleteAccount(index);
    }

    public static void userInput(Bank bank){
        String response = "Yes";
        while (!response.equals("No")){
            displayMenu();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addAccount(bank);
                    break;
                case 2:
                    deleteAccount(bank);
                    break;
                case 3:
                    bank.displayAccounts();
                    break;
                case 4:
                    System.out.println("Total balance: " + bank.totalBalance());
                    break;
                case 5:
                    response = "No";
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}
