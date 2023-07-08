package com.muhammed.springboot.versus.entity.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CarDto {
    private Integer id;
    private String name;
    private String color;
    private double engine;
    private int price;
    private String madeIn;
}
