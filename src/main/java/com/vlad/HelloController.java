package com.vlad;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello! The time is "+ LocalDateTime.now();
    }


    @RequestMapping("/home")
    public String home() {
        return "Another text here";
    }

}