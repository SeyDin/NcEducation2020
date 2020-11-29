package com.nc.autumn2020.solutions.collectionsHomework;

import com.nc.autumn2020.LessonApi;

import java.util.HashMap;
import java.util.Map;

public class CollectionsHomeworkSolution implements LessonApi {
    @Override
    public void executeSolution(String[] args) throws Exception {

        Student wasya = new Student("Wasya", 1);
        Student nata = new Student("Natasha", 2);
        Journal journal = new Journal();

        journal.addMark(wasya, "Inglesh", 3);
        journal.addMark(wasya, "Inglesh", 3);
        journal.addMark(nata, "Inglesh", 3);
        journal.addMark(nata, "Inglesh", 3);

        System.out.println(journal);

        /*Map<Student, Mark> journal = new HashMap<>();
        journal.put(student, mark);

        System.out.println(journal.containsKey(student));*/

    }
}
