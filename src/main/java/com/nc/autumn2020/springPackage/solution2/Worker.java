package com.nc.autumn2020.springPackage.solution2;

import org.springframework.stereotype.Component;

@Component
public class Worker {
    private static int counter;
    private String name;

    public Worker() {
        this.name = "worker mk." + counter;
        ++counter;
    }

    @Override
    public String toString() {
        return name;
    }
}
