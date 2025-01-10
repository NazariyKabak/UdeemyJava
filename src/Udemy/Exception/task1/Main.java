package Udemy.Exception.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = promptForTitle(scanner);
        String publisher = promptForPublisher(scanner);
        int issueNumber = promptForIssueNumber(scanner);
        int publicationYear = promptForPublicationYear(scanner);

        Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);

        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);

        System.out.println("Magazine added to the library: " + newMagazine.getTitle());
    }

    public static boolean isNullOrBlank(String str) {
        return str == null || str.isBlank();
    }

    public static boolean incorrectPublicationYear(int publicationYear) {
        return publicationYear <= 0;
    }

    public static String promptForTitle(Scanner scanner){
        while (true) {
            System.out.println("Enter the title: ");
            String title = scanner.nextLine();
            if (!isNullOrBlank(title)) {
                return title;
            }
        }
    }

    public static String promptForPublisher(Scanner scanner){
        while (true) {
            System.out.println("Enter the publisher: ");
            String publisher = scanner.nextLine();
            if (!isNullOrBlank(publisher)) {
                return publisher;
            }
        }
    }

    public static int promptForIssueNumber(Scanner scanner){
        while (true) {
            System.out.println("Enter the issue number: ");
            int issueNumber = scanner.nextInt();
            if (issueNumber > 0) {
                return issueNumber;
            }
        }
    }

    public static int promptForPublicationYear(Scanner scanner){
        while (true) {
            System.out.println("Enter the publication year: ");
            int publicationYear = scanner.nextInt();
            if (publicationYear > 0) {
                return publicationYear;
            }
        }
    }
}
