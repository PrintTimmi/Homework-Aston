package ru.aston.hometask.adapter;

public class Main {
    public static void main(String[] args) {
        OldCashRegister oldRegister = new OldCashRegister();

        ModernCashRegister register = new CashRegisterAdapter(oldRegister);

        register.processOrder("чизбургер", 2);
        System.out.println("---");
        register.processOrder("картошка фри", 3);
    }
}
