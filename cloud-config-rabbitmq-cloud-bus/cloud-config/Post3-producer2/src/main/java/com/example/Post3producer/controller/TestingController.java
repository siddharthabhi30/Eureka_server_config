package com.example.Post3producer.controller;


import com.example.Post3producer.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

    @Autowired
    private Main main;


    @GetMapping("/get")
    public String usageOFRefresh(){
        return main.print();

    }
}
