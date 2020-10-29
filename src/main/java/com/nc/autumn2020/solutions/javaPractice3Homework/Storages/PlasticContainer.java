package com.nc.autumn2020.solutions.javaPractice3Homework.Storages;

import com.nc.autumn2020.solutions.javaPractice3Homework.Fruits.Fruit;

public class PlasticContainer extends Storage{
    private final double maxWeight;
    private double curWeight;
    private Fruit[] fruitArray;

    public PlasticContainer() {
        this.curWeight = 0;
        this.maxWeight = 1.0;
        this.fruitArray = new Fruit[5];
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
