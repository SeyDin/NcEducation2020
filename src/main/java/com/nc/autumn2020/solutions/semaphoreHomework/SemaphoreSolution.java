package com.nc.autumn2020.solutions.semaphoreHomework;

import com.nc.autumn2020.LessonApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SemaphoreSolution implements LessonApi {

    @Override
    public void executeSolution(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        Philosopher philosopher0 = new Philosopher(semaphore, "Platon", 3000);
        Philosopher philosopher1 = new Philosopher(semaphore, "Sokrat", 2000);
        Philosopher philosopher2 = new Philosopher(semaphore, "Diogen", 1);
        Philosopher philosopher3 = new Philosopher(semaphore, "Piphagor", 3000);
        Philosopher philosopher4 = new Philosopher(semaphore, "Piphagor1", 3000);
        Philosopher philosopher5 = new Philosopher(semaphore, "Piphagor2", 3000);
        Philosopher philosopher6 = new Philosopher(semaphore, "Piphagor3", 3000);

        List<Philosopher> philosophers = new ArrayList<>(Arrays.asList(philosopher0, philosopher1,
                philosopher2, philosopher3, philosopher4, philosopher5, philosopher6));

        for (Philosopher philosopher : philosophers
             ) {
            new Thread(philosopher).start();
        }


    }
}
