package com.nc.autumn2020.solutions.javaPractice3Homework.Storages;

import com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff.Fruit;

public class Basket extends Storage{
    private final double maxWeight;
    private double curWeight;
    private  Fruit[] fruitArray;

    public Basket() {
        this.curWeight = 0;
        this.maxWeight = 5.0;
        this.fruitArray = new Fruit[20];
    }

    @Override
    public double getMaxWeight() {
        return maxWeight;
    }

    @Override
    public double getCurWeight() {
        return curWeight;
    }

    @Override
    protected void setCurWeight(double curWeight) {
        this.curWeight = curWeight;
    }

    @Override
    protected Fruit[] getFruitArray() {
        return fruitArray;
    }

}
