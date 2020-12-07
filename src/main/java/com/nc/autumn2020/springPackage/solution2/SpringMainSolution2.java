package com.nc.autumn2020.springPackage.solution2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainSolution2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        //Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

        Field field = (Field) applicationContext.getBean("mainField");


        for (int i = 0; i < 4; i++) {
            field.addWorker((Worker)  applicationContext.getBean("worker"));
        }



        System.out.println(field);
        field.endOffSeason();
        System.out.println(field);
        field.addWorker((Worker)  applicationContext.getBean("worker"));
        System.out.println(field);
        field.endOffSeason();
        System.out.println(field);
        field.killWorker(0);
        System.out.println(field);

        System.out.println(field.check(0,1)); //Проверка разные ли это рабочие или одинаковые
    }
}
