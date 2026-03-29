package Aston.ru.aston.hometask2;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        List<Student> students = service.readStudentsFromFile("students.txt");

        service.processStudents(students);
    }
}

