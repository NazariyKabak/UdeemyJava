package Udemy.oop;

import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String [] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person person) {
        this.name = person.name;
        this.nationality = person.nationality;
        this.dateOfBirth = person.dateOfBirth;
        this.seatNumber = person.seatNumber;
        this.passport = new String[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean applyPassport() {
        int number = (int) (Math.random() * 2);
        if (number==1){
            return true;
        }else {
            return false;
        }
    }
    public void chooseSeat(){
        seatNumber=(int) (Math.random() * 11 + 1);

    }

    public String[] getPassport() {
        return Arrays.copyOf(passport, passport.length);
    }

    public void setPassport(String[] passport) {
        this.passport = Arrays.copyOf(passport, passport.length);
    }
}
