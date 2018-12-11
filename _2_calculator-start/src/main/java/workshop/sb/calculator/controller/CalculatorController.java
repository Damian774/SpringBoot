package workshop.sb.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add/{a}/{b}")
    public double add(@PathVariable  double a,@PathVariable double b){
        return a+b;
    }

    @GetMapping("/sub/{a}/{b}")
    public double sub(@PathVariable double a, @PathVariable double b){
        return a-b;
    }

    @GetMapping("/mul")
    public String mul(@RequestParam double a,@RequestParam double b){
        return String.valueOf(a*b);
    }
    @GetMapping("/div")
    public String div(@RequestParam double a,@RequestParam double b){
        return String.valueOf(a/b);
    }
}
