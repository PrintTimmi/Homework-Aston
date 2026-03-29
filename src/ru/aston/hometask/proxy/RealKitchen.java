package ru.aston.hometask.proxy;

public class RealKitchen implements Kitchen {
    @Override
    public void prepareOrder(String order) {
        System.out.println("Кухня готовит: " + order);
    }
}
