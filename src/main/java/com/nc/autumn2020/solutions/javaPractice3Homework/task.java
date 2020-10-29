package com.nc.autumn2020.solutions.javaPractice3Homework;

import com.nc.autumn2020.solutions.javaPractice3Homework.Fruits.Apple;
import com.nc.autumn2020.solutions.javaPractice3Homework.Fruits.Orange;
import com.nc.autumn2020.solutions.javaPractice3Homework.Storages.Basket;
import com.nc.autumn2020.solutions.javaPractice3Homework.Storages.PlasticContainer;

import java.util.Arrays;

public class task {
    public static void run(String[] args) {
        PlasticContainer pc = new PlasticContainer();
        Apple apple = new Apple();
        for (int i = 0; i < 5; i++) {
            pc.addFruit(apple);
        }
        System.out.println(pc.toString());

        Basket bk = new Basket();
        Orange orange = new Orange();
        for (int i = 0; i < 20; i++) {
            bk.addFruit(orange);
        }
        System.out.println(bk.toString());
    }
}
