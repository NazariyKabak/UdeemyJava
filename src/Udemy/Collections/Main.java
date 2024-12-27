package Udemy.Collections;

import Udemy.Collections.task1.Movie;
import Udemy.Collections.task2.Book;
import Udemy.Collections.task2.Store;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO: create cities ArrayList;
        List<String> cities = new ArrayList<>();
        // cities.add("Paris");
        // cities.add("Florence");
        // cities.add("Venice");
        // cities.add("Versailles");
        // cities.add("London");
        // cities.add("Petra");
        // cities.add("Oslo");
        // cities.add("Rome");
        // cities.add("Madrid");
        // cities.add("Tokyo");
        // cities.add("Prague");
        // cities.add("Dublin");
        // cities.add("Athens");
        // cities.add("Marseille");
        // cities.add("Chicago");

        // System.out.println(cities.size());
        // System.out.println(cities.get(5));
        // System.out.println(cities.get(8));
        // cities.set(2, "Naples");
        // cities.remove(5);
        Main main = new Main();
        main.run3();
    }

    public void run1(){
        Movie[] movies = new Movie[] {
                new Movie("The Shawshank Redemption", "BlueRay", 9.2),
                new Movie("The Godfather", "BlueRay", 9.1),
                new Movie("The Godfather: Part II", "DVD", 9.0),
                new Movie("12 Angry Men", "DVD", 8.9),
                new Movie("The Dark Knight", "BlueRay", 9.0),
                new Movie("Schindlers List", "DVD", 8.9),
                new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
                new Movie("Pulp Fiction", "DVD", 8.8),
                new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
                new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

//        for(Movie movie : movies){
//            store.addMovie(movie);
//        }

    }
    public void run2(){
        City paris = new City("Paris", 2161000);
        City copy = paris;

        System.out.println(paris.equals(copy));
        copy.setPopulation(2059003);
        paris.setPopulation(3129003);

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Paris", 2161000));
        cities.add(new City("Florence", 382258));
        cities.add(new City("Venice", 261905));
        cities.add(new City("Versailles", 85771));
        cities.add(new City("London", 8982000));

        System.out.println(cities.contains(paris));
    }

    public void run3(){
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);

        Store store = new Store();
        store.addBook(book1);
        store.addBook(book2);

        // Test the getBook method
        Book retrievedBook = store.getBooks(0);
        System.out.println(retrievedBook.getTitle());

        // Test the setBook method
        Book newBook = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
        store.setBooks(0, newBook);

        // Verify that the book was updated
        retrievedBook = store.getBooks(0);
        System.out.println(retrievedBook.getTitle());

        // Test the contains method
        System.out.println(store.contains(book2)); // should be true before selling the book

        // Test the sellBook method
        store.sellBook("1984");
        System.out.println(store.contains(book2)); // should be false now


    }

}
