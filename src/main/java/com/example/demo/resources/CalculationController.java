package com.example.demo.resources;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.sqrt_power;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculation")
public class CalculationController {
	private static final String PATTERN = "^-?+\\d+\\.?+\\d*$";


    @RequestMapping("/power")
    public  sqrt_power power (@RequestParam(value = "base") String b, @RequestParam(value = "exponent") String e) {
        List<String> input = new ArrayList<>();
        input.add(b);
        input.add(e);
        List<String> output = new ArrayList<>();
        String powValue = "";

        if (b != null && e != null && b.matches(PATTERN) && e.matches(PATTERN)) {
            powValue = String.valueOf(Math.pow(Double.valueOf(b), Double.valueOf(e)));
        } else {
            powValue = "Base or/and Exponent is/are not set to numberic value.";
        }
        output.add(powValue);
		return new sqrt_power(input, output, "power");
    }
    @RequestMapping(value = "/sqrt/{value:.+}", method = GET)
    public sqrt_power sqrt (@PathVariable(value = "value") String aValue) {
        List<String> input = new ArrayList<>();
        input.add(aValue);
        List<String> output = new ArrayList<>();
        String sqrtValue = "";
        if (aValue != null && aValue.matches(PATTERN)) {
            sqrtValue = String.valueOf(Math.sqrt(Double.valueOf(aValue)));
        } else {
            sqrtValue = "Input Value is not set to numberic value.";
        }
        output.add(sqrtValue);
        return new sqrt_power(input, output, "sqrt");
    }
}