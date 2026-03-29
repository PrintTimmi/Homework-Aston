package ru.aston.hometask.chain;

public class KitchenHandler extends OrderHandler {
    @Override
    public void handle(String order) {
        System.out.println("Кухня готовит: " + order);
    }
}
