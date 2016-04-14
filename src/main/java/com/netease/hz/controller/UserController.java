package com.netease.hz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by miracler on 4/14/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/add")
    public String addUser(ModelMap model){
        return "add_form";
    }
    @RequestMapping("/success")
    public String getResult(ModelMap model, @RequestParam String name,@RequestParam String age){
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "success";
    }
}
