package ru.aston.hometask.decorator;

public abstract class BurgerDecorator implements Burger {
    protected final Burger burger;

    protected BurgerDecorator(Burger burger) {
        this.burger = burger;
    }
}
