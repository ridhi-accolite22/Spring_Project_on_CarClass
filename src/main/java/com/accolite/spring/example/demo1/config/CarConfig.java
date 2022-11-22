package com.accolite.spring.example.demo1.config;

import com.accolite.spring.example.demo1.beans.Car;
import com.accolite.spring.example.demo1.beans.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.accolite.spring.example.demo1.beans","com.accolite.spring.example.demo1.service","com.accolite.spring.example.demo1.controller"})
public class CarConfig {
    @Bean("Maruti")
    public Company company1(){
        return new Company("Maruti","India");
    }
    @Bean("Audi")
    public Company company2(){
        return new Company("Audi","Germany");
    }
    @Bean("Mahindra")
    public Company company3(){
        return new Company("Mahindra","India");
    }
    @Bean("Toyota")
    public Company company4(){
        return new Company("Toyota","US");
    }
    @Bean("Honda")
    public Company company5(){
        return new Company("Honda","Japanese");
    }

    @Bean("Swift Dezire")
    public Car car1(){
        return new Car("Manual",company1(),"2020",4000000,"Petrol");
    }
    @Bean("Audi 300d")
    public Car car2(){
        return new Car("Automatic",company2(),"2021",2000000,"Diesel");
    }
    @Bean("Mahindra XUV")
    public Car car3(){
        return new Car("Manual",company3(),"2022",1000000,"Diesel");
    }
    @Bean("Toyota Fortuner")
    public Car car4(){
        return new Car("Automatic",company4(),"2021",1500000,"Petrol");
    }
    @Bean("Honda City")
    public Car car5(){
        return new Car("Manual",company5(),"2022",1000000,"Petrol");
    }
}
