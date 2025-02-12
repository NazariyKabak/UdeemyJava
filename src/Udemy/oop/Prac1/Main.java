package Udemy.oop.Prac1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionManager transactionManager = new TransactionManager();

        System.out.println("Введіть назву угоди:");
        String dealName = scanner.nextLine();

        System.out.println("Введіть ім'я покупця:");
        String buyerName = scanner.nextLine();

        System.out.println("Введіть контактну інформацію покупця:");
        String buyerContactInfo = scanner.nextLine();

        System.out.println("Введіть ім'я продавця:");
        String sellerName = scanner.nextLine();

        System.out.println("Введіть контактну інформацію продавця:");
        String sellerContactInfo = scanner.nextLine();

        System.out.println("Кількість товарів:");
        int count = scanner.nextInt();
        scanner.nextLine();

        Product [] products = new Product[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Введіть назву товару:" + (i+1)+":");
            String productName = scanner.nextLine();

            System.out.println("Введіть ціну товару:");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Введіть кількість товару:");
            int productCount = scanner.nextInt();
            scanner.nextLine();

            products[i] = new Product(productName, productPrice, productCount);
            
        }
        Deals deals = new Deals(dealName, " Опис угоди ", products, new Participant(buyerName, buyerContactInfo), new Participant(sellerName, sellerContactInfo));
        transactionManager.addDeal(deals);
        transactionManager.printDeals();
                
    }
}
