package threads;

import java.util.concurrent.TimeUnit;

// Creating new thread
public class Main {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);
        printThreadInfo(currentThread);

        System.out.println("-".repeat(20));
        MyThread myThread = new MyThread();
        Thread threadWithLambda = new Thread(() -> {
            for (int i = 0; i < 8; i++) {
                System.out.print(" 2 ");
                try {
                    TimeUnit.MILLISECONDS.sleep(300);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        });

        // asynchronous
        myThread.start();
        threadWithLambda.start();

        for (int i = 1; i <= 3; i++) {
            System.out.print("0 ");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // TODO: handle exception
            }
        }
        // synchronous
        // myThread.run();

        // for (int i = 1; i <= 3; i++) {
        // System.out.print("0 ");
        // try {
        // Thread.sleep(600);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // // TODO: handle exception
        // }
        // }
    }

    public static void printThreadInfo(Thread thread) {
        System.out.println("-".repeat(20));
        System.out.println("Thread ID: " + thread.threadId());
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread priority: " + thread.getPriority());
        System.out.println("thread state: " + thread.getState());
        System.out.println("Thread group: " + thread.getThreadGroup());
        System.out.println("Thread is alive: " + thread.isAlive());
    }
}