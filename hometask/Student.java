package Aston.hometask;

import java.util.List;

public class Student {

    private final String name;
    private final List<Book> books;

    public Student(String name, List<Book> books) {
        if (books == null) {
            throw new IllegalArgumentException(String.format("У студента %s список книг не может быть null!", name));
        }

        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', books=%s}", name, books);
    }

}

