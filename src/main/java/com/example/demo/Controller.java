package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class Controller {

    @GetMapping
    public String home(){
        return "Hello World.";
    }
}
