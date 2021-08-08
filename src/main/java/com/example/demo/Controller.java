package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controller {

    @GetMapping("/hello")
    public String home(){
        return "Hello World.";
    }

    @GetMapping("/")
    public String land(){
        return "Land Page";
    }
}
