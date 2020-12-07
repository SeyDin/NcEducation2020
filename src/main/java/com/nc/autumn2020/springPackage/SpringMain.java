//package com.nc.autumn2020.springPackage;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.util.Arrays;
//
//@ComponentScan(
//        basePackages = "com.nc.autumn2020.springPackage"
//)
//public class SpringMain {
//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//
//        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
//        Radio radio = (Radio) applicationContext.getBean("Mayak");
//        radio.playSong();
//    }
//}
