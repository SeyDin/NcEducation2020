package com.nc.autumn2020.springPackage.solution2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Field {

    private double ready = 0;
    private List<Worker> workers = new ArrayList<>();

    public Field() {
        this.ready = 0;
    }

    //Проверка разные ли это рабочие или одинаковые
    public boolean check(int n1, int n2){
        return workers.get(n1) == workers.get(n2);
    }

    // Что-то ввиде тикера, после него увеличивается "вспаханность"
    public void endOffSeason(){
        ready = ready + workers.size() * 4;
    }

    public void addWorker(Worker worker){
        workers.add(worker);
    }

    public void killWorker(int num){
        workers.remove(num);
    }

    @Override
    public String toString() {
        return "Field{" +
                "ready=" + ready +
                ", workers=" + workers +
                '}';
    }
}
