package com.tidz.doSomething.service;

import com.tidz.doSomething.exceptions.NoResourceProvided;
import com.tidz.doSomething.model.Car;
import com.tidz.doSomething.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    CarRepository repository;

    @Autowired
    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public Car add(Car car) {
        if (car == null) {
            throw new NoResourceProvided("No car provided");
        }
        return null;
    }
}
