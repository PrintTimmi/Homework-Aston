package ru.aston.hometask.adapter;

public class OldCashRegister {
    public void addItem(String item) {
        System.out.println("Старая касса: добавлен товар — " + item);
    }

    public void printReceipt() {
        System.out.println("Старая касса: чек распечатан");
    }
}
