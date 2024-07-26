package Udemy.oop;

import java.util.Arrays;

public class Dealership {
    private Car [] cars;

    public Dealership(Car[] cars) {
//        this.cars = Arrays.copyOf(cars, cars.length);
        this.cars = new Car[cars.length];
        for (int i=0; i<this.cars.length; i++) {
            this.cars[i] =new Car( cars[i]);
        }
    }

    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }
    public void setCar(int index, Car car) {
        Car copy = new Car(car);
        this.cars[index] = car;
    }

    public void sell(int index){
       this.cars[index].drive();
    }
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < this.cars.length; i++) {
            temp.append("Parking Spot: ").append(i).append("\n");
            String carDescription = this.cars[i].toString();
            temp.append(carDescription).append("\n");
        }
        return temp.toString();
    }
}
