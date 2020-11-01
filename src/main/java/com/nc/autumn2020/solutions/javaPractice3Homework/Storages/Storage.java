package com.nc.autumn2020.solutions.javaPractice3Homework.Storages;

import com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff.Fruit;

import java.io.*;
import java.util.Arrays;

public abstract class Storage {

    public abstract double getMaxWeight();
    public abstract double getCurWeight();
    protected abstract void setCurWeight(double curWeight);
    protected abstract Fruit[] getFruitArray();

    private void shiftCurWeight(double shift){
        this.setCurWeight(this.getCurWeight() + shift);
    }

    public void addFruit(Fruit fruit) throws IOException, ClassNotFoundException {
        int emptySlot = checkFreeSpace(this.getFruitArray());
        if (emptySlot >= 0){
            if (enoughWeight(fruit)) {
                this.getFruitArray()[emptySlot] = cloneMe(fruit);
                this.shiftCurWeight(fruit.getWeight());
            }
            else System.out.println("Too much weight");
        }
        else {
            System.out.println("Not enough space");
        }
    }
    public Fruit takeFruit() throws IOException, ClassNotFoundException {
        Fruit[] fruitArray = this.getFruitArray();
        int fruitSlot = checkIsFruit(fruitArray);
        if (fruitSlot >= 0) {
            Fruit fruit = cloneMe(fruitArray[fruitSlot]);
            this.getFruitArray()[fruitSlot] = null;
            this.shiftCurWeight(-fruit.getWeight());
            return fruit;
        }
        System.out.println("There is no fruits");
        return null;
    }

    private boolean enoughWeight(Fruit fruit){
        return this.getCurWeight() + fruit.getWeight() <= this.getMaxWeight();
    }

    private int checkFreeSpace(Fruit[] fruitArray){
        for (int i = 0; i < fruitArray.length; i++) {
            if (fruitArray[i] == null) return i;
        }
        return -1;
    }

    private int checkIsFruit(Fruit[] fruitArray){
        for (int i = 0; i < fruitArray.length; i++) {
            if (fruitArray[i] != null) return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "fruitArray=" + Arrays.toString(this.getFruitArray()) +
                '}';
    }
    private Fruit cloneMe(Fruit fruit) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream ous = new ObjectOutputStream(baos);
        //сохраняем состояние фрукта  в поток и закрываем поток
        ous.writeObject(fruit);
        ous.close();
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (Fruit) ois.readObject();
    }
}
