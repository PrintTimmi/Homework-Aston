package ru.aston.hometask.strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Заказ оплачен наличными: " + amount + " рублей.");
    }
}
