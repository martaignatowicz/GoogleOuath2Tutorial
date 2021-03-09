package com.example.ouath2tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // an unrestricted endpoint
    @GetMapping("/")
    public String helloWorld(){
        return "Hello world";
    }

    // restricted endpoint
    @GetMapping("/restricted")
    public String restrcited(){
        return "To see this text to you need to be logged in";
    }
}
