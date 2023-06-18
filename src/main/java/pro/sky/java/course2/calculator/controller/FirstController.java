package pro.sky.java.course2.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculationService;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    @GetMapping
    public String showHello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
    private final CalculationService calculationService;

    @Autowired
    public FirstController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculationService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculationService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculationService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculationService.divide(num1, num2);
    }
    //
}
