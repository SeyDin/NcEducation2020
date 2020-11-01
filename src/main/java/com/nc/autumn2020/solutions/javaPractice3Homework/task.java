package com.nc.autumn2020.solutions.javaPractice3Homework;

import com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff.Apple;
import com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff.Fruit;
import com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff.Orange;
import com.nc.autumn2020.solutions.javaPractice3Homework.Storages.Basket;
import com.nc.autumn2020.solutions.javaPractice3Homework.Storages.PlasticContainer;

import java.io.IOException;

public class task {
    public static void run(String[] args) throws IOException, ClassNotFoundException {
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
        Fruit x = bk.takeFruit();
        System.out.println(bk.toString());
        bk.addFruit(apple);
        System.out.println(bk.toString());
    }
}
