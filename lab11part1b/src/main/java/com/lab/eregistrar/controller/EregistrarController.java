package com.lab.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EregistrarController {

    @GetMapping(value ={"/", "/eregistra", "/eregistrar/home"})
    public String displayHomepage(){
        return "home/index";
    }
}
