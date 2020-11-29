package com.nc.autumn2020.solutions.collectionsHomework;

import java.util.Objects;

public class Student {
    private String name;
    private final int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id; //Уникальность ID должна гарантироваться фабрикой студентов, которой тут нет)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
