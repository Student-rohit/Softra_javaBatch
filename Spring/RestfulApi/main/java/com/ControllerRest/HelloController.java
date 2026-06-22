package com.ControllerRest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {


    @GetMapping("/")
    public String hello(Model model) {


     

        return "index";

    }
    
    @GetMapping("/greet")
    public Greeting getGreeting() {


        Greeting g = new Greeting();


        g.setId(1);

        g.setMessage("Hello Spring REST API");


        return g;
    }


}