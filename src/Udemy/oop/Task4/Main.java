package Udemy.oop.Task4;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Product [] products ={
                new Product("Apple", 1.0, 10),
                new Product("Banana", 0.5, 20),
                new Product("Orange", 1.5, 5),
                new Product("Pineapple", 2.0, 3),
                new Product("Mango", 3.0, 2)
        };
        Store store = new Store(products);
        inputUserChoice(store);

    }

    public static void displayMenu(){
        System.out.println("1. Add product");
        System.out.println("2. Display products");
        System.out.println("3. Delete product");
        System.out.println("4. Exit");
    }

    public static Product createProduct(){
        System.out.println("Enter product name: ");
        String name = scanner.next();
        System.out.println("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter product quantity: ");
        int quantity = scanner.nextInt();
        return new Product(name, price, quantity);
    }

    public static void inputUserChoice(Store store){
        String answer = "continue";
        while (answer.equals("continue")){
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    store.addProduct(createProduct());
                    break;
                case 2:
                    store.displayProducts();
                    break;
                case 3:
                    System.out.println("Enter product index: ");
                    int index = scanner.nextInt();
                    store.deleteProduct(index);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            answer=scanner.next();
        }
    }
}
