package com.develhope.First.API1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {



    @GetMapping("/{n}")
    public Integer getFactorial(@PathVariable Integer n) {

        int i;
        int fac = 1;
        for (i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

}
