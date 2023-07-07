package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

public class BankPaymentImp implements Payment{
    private final String name;
    private final BigDecimal amount;
    public BankPaymentImp(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }
    @Override
    public String getPaymentName() {
        return this.name;
    }

    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    @Override
    public String execute(String bankName) {
        return sendToBank(bankName);
    }

    public String sendToBank(String bankName) {
        return """
                The Bank Payment has been sent to %s
                """
                .formatted(bankName);
    }
}
