package com.nc.autumn2020.lessonFileVisitor;

import com.nc.autumn2020.LessonApi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileVisitorSolution implements LessonApi {
    @Override
    public void executeSolution(String[] args) {
        MyFileVisitorImpl myFileVisitor = new MyFileVisitorImpl();
        try {
            Files.walkFileTree(Paths.get(""), myFileVisitor);
            System.out.println("HEY MAN " + myFileVisitor.getMyClassCounter());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
