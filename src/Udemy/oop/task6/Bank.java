package Udemy.oop.task6;

public class Bank {
    private BankAccount [] accounts;

    public Bank(BankAccount[] accounts) {
        this.accounts =  new BankAccount[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            this.accounts[i] = new BankAccount(accounts[i]);
        }
    }

    public BankAccount getAccount(int index) {
        return new BankAccount(accounts[index]);
    }

    public void setAccount(BankAccount accounts, int index) {
        this.accounts[index] = new BankAccount(accounts);
    }

    public void displayAccounts() {
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }

    public void addAccount(BankAccount account){
        BankAccount [] newAccounts = new BankAccount[accounts.length + 1];
        System.arraycopy(accounts, 0, newAccounts,0, accounts.length);
        newAccounts[accounts.length] = new BankAccount(account);
        accounts = newAccounts;
    }

    public void deleteAccount(int index){
        BankAccount [] newAccounts = new BankAccount[accounts.length - 1];
        System.arraycopy(accounts, 0, newAccounts, 0, index);
        System.arraycopy(accounts, index + 1, newAccounts, index, accounts.length - index - 1);
        accounts = newAccounts;
    }

    public double totalBalance(){
        double total = 0;
        for (BankAccount account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}
