package com.github._20170945.proyectoisc322.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/")
public class Vista {
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value="/login" , method = RequestMethod.GET)
    public String login(@RequestParam Map<String,String> request, Model model) {
        model.addAttribute("error", request.containsKey("error"));
        return "login";
    }

}
