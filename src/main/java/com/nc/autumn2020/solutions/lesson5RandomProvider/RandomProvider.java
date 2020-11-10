package com.nc.autumn2020.solutions.lesson5RandomProvider;

import java.util.Arrays;

public class RandomProvider {
    private int counter = -1;
    private int[] randomNumbers;

    public RandomProvider(int number) {
        if (number<0) {
            throw new ArithmeticException("Number must be greater than zero");
        }
        else {
            randomNumbers = new int[number];
        }
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random()*1000);
        }
    }

    /*
    Метод, предоставляющий возможность гарантированно очистить все данные из массива,
    когда в нем отпадет необходимость.
     */
    public void clearRandomProvider(){
        counter = randomNumbers.length-1;
        randomNumbers = null;
    }

    /*
    Если числа кончились, надобность в массиве также отпадает.
     */
    public int getNumber(){
        if (counter == randomNumbers.length-1){
            randomNumbers = null;
            throw new IndexOutOfBoundsException("Numbers are out");
        }
        return randomNumbers[++counter];
    }

    public int[] getRandomNumbers() {
        return randomNumbers.clone();
    }
}
