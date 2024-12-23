package Udemy.oop.task5;

public class Student {
    private String name;
    private int studentId;
    private int grade;

    public Student(String name, int studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public Student(Student student) {
        this.name = student.name;
        this.studentId = student.studentId;
        this.grade = student.grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }
}
