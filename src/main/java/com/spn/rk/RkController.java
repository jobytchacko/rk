package com.spn.rk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RkController {

    @GetMapping("/test")
    public String testReturn() {
        System.out.println("Inside the test run!!!!");
        return "Test Hello";
    }

}
