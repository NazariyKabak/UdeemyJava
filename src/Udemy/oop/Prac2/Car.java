package Udemy.oop.Prac2;

public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void display(){
        System.out.println("Brand: "+brand+" Year: "+year);
    }
}
