package com.tidz.doSomething.repository;

import com.tidz.doSomething.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
