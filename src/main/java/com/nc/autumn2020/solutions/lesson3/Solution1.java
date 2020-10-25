package com.nc.autumn2020.solutions.lesson3;

import com.nc.autumn2020.lesson3.Wine;

public class Solution1 {
    public void run(String[] args){
        Wine wine = new Wine.Builder(10, "Red", "Off Dry", 3, 5).
                winery("Astana").
                grapeSort("Pinot noir").
                originCountry("Kasahstan").
                volume(1.5).
                score(5).
                build();
        System.out.println(wine);
    }
}
