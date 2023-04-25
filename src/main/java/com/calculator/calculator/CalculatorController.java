package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculator;
    public CalculatorController(CalculatorService calculator){
        this.calculator = calculator;
    }

    @GetMapping("/")
    public String greating() {
        return "Добро по жаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String add(@RequestParam (name = "num1")int a, @RequestParam (name = "num2")int b) {
       return a + "+" + b + "=" + calculator.add(a,b);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "-" + num2 + "=" + calculator.minus(num1,num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "*" + num2 + "=" + calculator.multiply(num1,num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2==0){
            return  "На ноль делить нельзя";
        }
        return num1 + "/" + num2 + "=" + calculator.divide(num1,num2);
    }
}
