package Udemy.oop.Prac2;

import Udemy.oop.Prac1.Participant;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2020);
        car.display();

        Person person = new Person("Вася", 25);
        person.introduce();

        Book book1 = new Book("Java для початківців", "Генрі Шилдт", 40);
        book1.applyDiscount(10);
        book1.display();

        Calculator calculator = new Calculator(5, 10);
        System.out.println(calculator.add());
    }
}
