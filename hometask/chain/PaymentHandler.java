package ru.aston.hometask.chain;

public class PaymentHandler extends OrderHandler {
    @Override
    public void handle(String order) {
        System.out.println("Оплата прошла - можно начинать готовить.");
        if (next != null) {
            next.handle(order);
        }
    }
}
