package ru.aston.hometask.decorator;

public class BaconDecorator extends BurgerDecorator {
    public BaconDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " + бекон";
    }

    @Override
    public int getCost() {
        return burger.getCost() + 80;
    }
}
