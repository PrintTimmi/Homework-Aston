package ru.aston.hometask.decorator;

public class SauceDecorator extends BurgerDecorator {
    public SauceDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " + соус";
    }

    @Override
    public int getCost() {
        return burger.getCost() + 30;
    }
}
