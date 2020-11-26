package com.nc.autumn2020.solutions.semaphoreHomework;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {
    private Semaphore semaphore;
    private String name;
    private int timeToEat;

    public Philosopher(Semaphore semaphore, String name, int timeToEat) {
        this.semaphore = semaphore;
        this.name = name;
        this.timeToEat = timeToEat;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(name + " начал есть");
            Thread.sleep(timeToEat);
            System.out.println(name + " закончил есть");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
