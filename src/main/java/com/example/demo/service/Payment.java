package com.example.demo.service;

import java.math.BigDecimal;

public interface Payment {
    public String getPaymentName();
    public BigDecimal getAmount();
    public String execute(String targetName);
}
