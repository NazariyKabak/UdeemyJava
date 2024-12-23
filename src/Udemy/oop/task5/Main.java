package Udemy.oop.task5;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Student [] students = {
            new Student("John", 1, 90),
            new Student("Jane", 2, 80),
            new Student("Doe", 3, 70)
        };
        Group group = new Group(students);
        userInput(group);
    }

    public static void displayMenu(){
        System.out.println("1. Add student");
        System.out.println("2. Display students");
        System.out.println("3. Delete student");
        System.out.println("4. Exit");
        System.out.println("5. Get student");
    }

    public static void addStudent(Group group){
        System.out.println("Enter student name: ");
        String name = scanner.next();
        System.out.println("Enter student id: ");
        int id = scanner.nextInt();
        System.out.println("Enter student grade: ");
        int grade = scanner.nextInt();
        Student student = new Student(name, id, grade);
        group.addStudent(student);
    }

    public static void userInput(Group group){
        String answer = "";

        while (!answer.equals("exit")){
            displayMenu();
            answer = scanner.next();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addStudent(group);
                    break;
                case 2:
                    group.displayStudents();
                    break;
                case 3:
                    int index = scanner.nextInt();
                    System.out.println("Enter student index: ");
                    group.deleteStudent(index);
                    break;
                case 4:
                    answer = "exit";
                    break;
                case 5:
                    int getStudentIndex = scanner.nextInt();
                    group.getStudent(getStudentIndex);
                default:
                    System.out.println("Invalid input");
            }
        }
    }


}
