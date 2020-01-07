package com.telus.service;

public class Schedule {

    private String name;

    public Schedule() {
    }

    public Schedule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Schedule{ name='" + name + '\'' + " }";
    }
}
