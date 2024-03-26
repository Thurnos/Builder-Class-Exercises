package org.example;

public class CountingTask implements Runnable {
    private static final int MAX_COUNT = 100;
    private static int count = 1;
    private static final Object lock = new Object();

    @Override
    public void run() {
        while (count <= MAX_COUNT) {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + ": " + count++);
            }
        }
    }
}