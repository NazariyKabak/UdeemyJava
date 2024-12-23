package Udemy.oop.task1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Store store = new Store();
    public static void main(String[] args) {
        Movie [] movie ={
                new Movie("The Shawshank Redemption", "BlueRay", 9.2),
                new Movie("The Godfather", "BlueRay", 9.1),
                new Movie("The Godfather: Part II", "DVD", 9.0),
                new Movie("12 Angry Men", "DVD", 8.9),
                new Movie("The Dark Knight", "BlueRay", 9.0),
                new Movie("Schindler's List", "DVD", 8.9),
                new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
                new Movie("Pulp Fiction", "DVD", 8.8),
                new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
                new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };
        for (int i = 0; i < movie.length; i++) {
            store.setMovie(i, movie[i]);
        }
        printStore();
        userInput();


    }

    public static void userInput() {
        String status = "continue";
        while (status.equals("continue")) {
            System.out.println("Please choose an integer between 0 - 9: ");
            int choice = scanner.nextInt();
            Movie movie = store.getMovie(choice);
            System.out.println("Set a new rating for the movie: " + movie.getName());
            double rating = scanner.nextDouble();
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }

    public static void printStore() {
        store.displayMovies();
    }
}