package Udemy.oop.task3;

public class Library {
    private Book [] books;

    public Library(Book [] books){
        this.books = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            this.books[i] = new Book(books[i]);
        }
    }

    public Book getBoo(int index) {
        return new Book(books[index]);
    }

    public void setBook(Book book, int index) {
        Book copyBook = new Book(book);
        this.books[index] = copyBook;
    }

    public void displayBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addBook(Book book){
        Book [] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = new Book(book);
        books = newBooks;
    }
    public void removeBook(int index){
        books[index] = null;
    }
    public int getBooksCount(){
        return books.length;
    }


}
