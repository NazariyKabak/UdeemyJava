package Udemy.oop.Prac2;

public class Book {
    private String title;
    private String author;
    private int price;
    private int discount;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Title: "+title+" Author: "+author+" Price: "+price);
    }

    public double applyDiscount(int discount){
        this.discount = discount;
        price = price - price * discount / 100;
        return price;
    }

}
