package com.example.demo.service;

import org.springframework.stereotype.Service;

// 2 of 3 - defining the actual business logic
@Service
public class GetBigQueryCSV implements GetCSV {
    public String URL = "ki-bigquery";

    @Override
    public String theFile() {
        getCSVName();
        return "FROM BIGQUERY";
    }

    public void getCSVName() {
        System.out.println("hello I am BigQuery CSV");
    }

}
