package com.nc.autumn2020.solutions.collectionsHomework;

import java.util.Date;

public class Mark {
    private final String subject;
    private final Date date;
    private final int numb;

    public Mark(String subject, int numb) {
        this.subject = subject;
        this.date = new Date();
        this.numb = numb;
    }

    public String getSubject() {
        return subject;
    }

    public Date getDate() {
        return date;
    }

    public int getNumb() {
        return numb;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "subject='" + subject + '\'' +
                ", date=" + date +
                ", numb=" + numb +
                '}';
    }
}
