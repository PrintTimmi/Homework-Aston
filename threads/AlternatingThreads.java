package ru.aston.hometask.threads;

public class AlternatingThreads {
    private static volatile boolean firstTurn = true;

    static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            while (true) {
                if (firstTurn) {
                    System.out.println("1");
                    firstTurn = false;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                if (!firstTurn) {
                    System.out.println("2");
                    firstTurn = true;
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
