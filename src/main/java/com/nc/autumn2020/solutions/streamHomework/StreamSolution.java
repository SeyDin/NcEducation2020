package com.nc.autumn2020.solutions.streamHomework;

import com.nc.autumn2020.LessonApi;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamSolution implements LessonApi {
    @Override
    public void executeSolution(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<List> arr2dim = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr2dim.add(arr);
        }

        long x2 = arr2dim.stream().flatMap(array -> array.stream().filter((n) -> (Integer) n % 2 == 0)).count();
        System.out.println(x2);
    }
}
