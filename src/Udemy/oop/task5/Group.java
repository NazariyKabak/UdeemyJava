package Udemy.oop.task5;

public class Group {
    private Student[] students;

    public Group(Student[] students) {
        this.students = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            this.students[i] = new Student(students[i]);
        }
    }

    public Student getStudent(int index) {
        return new Student(students[index]);
    }

    public void setStudent(Student student, int index) {
        Student copyStudent = new Student(student);
        this.students[index] = copyStudent;
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void addStudent(Student student){
        Student[] newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[students.length] = new Student(student);
        students = newStudents;
    }

    public void deleteStudent(int index){
        Student[] newStudents = new Student[students.length - 1];
        System.arraycopy(students, 0, newStudents, 0, index);
        System.arraycopy(students, index + 1, newStudents, index, students.length - index - 1);
        students = newStudents;
    }
}
