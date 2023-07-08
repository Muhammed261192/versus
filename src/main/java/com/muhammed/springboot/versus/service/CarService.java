package com.muhammed.springboot.versus.service;

import com.muhammed.springboot.versus.entity.dto.CarDto;

import java.util.List;

public interface CarService {
    public List<CarDto> getAllCars();

    public List<CarDto> getCarsByColorAndEngine(String color, double engine);

    public List<CarDto> getCarsByPrice(int price);
}
