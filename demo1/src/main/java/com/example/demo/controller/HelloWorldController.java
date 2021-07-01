package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class HelloWorldController {
    @RequestMapping("/")
    String home(Model model) {
        model.addAttribute("msg","This is a test messgae");
        return "Hello World!";
    }
    @RequestMapping("/say")
    String homeSay() {
        return "I say hello world.";
    }

}