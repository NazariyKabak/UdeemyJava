package Udemy.oop.Workbook7_8;

import Udemy.oop.Person;

public class Airline {
    private Person[] people;

    public Airline() {
        this.people = new Person[11];
    }

    public Person getPeople(int index) {
        Person person = people[index];
        return new Person(person);
    }

    public void setPeople(Person person) {
        int index = person.getSeatNumber()-1;
        people[index] = new Person(person);
    }

    public void createReservation(Person person) {
        int index = person.getSeatNumber()-1;
        while (people[index] != null) {
            System.out.println("Sorry " + person.getName() + ", seat " + person.getSeatNumber() + " is already taken.");
            person.chooseSeat();
            index = person.getSeatNumber()-1;
        }
        people[index] = new Person(person);
        System.out.println("Thank you " + person.getName()+" for your reservation");

    }
}
