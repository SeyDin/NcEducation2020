package com.nc.autumn2020.solutions.lesson12AnnotationsHomework;

import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Properties;

public class DataBaseFactory {
    private static  Properties PROPERTIES = new Properties();
    {

    }
    private DataBaseFactory() {
    }

    public static DataBase newInstance() {
        DataBase dataBase = new DataBase();
        Class<? extends DataBase> aClass = dataBase.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                System.out.println("Нашли анотацию класса - " + declaredAnnotation.getClass());
                boolean b = declaredAnnotation instanceof PropertyValue;
                if (b) {
                    PropertyValue propertyValue = (PropertyValue) declaredAnnotation;
                    String value = propertyValue.value();
                    if (value.startsWith("$")) {
                        String parsedValue = value.substring(value.indexOf("{") + 1, value.indexOf("}"));
                        try {
                            PROPERTIES.load(new FileReader("dataBase.properties"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        declaredField.setAccessible(true);
                        String property = PROPERTIES.getProperty(parsedValue);
                        try {
                            declaredField.set(dataBase,property);
                            declaredField.setAccessible(false);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        System.out.println(parsedValue+"="+property);
                    }
                }
            }
        }
        return dataBase;
    }
}
