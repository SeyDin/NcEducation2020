package com.nc.autumn2020.solutions.collectionsHomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Journal {

    private Map<Student, ArrayList<Mark>> scheme;

    public Journal() {
        scheme = new HashMap<>();
    }

    public void addMark(Student student, String subject,int numb){
        Mark mark = new Mark(subject, numb);
        if (scheme.containsKey(student)){
            scheme.get(student).add(mark);
        } else {
            ArrayList<Mark> markList = new ArrayList<>();
            markList.add(mark);
            scheme.put(student, markList);
        }
    }

    @Override
    public String toString() {
        return "Journal{" +
                "scheme=" + scheme +
                '}';
    }
}
