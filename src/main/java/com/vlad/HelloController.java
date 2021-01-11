package com.vlad;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


import java.time.LocalDateTime;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("myList" , List.of("first name", "Age","City"));
        return "greeting";
    }


    @RequestMapping("/")
    public String index() {
        return "Hello! The time is "+ LocalDateTime.now();
    }


    @RequestMapping("/home")
    public String home() {
        return "Another text here";
    }

}