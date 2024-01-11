package com.example.demo.greetingAndMySQL.greetingAndMySQL;


import com.example.demo.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class htmlController {
    MyService ms;

    public htmlController(MyService ms){
        this.ms = ms;
    }

    @GetMapping("/allGreetings")
    public String showAll(Model model){
        model.addAttribute("allGreetings", ms.getAll());
        return "result";
    }

    @GetMapping("/newGreeting")
    public String newGreeting(Model model){
        model.addAttribute("emptyGreeting", new Greeting());
        return "nihao";
    }

    @PostMapping("/newGreeting")
    public String postGreeting(@ModelAttribute Greeting greeting, Model model){
        ms.addGreeting(greeting);

        model.addAttribute("allGreetings", ms.getAll());
        return "result";
    }
}
