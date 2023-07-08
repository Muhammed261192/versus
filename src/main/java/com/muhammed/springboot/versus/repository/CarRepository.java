package com.muhammed.springboot.versus.repository;

import com.muhammed.springboot.versus.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    List<Car> findAllByName(String name);
    List<Car> findAllByEngineAndColor(double engine, String color);

    List<Car> findAllByPrice(int price);

}
