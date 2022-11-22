package com.accolite.spring.example.demo1.service;

import com.accolite.spring.example.demo1.beans.Car;
import com.accolite.spring.example.demo1.beans.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarService {
    @Autowired
    CarRepo carrepo;
    public ArrayList<Car> getToyotaCar(){
        ArrayList<Car> cars1=new ArrayList<>();
        cars1.add(carrepo.getToyota_Fortuner());
        return cars1;
    }
    public ArrayList<Car> getMarutiCar(){
        ArrayList<Car> cars2=new ArrayList<>();
        cars2.add(carrepo.getSwift_Dezire());
        return cars2;
    }
}
