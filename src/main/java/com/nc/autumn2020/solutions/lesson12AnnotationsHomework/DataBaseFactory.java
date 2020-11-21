package com.nc.autumn2020.solutions.lesson12AnnotationsHomework;

import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;

public class DataBaseFactory {
    private static  Properties PROPERTIES = new Properties();
    {

    }
    private DataBaseFactory() {
    }

    public static DataBase newInstance() throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        DataBase dataBase = new DataBase();
        Class<? extends DataBase> aClass = dataBase.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                boolean b = declaredAnnotation instanceof PropertyValue;
                boolean b2 = declaredAnnotation instanceof PropertyObjectValue;
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
                } else if (b2){
                    PropertyObjectValue propertyObjectValue = (PropertyObjectValue) declaredAnnotation;
                    String value = propertyObjectValue.value();
                    if (value.startsWith("$")) {
                        String parsedValue = value.substring(value.indexOf("{") + 1, value.indexOf("}"));
                        System.out.println("parsedValue = " + parsedValue);
                        try {
                            PROPERTIES.load(new FileReader("dataBase.properties"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        declaredField.setAccessible(true);
                        String property = PROPERTIES.getProperty(parsedValue);
                        System.out.println("property = " + property);

                        //Нормальное решение
                        Class<?> Clazz = Class.forName(property); // зачем <?> ?
                        Object c = Clazz.newInstance();
                        NewImpressiveClass newImpressiveClass = (NewImpressiveClass)c;

                        try {
                            declaredField.set(dataBase, newImpressiveClass);
                            declaredField.setAccessible(false);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        //System.out.println(parsedValue+"="+property);
                    }

                }
            }
        }
        return dataBase;
    }
}
