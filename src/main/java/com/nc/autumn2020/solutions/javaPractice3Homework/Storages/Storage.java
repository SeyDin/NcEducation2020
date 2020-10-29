package com.nc.autumn2020.solutions.javaPractice3Homework.Storages;

import com.nc.autumn2020.solutions.javaPractice3Homework.Fruits.Fruit;

import java.util.Arrays;

public abstract class Storage {

    private double maxWeight;
    private double curWeight;
    private Fruit[] fruitArray;

    public abstract double getMaxWeight();
    public abstract double getCurWeight();
    protected abstract void setCurWeight(double curWeight);
    protected abstract Fruit[] getFruitArray();

    private void increaseCurWeight(double inc){
        this.setCurWeight(this.getCurWeight() + inc);
    }

    public void addFruit(Fruit fruit){
        int emptySlot = checkSpace(this.getFruitArray());
        if (emptySlot >= 0){
            if (enoughWeight(fruit)) {
                this.getFruitArray()[emptySlot] = fruit;
                //Если это кто-нибудь прочитает: напишите в скайп как сюда поставить копирующий конструктор?!!!
                this.increaseCurWeight(fruit.getWeight());
            }
            else System.out.println("Too much weight");
        }
        else {
            System.out.println("Not enough space");
        }
    }

    private boolean enoughWeight(Fruit fruit){
        return this.getCurWeight() + fruit.getWeight() <= this.getMaxWeight();
    }

    private int checkSpace(Fruit[] fruitArray){
        for (int i = 0; i < fruitArray.length; i++) {
            if (fruitArray[i] == null) return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "fruitArray=" + Arrays.toString(this.getFruitArray()) +
                '}';
    }
}
