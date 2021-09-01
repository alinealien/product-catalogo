package com.digitalinnovation.experts.productcatalogo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World! Eu sou Aline Antunes. Testando meu projeto";
    }
}