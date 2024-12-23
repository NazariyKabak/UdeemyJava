package Udemy.Collections.task2;

import Udemy.Collections.task1.Movie;

import java.util.ArrayList;
import java.util.Objects;

public class Sore {
    private ArrayList<Book> books;
    public Sore() {
        books = new ArrayList<>();
    }

    public Book getBooks(int index) {
        return new Book(books.get(index));
    }

    public void setBooks(int index, Book book) {
        this.books.set(index, book);
    }

    public void addBook(Book book) {
        this.books.add(new Book(book));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sore sore = (Sore) o;
        return Objects.equals(books, sore.books);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(books);
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    public void sellBook(String title){
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle().equals(title)) {
                this.books.remove(i);
            }
        }
    }

}
