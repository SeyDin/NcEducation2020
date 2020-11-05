package com.nc.autumn2020;

import com.nc.autumn2020.lesson6Practice.DynamicClassLoaderExample;
import com.nc.autumn2020.lesson6Practice.urlki.RunUrlHolderExample;
import com.nc.autumn2020.lesson6Practice.urlki.UrlHolder;
import com.nc.autumn2020.lesson6Practice.urlki.UrlHolderFactory;
import com.nc.autumn2020.solutions.javaPractice3Homework.task;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //task.run(args); // to launch com.nc.autumn2020.solutions.javaPractice3Homework
        // Не стирать
        //DynamicClassLoaderExample x = new DynamicClassLoaderExample();
        //x.executeSolution(args);
        RunUrlHolderExample x = new RunUrlHolderExample();
        x.executeSolution(args);
    }
}
