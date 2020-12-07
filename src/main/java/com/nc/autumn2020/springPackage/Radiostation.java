package com.nc.autumn2020.springPackage;

public class Radiostation {
    private String name;
    private String[] songs = new String[]{"lala", "lolo", "lulu"};

    public Radiostation(String name) {
        this.name = name;
    }

    public String getSong (int i){
        return songs[i];
    }

    @Override
    public String toString() {
        return "Radiostation{" +
                "name='" + name + '\'' +
                '}';
    }
}
