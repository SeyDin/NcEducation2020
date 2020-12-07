//package com.nc.autumn2020.springPackage;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.stereotype.Component;
//
//@Component
//@ConditionalOnProperty(
//        value = "application.ageLimit",
//        havingValue = "+18"
//)
//public class Radiostation {
//    private String ageLimit;
//    private String name;
//    private String[] songs = new String[]{"lala", "lolo", "lulu"};
//
//    public Radiostation(String ageLimit, String name) {
//        this.ageLimit = ageLimit;
//        this.name = name;
//    }
//
//    public String getSong (int i){
//        return songs[i];
//    }
//
//    @Override
//    public String toString() {
//        return "Radiostation{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}
