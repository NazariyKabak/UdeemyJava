package Udemy.oop.task2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthday;
    private int age;

    public Contact(String name, String phoneNumber, String birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.age = calculateAge(birthday);
    }
    public Contact(Contact contact) {
        this.name = contact.name;
        this.phoneNumber = contact.phoneNumber;
        this.birthday = contact.birthday;
        this.age = contact.age;
    }
    public int calculateAge(String birthday) {
        LocalDate parsedBirthDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(parsedBirthDate, currentDate);
        return period.getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return calculateAge(birthday);
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                '}';
    }
}
