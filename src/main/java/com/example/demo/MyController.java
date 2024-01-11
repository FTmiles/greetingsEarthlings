package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
    BusinessLogic bl;

    public MyController(BusinessLogic bl){
        this.bl = bl;
    }

    @GetMapping("/greeting")
    public String greetingGet(){

        return "nihao";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);

        System.out.println(greeting);


        return "result";
    }

    @GetMapping("/petName")
    public String petName(Model model){
        model.addAttribute("petObj",new PetNameDataClass());
        model.addAttribute("raides", "hello comrads");
        model.addAttribute("skaiciai", 234234);
        model.addAttribute("other Obj", new Greeting(6, "liuliuliu"));

        System.out.println("stop don't move!");
        return "petNameForm";
    }

    @PostMapping("/petResponse")
    public String petHuiDa(@ModelAttribute PetNameDataClass petXX, Model model){
     model.addAttribute("pet", petXX);
        System.out.println("Hello1!!!");
        System.out.println(petXX);


        model.addAttribute("app", bl.getInfo());
        model.addAttribute("petNameList", bl.getPetNames(petXX));
        System.out.println(bl.getInfo().yearMonth);

     return "petNameAnswer";
    }
}
