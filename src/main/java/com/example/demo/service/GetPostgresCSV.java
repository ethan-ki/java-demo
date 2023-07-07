package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GetPostgresCSV implements GetCSV {
    public String URL = "ki-web-postgres";

    @Override
    public String theFile() {
        return "Ki-WebPostgres";
    }
}
