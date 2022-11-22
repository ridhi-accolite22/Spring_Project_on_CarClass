package com.accolite.spring.example.demo1.beans;

public class Company {
    String name;
    String place;

    public Company(String name, String place) {
        super();
        this.name = name;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
