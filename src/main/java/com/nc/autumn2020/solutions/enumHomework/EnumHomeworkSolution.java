package com.nc.autumn2020.solutions.enumHomework;

import com.nc.autumn2020.LessonApi;

import java.net.MalformedURLException;
import java.util.Scanner;

public class EnumHomeworkSolution implements LessonApi {
    @Override
    public void executeSolution(String[] args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException, Exception {
        String x;
        try (Scanner scanner = new Scanner(System.in)) {
            x = scanner.nextLine();
        }

        String[] days = x.split(" ");
        int maxIndex = -1;
        /*
        Week maxDay = Week.MONDAY; // Пока не придумал как всё сделать элегантно с compareTo
         Поэтому пока вариант с ordinal
        */
        for (String day: days
        ) {
            int ordinal = Week.valueOf(day.toUpperCase()).ordinal();
            if (maxIndex < ordinal){
                maxIndex = ordinal;
            }
           // if (maxDay.compareTo(Week.valueOf(day.toUpperCase())) > ){}
        }
        System.out.println(Week.valueOf(Week.values()[maxIndex].toString()).phrase());


    }
}
