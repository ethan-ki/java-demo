package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

public class CardPaymentImp implements Payment{

    private final String name;
    private final BigDecimal amount;

    public CardPaymentImp(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getPaymentName() {
        return name;
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String execute(String accountName) {
        return transferToAccount(accountName);
    }

    public String transferToAccount(String accountName) {
        return """ 
                Wiring transfer to %s
                """
                .formatted(accountName);
    }
}
