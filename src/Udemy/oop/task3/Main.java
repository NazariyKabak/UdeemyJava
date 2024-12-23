package Udemy.oop.task3;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Book [] books = {
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "Novel", 1925),
                new Book("To Kill a Mockingbird", "Harper Lee", "Novel", 1960),
                new Book("1984", "George Orwell", "Novel", 1949),
                new Book("Pride and Prejudice", "Jane Austen", "Novel", 1813)
        };
        Library library = new Library(books);

        inputUserChoice(library);

    }
    public static void inputUserChoice(Library library){
        String answer = "go";
        while (answer.equals("go")){
            System.out.println("Do you want to continue? (yes/no)");
            answer = scanner.nextLine();
            System.out.println("1. Display all books");
            System.out.println("2. Add a book");
            System.out.println("3. Remove a book");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    library.addBook(inputBookDetails());
                    library.displayBooks();
                    break;
                case 3:
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index >=0 && index < library.getBooksCount()){
                        library.removeBook(index);
                        System.out.println("Book removed successfully");
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }

    public static Book inputBookDetails() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter publication year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return new Book(title, author, genre, publicationYear);
    }
}
