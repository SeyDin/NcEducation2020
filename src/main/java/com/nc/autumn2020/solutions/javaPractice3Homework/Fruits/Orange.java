package com.nc.autumn2020.solutions.javaPractice3Homework.Fruits;

public class Orange extends Fruit {

    private final double weight;
    private final double calory;

    public Orange() {
        this.weight = 0.4;
        this.calory = 200;
    }

    private Orange(Orange orange) {
        this.weight = orange.weight;
        this.calory = orange.calory;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "Orange";
    }

}
