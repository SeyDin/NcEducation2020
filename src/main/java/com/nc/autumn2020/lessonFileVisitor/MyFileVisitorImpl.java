package com.nc.autumn2020.lessonFileVisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitorImpl implements FileVisitor<Path> {

    private int myClassCounter = 0;

    public int getMyClassCounter() {
        return myClassCounter;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
          //System.out.println(dir.toString());
          return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
          String fileName = file.toFile().getName();
          if (fileName.endsWith(".class")){
              myClassCounter++;
              System.out.println(fileName);
          }
          return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}
