package com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff;

public class Orange extends Fruit {

    private final double weight;
    private final double calory;

    public Orange() {
         this.weight = 0.4;
         this.calory = 200;
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
        return "Orange";
    }

}
