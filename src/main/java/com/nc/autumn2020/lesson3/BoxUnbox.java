package com.nc.autumn2020.lesson3;

public class BoxUnbox implements Runnable{
    public BoxUnbox() {

    }

    public void run() {
        Integer value = 128;
        Integer value2 = 128;
        Long long1 = 120L;
        Long long2 = 120L;
        System.out.println(long1 == long2);
    }
}
