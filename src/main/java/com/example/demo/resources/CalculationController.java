package com.example.demo.resources;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.sqrt_power;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculation")
public class CalculationController {
    // static final String SQRT_POWER = "/sqrt_power";
	private static final String PATTERN = "^-?+\\d+\\.?+\\d*$";


    @RequestMapping("/power")
    public  sqrt_power pow(@RequestParam(value = "base") String b, @RequestParam(value = "exponent") String e) {
        List<String> input = new ArrayList();
        input.add(b);
        input.add(e);
        List<String> output = new ArrayList();
        String powValue = "";

        if (b != null && e != null && b.matches(PATTERN) && e.matches(PATTERN)) {
            powValue = String.valueOf(Math.pow(Double.valueOf(b), Double.valueOf(e)));
        } else {
            powValue = "Base or/and Exponent is/are not set to numberic value.";
        }
        output.add(powValue);
		return new sqrt_power(input, output, "power");
    }
}