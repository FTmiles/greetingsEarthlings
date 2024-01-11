package com.example.demo.greetingAndMySQL.greetingAndMySQL;


import com.example.demo.Greeting;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    MyRepo mr;

    public MyService(MyRepo mr){
        this.mr = mr;
    }

    public Greeting addGreeting(Greeting greeting){
        return mr.save(greeting);
    }

    public List<Greeting> getAll(){
        return mr.findAll();
    }

}
