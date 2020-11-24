package com.nc.autumn2020;

import com.nc.autumn2020.lessonFileVisitor.FileVisitorSolution;
import com.nc.autumn2020.solutions.enumHomework.EnumHomeworkSolution;
import com.nc.autumn2020.solutions.enumHomework.Week;
import com.nc.autumn2020.solutions.lesson12AnnotationsHomework.Solution;
import com.nc.autumn2020.solutions.lesson5RandomProvider.RandomProviderSolution;
import com.nc.autumn2020.solutions.streamHomework.StreamSolution;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        StreamSolution streamSolution = new StreamSolution();
        streamSolution.executeSolution(args);
        /*
        RandomProviderSolution x = new RandomProviderSolution();

        try {
            x.executeSolution(args);
        } catch (Exception e) {
            e.printStackTrace();
        }*/


    }
}
