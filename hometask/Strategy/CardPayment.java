package ru.aston.hometask.Strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Заказ оплачен картой: " + amount + " рублей.");
    }
}
