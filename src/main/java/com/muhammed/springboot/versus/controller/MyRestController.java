package com.muhammed.springboot.versus.controller;

import com.muhammed.springboot.versus.entity.Car;
import com.muhammed.springboot.versus.entity.dto.CarDto;
import com.muhammed.springboot.versus.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class MyRestController {

    private final CarService carService;

    @GetMapping("/cars")
    public List<CarDto> showAllCars() {
        return carService.getAllCars();

    }

    @GetMapping("/getCarsByFilter")
    public List<CarDto> getCarsByFilter(@RequestParam String color, @RequestParam double engine) {
        return carService.getCarsByColorAndEngine(color, engine);
    }

    @GetMapping("/priceCars")
    public List<CarDto> getPriceCar(@RequestParam int price) {
        return carService.getCarsByPrice(price);
    }
}
