package ru.aston.hometask.chain;

public class StockHandler extends OrderHandler {
    @Override
    public void handle(String order) {
        if (order.equals("Веганский бургер")) {
            System.out.println("Стоп-лист: " + order + " - ингредиентов нет.");
        } else {
            System.out.println("Ингредиенты есть - можно оплачивать.");
            if (next != null) {
                next.handle(order);
            }
        }
    }
}
