package com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff;

import java.io.Serializable;

public abstract class Food implements Serializable {
    private double weight;
    private double calory;

    public abstract double getWeight();
    public abstract double getCalory();

    @Override
    public abstract String toString();
}
