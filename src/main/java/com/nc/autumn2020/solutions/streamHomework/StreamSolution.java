package com.nc.autumn2020.solutions.streamHomework;

import com.nc.autumn2020.LessonApi;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Collection;

public class StreamSolution implements LessonApi {
    @Override
    public void executeSolution(String[] args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException, Exception {
        Collection<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        long x = arr.stream().filter((n) -> n % 2 == 0).count();
        System.out.println(x);
    }
}
