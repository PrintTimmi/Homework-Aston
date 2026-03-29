package ru.aston.hometask.decorator;

public class CheeseDecorator extends BurgerDecorator {
    public CheeseDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " + сыр";
    }

    @Override
    public int getCost() {
        return burger.getCost() + 50;
    }
}
