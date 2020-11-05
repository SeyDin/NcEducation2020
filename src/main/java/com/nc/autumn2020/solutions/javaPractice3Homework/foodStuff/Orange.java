package com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff;

public class Orange extends Fruit {

    private final double weight;
    private final double calories;

    public Orange() {
         this.weight = 0.4;
         this.calories = 200;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public double getCalories() {
        return this.calories;
    }

    @Override
    public String toString() {
        return "Orange";
    }

}
