package com.nc.autumn2020.springPackage;

import java.util.Random;

public class Radio {
    private Radiostation radiostation;

    public Radio(Radiostation radiostation) {
        this.radiostation = radiostation;
    }

    public void playSong(){
        System.out.println(" " + radiostation + radiostation.getSong(new Random().nextInt(2)));
    }

    public void switchStation(Radiostation radiostation){
        this.radiostation = radiostation;
    }


}
