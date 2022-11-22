package com.accolite.spring.example.demo1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarRepo {
    Car Swift_Dezire;
    Car Audi_300d;
    Car Mahindra_XUV;
    Car Toyota_Fortuner;
    Car Honda_City;

    public Car getSwift_Dezire() {
        return Swift_Dezire;
    }
    @Autowired
    @Qualifier("Swift Dezire")
    public void setSwift_Dezire(Car swift_Dezire) {
        Swift_Dezire = swift_Dezire;
    }

    public Car getAudi_300d() {
        return Audi_300d;
    }
    @Autowired
    @Qualifier("Audi 300d")
    public void setAudi_300d(Car audi_300d) {
        Audi_300d = audi_300d;
    }

    public Car getMahindra_XUV() {
        return Mahindra_XUV;
    }
    @Autowired
    @Qualifier("Mahindra XUV")
    public void setMahindra_XUV(Car mahindra_XUV) {
        Mahindra_XUV = mahindra_XUV;
    }

    public Car getToyota_Fortuner() {
        return Toyota_Fortuner;
    }
    @Autowired
    @Qualifier("Toyota Fortuner")
    public void setToyota_Fortuner(Car toyota_Fortuner) {
        Toyota_Fortuner = toyota_Fortuner;
    }

    public Car getHonda_City() {
        return Honda_City;
    }
    @Autowired
    @Qualifier("Honda City")
    public void setHonda_City(Car honda_City) {
        Honda_City = honda_City;
    }

    @Override
    public String toString() {
        return "CarRepo{" +
                "Swift_Dezire=" + Swift_Dezire +
                ", Audi_300d=" + Audi_300d +
                ", Mahindra_XUV=" + Mahindra_XUV +
                ", Toyota_Fortuner=" + Toyota_Fortuner +
                ", Honda_City=" + Honda_City +
                '}';
    }
}
