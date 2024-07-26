package Udemy.oop;

import java.util.Arrays;

public class Car2 {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
    public Car2(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = parts;
    }
    //copy constructor
    public Car2(Car2 source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = source.parts;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getParts() {
        return parts;
    }

    public void setParts(String[] parts) {
        this.parts = parts ;
    }

    public void drive(){
        System.out.println("\nYou bought the beautiful " + this.year+" " + this.color+" "+this.make+" for "+this.price);
        System.out.println("Please drive you car to the nearest exit.\n");
    }
}
