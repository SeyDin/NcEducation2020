package com.nc.autumn2020.solutions.lesson12AnnotationsHomework;

import com.nc.autumn2020.LessonApi;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Solution implements LessonApi {

    @Override
    public void executeSolution(String[] args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        DataBase dataBase = DataBaseFactory.newInstance();
        System.out.println(dataBase);
        System.out.println(dataBase.getCustomObject());



    }


}