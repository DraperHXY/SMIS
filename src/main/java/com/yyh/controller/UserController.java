package com.yyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
@Controller
public class UserController {

    @PostMapping("/login")
    public String loginPost(@RequestParam("account") String account, @RequestParam("password") String password){

        return "index";
    }


}
