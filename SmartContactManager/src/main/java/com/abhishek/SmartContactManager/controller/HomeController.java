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

    @GetMapping("/login")
    public String showLoginPage(Model model){
        model.addAttribute("title","Login-Smart Contact Manager");
        return "login";
    }

    @GetMapping("/signup")
    public String showSignupPage(Model model){
        model.addAttribute("title","Sign Up-Smart Contact Manager");
        return "signup";
    }
}
