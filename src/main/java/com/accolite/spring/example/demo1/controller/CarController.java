package com.accolite.spring.example.demo1.controller;

import com.accolite.spring.example.demo1.beans.Car;
import com.accolite.spring.example.demo1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CarController {
  CarService service;


    public CarService getService() {
        return service;
    }

    @Autowired
    public void setService(CarService service) {
        this.service = service;
    }
    @GetMapping("/Toyota")
    public ArrayList<Car> getToyota(){
        return service.getToyotaCar();
    }
    @GetMapping("/Maruti")
    public ArrayList<Car> getMaruti(){
        return service.getMarutiCar();
    }
}
