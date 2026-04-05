package ru.aston.hometask.livelock;

public class LiveLock {
    static boolean thread1Acting = true;

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            while (true) {
                if (!thread1Acting) {
                    System.out.println("Поток 1 действует");
                    thread1Acting = true;
                } else {
                    thread1Acting = false;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                if (thread1Acting) {
                    System.out.println("Поток 2 действует");
                    thread1Acting = false;
                } else {
                    thread1Acting = true;
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
