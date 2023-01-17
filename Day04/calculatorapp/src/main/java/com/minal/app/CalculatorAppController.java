package com.minal.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorAppController {

        @GetMapping("/add")
        public double add ( @RequestParam("a") double a, @RequestParam("b") double b)
        {
            return a + b;
        }

        @GetMapping("/sub")
        public double sub ( @RequestParam("a") double a, @RequestParam("b") double b)
        {
            return a - b;
        }

        @GetMapping("/multi")
        public double multi ( @RequestParam("a") double a, @RequestParam("b") double b)
        {
            return a * b;
        }

        @GetMapping("/div")
        public double div ( @RequestParam("a") double a, @RequestParam("b") double b)
        {
            return a / b;
        }
}
