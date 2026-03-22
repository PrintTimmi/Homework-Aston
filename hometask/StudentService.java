package Aston.hometask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public List<Student> readStudentsFromFile(String fileName) {

        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            String currentName = null;
            List<Book> currentBooks = new ArrayList<>();

            while ((line = reader.readLine()) != null) {

                if (line.isBlank()) continue;

                if (line.startsWith("STUDENT:")) {
                    if (currentName != null) {
                        students.add(new Student(currentName, new ArrayList<>(currentBooks)));
                        currentBooks.clear();
                    }
                    currentName = line.substring(8);

                } else if (line.startsWith("BOOK:")) {
                    String[] parts = line.substring(5).split(":");
                    currentBooks.add(new Book(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3])));
                }
            }

            if (currentName != null) {
                students.add(new Student(currentName, new ArrayList<>(currentBooks)));
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        return students;
    }

    public void processStudents(List<Student> students) {

        students.stream()
                .peek(student -> System.out.println("Студент: " + student))
                .flatMap(student -> student.getBooks().stream())
                .sorted()
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(year -> System.out.println("Год выпуска найденной книги: " + year), () -> System.out.println("Такая книга отсутствует"));
    }
}

