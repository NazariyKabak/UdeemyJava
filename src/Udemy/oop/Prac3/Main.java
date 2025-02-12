package Udemy.oop.Prac3;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.display();
        Product product1 = new Product();
        product1.display();

        BankAccount acc1 = new BankAccount("Maria", 1);
//        BankAccount acc2 = new BankAccount("Nazar", 2, 5000);
        BankAccount acc3 = new BankAccount("Nazar", 2, 5000);

        acc1.display();
//        acc2.display();
        acc3.display();
    }
}
