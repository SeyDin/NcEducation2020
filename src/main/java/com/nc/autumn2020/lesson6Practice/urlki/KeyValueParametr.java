package com.nc.autumn2020.lesson6Practice.urlki;

public class KeyValueParametr {
    private String key;
    private String value;

    public KeyValueParametr(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nKeyValueParametr{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
