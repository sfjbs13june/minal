package com.minal.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationController {

    @GetMapping("/name")
    public String getName(){
        return "Minal Hatekar";
    }

    @GetMapping("/age")
    public String getAge(){
        return "23";
    }

    @GetMapping("/address")
    public String getAddress(){
        return "Maharashtra";
    }
}
