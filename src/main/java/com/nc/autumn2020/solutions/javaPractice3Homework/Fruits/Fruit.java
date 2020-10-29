package com.nc.autumn2020.solutions.javaPractice3Homework.Fruits;

/**
 * Я хотел сделать этот класс абстрактным,
 * но тогда не получается сделать копирующий конструктор
 */
public abstract class Fruit {

    private double weight;
    private double calory;

    public abstract double getWeight();

    @Override
    public abstract String toString();

}
