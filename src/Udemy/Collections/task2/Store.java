package Udemy.Collections.task2;

import java.util.ArrayList;
import java.util.Objects;

public class Store {

    private ArrayList<Book> books;

    public Store() {
        this.books = new ArrayList<Book>();
    }

    public Book getBooks(int index) {
        return new Book(books.get(index));
    }

    public void setBooks(int index, Book book) {
        this.books.set(index, new Book(book));
    }

    public void addBook(Book book) {
        this.books.add(new Book(book));
    }

    public void sellBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                break;
            }
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public boolean contains(Book book) {
        return books.contains(book);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(books, store.books);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(books);
    }
}
