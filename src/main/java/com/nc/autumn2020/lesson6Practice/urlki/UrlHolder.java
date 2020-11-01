package com.nc.autumn2020.lesson6Practice.urlki;

import java.util.Arrays;

public class UrlHolder {
    private String protocol;
    private String domain;
    private int port;
    private KeyValueParametr[] keyValueParametrs;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public KeyValueParametr[] getKeyValueParametrs() {
        return keyValueParametrs;
    }

    public void setKeyValueParametrs(KeyValueParametr[] keyValueParametrs) {
        this.keyValueParametrs = keyValueParametrs;
    }

    @Override
    public String toString() { //must return url
        return "UrlHolder{" +
                "protocol='" + protocol + '\'' +
                ", domain='" + domain + '\'' +
                ", port=" + port +
                ", keyValueParametrs=" + Arrays.toString(keyValueParametrs) +
                '}';
    }
}
