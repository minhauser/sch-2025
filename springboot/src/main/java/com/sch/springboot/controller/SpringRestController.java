package com.sch.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {
    @GetMapping("/spring-api")
    public String springApi(){
            return "Spring API";}
}
