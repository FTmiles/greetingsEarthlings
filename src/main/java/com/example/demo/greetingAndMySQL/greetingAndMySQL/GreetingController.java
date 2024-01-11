package com.example.demo.greetingAndMySQL.greetingAndMySQL;

import com.example.demo.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {

    MyService ms;

    public GreetingController(MyService ms){
        this.ms = ms;
    }

    @GetMapping("/greetingHandShake")
    public String hello(){
        return "hello from GreetingController";
    }

    @PostMapping("/addGreets")
    public Greeting addGreets(@RequestBody Greeting greeting){
        System.out.println("addGreets --- hahaha");

        return ms.addGreeting(greeting);
    }

    @GetMapping("/jsonGetAll")
    public List<Greeting> getAllJson(){
        return ms.getAll();
    }

//
//
//    @GetMapping("/greeting")
//    public String greetingGet(){
//
//        return "nihao";
//    }
//
//    @PostMapping("/greeting")
//    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
//        model.addAttribute("greeting", greeting);
//
//        System.out.println(greeting);
//
//
//        return "result";
//    }



}
