package com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff;

public class Apple extends Fruit {

    private final double weight;
    private final double calory;

    public Apple() {
         this.weight = 0.3;
         this.calory = 100;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public double getCalory() {
        return this.calory;
    }

    @Override
    public String toString() {
        return "Apple";
    }

}
