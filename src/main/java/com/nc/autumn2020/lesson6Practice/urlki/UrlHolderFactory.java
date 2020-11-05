package com.nc.autumn2020.lesson6Practice.urlki;

public class UrlHolderFactory {
    public UrlHolderFactory() {
    }
    static UrlHolder createInstance(String url){
        UrlHolder urlHolder = new UrlHolder(url);

        return urlHolder;
    }

    private void pars(String url, UrlHolder urlHolder ){
    }
}
