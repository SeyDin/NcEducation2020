package com.nc.autumn2020.lesson6Practice.urlki;

import com.nc.autumn2020.LessonApi;


public class RunUrlHolderExample implements LessonApi {
    @Override
    public void executeSolution(String[] args) {
        String url1 = "http://localhost.netcracker.com:6810/product.plain_taskc.nc?tab=_Task&object=9090363151013783084&container=9158610804913819337&task=9158610813113819418&state=update&return=%2Fcommon%2Fuobject.jsp%3Fobject%3D9158610804913819337&object=9090363151013783084";
        String url2 = "https://www.sgu.ru/schedule/fn/do/205";
        String url3 = "https://ru.wikipedia.org/wiki/%D0%A4%D1%83%D1%80%D1%8C%D0%B5,_%D0%A8%D0%B0%D1%80%D0%BB%D1%8C";
        String url4 = "https://сайтроссия.рф/news";
        String targetUrl = url1;
        UrlHolder x = UrlHolderFactory.createInstance(targetUrl);
        System.out.println(targetUrl);
        System.out.println(x);
        System.out.println(targetUrl.equals(x.toString()));
        System.out.println(x.detailView());
    }
}
