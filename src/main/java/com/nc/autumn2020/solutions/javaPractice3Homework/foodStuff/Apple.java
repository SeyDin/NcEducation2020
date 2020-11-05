package com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff;

public class Apple extends Fruit {

    private final double weight;
    private final double calories;

    public Apple() {
         this.weight = 0.3;
         this.calories = 100;
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
        return "Apple";
    }

}
