package com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff;

import java.io.Serializable;

public abstract class Food implements Serializable {

    public abstract double getWeight();
    public abstract double getCalories();

    @Override
    public abstract String toString();
}
