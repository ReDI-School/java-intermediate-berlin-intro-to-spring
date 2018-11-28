package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/random")
    public MyRandomNumber helloNumber(Integer x) {
        return new MyRandomNumber(x);
    }
}
