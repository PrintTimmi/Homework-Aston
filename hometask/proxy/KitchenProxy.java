package ru.aston.hometask.proxy;

public class KitchenProxy implements Kitchen {
    private final RealKitchen realKitchen = new RealKitchen();

    @Override
    public void prepareOrder(String order) {
        System.out.println("Менеджер проверяет заказ: " + order);

        realKitchen.prepareOrder(order);

        System.out.println("Менеджер уведомляет клиента: " + order + " готов!");
    }
}
