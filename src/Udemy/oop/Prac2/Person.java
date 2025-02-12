package Udemy.oop.Prac2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.println("Привіт мене звати "+name+" мені "+age+" років");
    }
}
