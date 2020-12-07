package com.nc.autumn2020.springPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        Radio radio = (Radio) applicationContext.getBean("Mayak");
        radio.playSong();
    }
}
