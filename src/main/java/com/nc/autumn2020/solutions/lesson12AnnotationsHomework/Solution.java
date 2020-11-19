package com.nc.autumn2020.solutions.lesson12AnnotationsHomework;

import com.nc.autumn2020.LessonApi;

public class Solution implements LessonApi {

    @Override
    public void executeSolution(String[] args) {

        DataBase dataBase = DataBaseFactory.newInstance();
        System.out.println(dataBase);


    }


}