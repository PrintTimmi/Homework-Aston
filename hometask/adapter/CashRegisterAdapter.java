package ru.aston.hometask.adapter;

public class CashRegisterAdapter implements ModernCashRegister {
    private final OldCashRegister oldCashRegister;

    public CashRegisterAdapter(OldCashRegister oldCashRegister) {
        this.oldCashRegister = oldCashRegister;
    }

    @Override
    public void processOrder(String item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            oldCashRegister.addItem(item);
        }
        oldCashRegister.printReceipt();
    }
}
