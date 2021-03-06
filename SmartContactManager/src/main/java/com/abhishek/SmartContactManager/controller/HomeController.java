package com.abhishek.SmartContactManager.controller;

import com.abhishek.SmartContactManager.entities.User;
import com.abhishek.SmartContactManager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/smart-contact-manager")
public class HomeController {

    @Autowired
    private UserService userService;

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
        model.addAttribute("user",new User());
        return "signup";
    }

    @PostMapping("/do_register")
    public String registerUser(@ModelAttribute("user") User user,
                               @RequestParam(value = "agreement",
                                       defaultValue = "false") boolean agreement){
        try{
            userService.saveUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }
}
