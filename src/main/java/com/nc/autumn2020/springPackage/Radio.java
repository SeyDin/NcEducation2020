package com.nc.autumn2020.springPackage;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.Random;

//@Component
//public class Radio {
//    private Radiostation radiostation;
//
//    public Radio(Radiostation radiostation) {
//        this.radiostation = radiostation;
//    }
//
//    public void playSong(){
//        System.out.println(" " + radiostation + radiostation.getSong(new Random().nextInt(2)));
//    }
//
//
//    public void switchStation(Radiostation radiostation){
//        this.radiostation = radiostation;
//    }
//
//
//}
