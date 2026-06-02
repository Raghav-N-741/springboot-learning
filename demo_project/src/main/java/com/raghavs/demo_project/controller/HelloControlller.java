package com.raghavs.demo_project.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class HelloControlller {

    @RequestMapping("/hello")
    public String sayMyName()
    {
        return "I am Raghav";
    }
}
