package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping("")
    public String home(HttpServletRequest request, Model model){
        request.setAttribute("msg", "Hello spring boot");
        model.addAttribute("key_2","hello qua di");
        return "index";
    }

    @GetMapping("greeting")
    public String greetingView(){
        return "greeting";
    }

}
