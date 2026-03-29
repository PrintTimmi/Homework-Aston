package ru.aston.hometask.Strategy;

public class Main {
    static void main(String[] args) {
        BurgerShop shop = new BurgerShop();

        shop.setPaymentStrategy(new CardPayment());
        shop.checkout(500);

        shop.setPaymentStrategy(new CashPayment());
        shop.checkout(400);
    }
}
