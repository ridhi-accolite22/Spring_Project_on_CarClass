package com.accolite.spring.example.demo1.beans;

public class Car {
    String type;
    Company company;
    String model;
    double price;
    String fuel;

    public Car(String type, Company company, String model, double price, String fuel) {
        this.type = type;
        this.company = company;
        this.model = model;
        this.price = price;
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", company=" + company +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
