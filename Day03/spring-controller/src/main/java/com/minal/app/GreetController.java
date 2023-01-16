package com.minal.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController
{
    @GetMapping("/greet")
    public String SayGreet() {
        return "Greet from App";
    }

    @GetMapping("/welcome")
    public String SayWelcome() {
        return "Welcome from App";
    }

    @GetMapping("/hi")
    public String SayHi(){
        return "Hi from App";
    }

    @GetMapping("/thanks")
    public String SayThanks() {
        return "Thanks from App";
    }
}