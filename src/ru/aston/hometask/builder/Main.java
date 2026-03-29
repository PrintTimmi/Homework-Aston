package ru.aston.hometask.builder;

public class Main {
    public static void main(String[] args) {

        Burger classic = new Burger.Builder()
                .bun("пшеничная")
                .patty("говядина")
                .sauce("кетчуп")
                .cheese(true)
                .lettuce(true)
                .build();

        System.out.println(classic);

        Burger simple = new Burger.Builder()
                .bun("обычная")
                .patty("курица")
                .sauce("майонез")
                .build();

        System.out.println(simple);
    }
}

