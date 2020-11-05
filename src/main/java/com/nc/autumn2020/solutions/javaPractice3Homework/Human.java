package com.nc.autumn2020.solutions.javaPractice3Homework;

import com.nc.autumn2020.solutions.javaPractice3Homework.foodStuff.Food;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void eat(Food food){
        System.out.println("I just ate " + food.getCalories() + " calories");
    }
}
