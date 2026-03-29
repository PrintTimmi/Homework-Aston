package ru.aston.hometask.proxy;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new KitchenProxy();
        kitchen.prepareOrder("Двойной чизбургер");
        kitchen.prepareOrder("Картошка фри");
    }
}
