package com.pizzabuilder.service.pizzabuilderservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class EmployeeController {
    @GetMapping("/greeting")
    public String getEmployees() {
        return "Welcome!";
    }
}