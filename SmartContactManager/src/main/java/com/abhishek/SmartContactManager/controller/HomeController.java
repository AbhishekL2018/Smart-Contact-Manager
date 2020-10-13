package com.abhishek.SmartContactManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/smart-contact-manager")
public class HomeController {

    @GetMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("title","Home-Smart Contact Manager");
        return "home";
    }

    @GetMapping("/about")
    public String showAboutPage(Model model){
        model.addAttribute("title","About-Smart Contact Manager");
        return "about";
    }
}
