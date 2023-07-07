package com.example.demo.controller;

import com.example.demo.model.Rectangle;
import com.example.demo.model.TwoDimensionShape;
import com.example.demo.service.BankPaymentImp;
import com.example.demo.service.CardPaymentImp;
import com.example.demo.service.GetBigQueryCSV;
import com.example.demo.service.GetCSV;
import com.example.demo.service.Payment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("demo")
public class DemoController {

    public Payment cardPayment = new CardPaymentImp("Card Payment", new BigDecimal("100.95"));
    public Payment bankPayment = new BankPaymentImp("Bank Payment", new BigDecimal("10000.95"));
    GetCSV getBigQueryCSV;
    // 3 of 3 - Dependency injection - this is where Spring will look up for the BEAN
    // that has the name (default qualifier) of "getBigQueryCSV"
    public DemoController(GetCSV getBigQueryCSV) {
        this.getBigQueryCSV = getBigQueryCSV;
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/bankPayment")
    public String executeBankPayment() {
        return bankPayment.execute("Hanitra");
    }

    @GetMapping("/cardPayment")
    public String executeCardPayment() {
        return cardPayment.execute("Hebaq");
    }

    @GetMapping("/getRectangle")
    public TwoDimensionShape getRectangle() {
        return new Rectangle(new BigDecimal("2023"), new BigDecimal("2"), "rectangle");
    }

    @GetMapping("/getBigQueryCSV")
    public String getBigQueryCSV() {
        return getBigQueryCSV.theFile();
    }
}