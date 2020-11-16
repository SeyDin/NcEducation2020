package com.nc.autumn2020.solutions.lesson5RandomProvider;

import com.nc.autumn2020.LessonApi;

import java.net.MalformedURLException;
import java.util.Arrays;

public class RandomProviderSolution implements LessonApi {

    @Override
    public void executeSolution(String[] args) throws Exception {
        try (RandomProvider randomProvider = new RandomProvider(2)) {
            System.out.println("Hurray!");
            System.out.println(randomProvider.getNumber());
            System.out.println(randomProvider.getNumber());
            System.out.println(randomProvider.getNumber());
        }

        // Работа метода clear
        /*RandomProvider randomProvider1 = new RandomProvider(10);
        randomProvider1.clearRandomProvider();
        System.out.println(Arrays.toString(randomProvider1.getRandomNumbers()));*/
    }
}
