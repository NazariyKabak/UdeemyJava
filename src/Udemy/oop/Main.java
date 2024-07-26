package Udemy.oop;

import java.util.Arrays;
import java.util.Scanner;
//Інкапсуляція - це ключовий принцип об'єктно-орієнтованого програмування,
// який передбачає обмеження прямого доступу до деяких компонентів об'єкта,
// тобто його полів або змінних. Це досягається шляхом оголошення полів закритими,
// що означає, що до них не можна отримати прямий доступ або змінити.
// Для взаємодії з цими полями ми використовуємо загальнодоступні методи,
// відомі як «геттери» (які дозволяють отримати значення поля) та «сеттери» (які дозволяють змінити значення).
// Це не тільки забезпечує цілісність даних, але й підвищує безпеку,
// оскільки не дозволяє зовнішньому коду змінювати значення полів у небажаний спосіб.

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
//        String [] parts1={"engine", "wheel", "door"};
//        System.out.println(Arrays.toString(parts1));
//        Car car = new Car("Kia",180_000,2013,"silver",new String[]{"door", "wheel"});
//        System.out.println(car);
//        System.out.println("Original parts in car1: "+Arrays.toString(car.getParts()));
//
//        System.out.println(Arrays.toString(parts1));
//        System.out.println("Parts in car1 after modifying parts1: " + Arrays.toString(car.getParts()));
//
//        Car car2= new Car(car);
//        car2.setParts(new String[]{"battery", "tire"});
//        System.out.println("Parts in car1 after modifying car2 parts: " + Arrays.toString(car.getParts()));
//        System.out.println("Parts in car2: " + Arrays.toString(car2.getParts()));

//        Car2 car21 = new Car2("Toyota", 20000, 2020, "red", parts1);
//        System.out.println("Original parts in car1: "+Arrays.toString(car21.getParts()));
//        parts1[0]="new engine";
//        System.out.println("Parts in car1 after modifying parts1: " + Arrays.toString(car21.getParts()));
//        Car2 car22= new Car2(car21);
//        car22.setParts(new String[]{"battery", "tire"});
//        System.out.println("Parts in car1 after modifying car2 parts: " + Arrays.toString(car21.getParts()));
//        System.out.println("Parts in car2: " + Arrays.toString(car22.getParts()));


//        car.drive();
//        car2.drive();
//        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
//        person.setPassport(new String[]{person.getName(), person.getNationality(), person.getDateOfBirth()});
//        if (person.applyPassport()){
//            System.out.println("Congratulations "+ person.getName()+". Your passport was approved!" + Arrays.toString(person.getPassport()));
//        }else {
//            System.out.println("We are sorry " + person.getName() + ". We cannot process your application."+Arrays.toString(person.getPassport()));
//        }
//        Dessert cake = new Dessert(4.99);
//
//        cake.setIngredients(new String[]{"Eggs", "Flower", "Baking Powder"});
//        Dessert pie = new Dessert(cake);
//        System.out.println(Arrays.toString(cake.getIngredients()));
//        System.out.println(Arrays.toString(pie.getIngredients()));
    }
    private void run() {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
                new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
                new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
                new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
                new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
        Dealership dealership = new Dealership(cars);
        Car carAtIndex0=dealership.getCar(0);
        System.out.println("Original make: "+carAtIndex0.getMake());

        carAtIndex0.setMake("Toyota");
        System.out.println("Modified make: "+carAtIndex0.getMake());
        System.out.println("Dealership car make: " +dealership.getCar(0).getMake());
        Car newCar= new Car("BMW", 10000, 2018,"silver", new String[] {"tires", "keys"});
        dealership.setCar(1, newCar);
        System.out.println(dealership.getCar(1));
        newCar.setMake("Audi");
//        System.out.println(dealership);
//        int index =scanner.nextInt();
//        dealership.sell(index);
    }
}
