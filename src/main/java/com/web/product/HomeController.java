package com.web.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome To Spring Boot Framework";
    }
    @RequestMapping("/about")
    public String about(){
        return "We are going to Code for spring app";
    }
}
