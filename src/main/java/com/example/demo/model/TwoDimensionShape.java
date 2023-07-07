package com.example.demo.model;

import java.math.BigDecimal;

public abstract class TwoDimensionShape {
    private final BigDecimal length;
    private final BigDecimal width;

    public TwoDimensionShape(BigDecimal length, BigDecimal width, String name) {
        this.length = length;
        this.width = width;
    }

    private BigDecimal getLength() {
        return length;
    }
}
