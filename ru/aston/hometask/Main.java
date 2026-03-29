package Aston.ru.aston.hometask;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        List<Student> students = service.readStudentsFromFile("students.txt");

        service.processStudents(students);
    }
}

