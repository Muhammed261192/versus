package com.muhammed.springboot.versus.service;

import com.muhammed.springboot.versus.entity.Car;
import com.muhammed.springboot.versus.entity.dto.CarDto;
import com.muhammed.springboot.versus.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Override
    public List<CarDto> getAllCars() {
        return toDto(carRepository.findAll()); //List тур
    }

    @Override
    public List<CarDto> getCarsByPrice(int price) {
        return toDto(carRepository.findAllByPrice(price));

    }

    @Override
    public List<CarDto> getCarsByColorAndEngine(String color, double engine) {
        return toDto(carRepository.findAllByEngineAndColor(engine, color));




//        return carRepository.findAll().stream()
//                .filter(car -> color.equals(car.getColor()) && engine == car.getEngine())
//                .map(car -> {
//                    return CarDto.builder()
//                            .id(car.getId())
//                            .name(car.getName())
//                            .color(car.getColor())
//                            .engine(car.getEngine())
//                            .price(car.getPrice())
//                            .madeIn(car.getMadeIn())
//                            .build();
//                })
//                .collect(Collectors.toList());
    }

    private List<CarDto> toDto (List<Car> entities) {
        return entities.stream()
                .map(c -> {
                    return CarDto.builder()
                            .id(c.getId())
                            .name(c.getName())
                            .color(c.getColor())
                            .engine(c.getEngine())
                            .price(c.getPrice())
                            .madeIn(c.getMadeIn())
                            .build();
                })
                .collect(Collectors.toList());
    }
}
