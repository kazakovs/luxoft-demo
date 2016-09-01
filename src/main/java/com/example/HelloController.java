package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qtr-ptc-4 on 9/1/2016.
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/{currency}/exchange-rate", method = RequestMethod.GET)
    public String hello(@PathVariable String currency){
        return ("usd".equalsIgnoreCase(currency)?"1.00":"not supported");
    }
}
