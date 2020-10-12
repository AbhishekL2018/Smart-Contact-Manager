package com.abhishek.SmartContactManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/smart-contact-manager")
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String showHomePage(){
        return "welcome to my application";
    }
}
