package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;


public class Rectangle extends TwoDimensionShape{
    @JsonProperty("length")
    public BigDecimal rectangleLength;
    @JsonProperty("width")
    public BigDecimal rectangleWidth;

    public String name;

    public Rectangle(BigDecimal rectangleLength, BigDecimal rectangleWidth, String name) {
        super(rectangleLength, rectangleWidth, name);
        this.rectangleLength = rectangleLength;
        this.rectangleWidth = rectangleWidth;
        this.name = name;
    }
}
