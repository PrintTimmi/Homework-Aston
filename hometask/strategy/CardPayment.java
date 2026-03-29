package ru.aston.hometask.strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Заказ оплачен картой: " + amount + " рублей.");
    }
}
