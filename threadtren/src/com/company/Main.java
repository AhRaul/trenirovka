package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("new thread: " + i);
                }
            }
        });
        //executorService.shutdown();

        executorService.execute(new Runnable() {
            public void run() {
                for (int i = 100; i < 200; i++) {
                    System.out.println("new thread: " + i);
                }
            }
        });
        //executorService.shutdown();

        executorService.execute(new Runnable() {
            public void run() {
                for (int i = 200; i < 300; i++) {
                    System.out.println("new thread: " + i);
                }
            }
        });
        executorService.shutdown();
    }
}