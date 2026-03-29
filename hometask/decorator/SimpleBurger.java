package ru.aston.hometask.decorator;

public class SimpleBurger implements Burger {
    @Override
    public String getDescription() {
        return "Бургер";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
