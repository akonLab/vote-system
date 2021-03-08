package com.blum.votesystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class GeneralController {
    @RequestMapping("/home")
    public String home(HttpServletRequest request) {
        return "home";
    }

    @RequestMapping("/admin")
    public String admin(HttpServletRequest request) {
        return "admin";
    }

    @RequestMapping("/profile")
    public String profile(HttpServletRequest request) {
        return "profile";
    }

    @RequestMapping("/log")
    public String log(HttpServletRequest request) {
        return "log";
    }
}
