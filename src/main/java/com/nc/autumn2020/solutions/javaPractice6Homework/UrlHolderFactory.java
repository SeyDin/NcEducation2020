package com.nc.autumn2020.solutions.javaPractice6Homework;

//К моему сожалению, так и не понял зачем тут фабрика.
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
