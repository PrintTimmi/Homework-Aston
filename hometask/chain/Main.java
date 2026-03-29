package ru.aston.hometask.chain;

public class Main {
    public static void main(String[] args) {
        StockHandler stock = new StockHandler();
        PaymentHandler payment = new PaymentHandler();
        KitchenHandler kitchen = new KitchenHandler();

        stock.setNext(payment);
        payment.setNext(kitchen);

        System.out.println("*** Заказ 1 ***");
        stock.handle("Чизбургер");

        System.out.println("*** Заказ 2 ***");
        stock.handle("Веганский бургер");
    }
}
