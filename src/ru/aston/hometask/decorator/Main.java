package ru.aston.hometask.decorator;

public class Main {
    public static void main(String[] args) {

        Burger burger = new SimpleBurger();
        System.out.println(burger.getDescription() + " — " + burger.getCost() + " руб.");

        burger = new CheeseDecorator(burger);
        System.out.println(burger.getDescription() + " — " + burger.getCost() + " руб.");

        burger = new BaconDecorator(burger);
        System.out.println(burger.getDescription() + " — " + burger.getCost() + " руб.");

        burger = new SauceDecorator(burger);
        System.out.println(burger.getDescription() + " — " + burger.getCost() + " руб.");
    }
}

