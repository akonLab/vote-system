package com.blum.votesystem.controllers;

import com.blum.votesystem.models.UserEntity;
import com.blum.votesystem.repo.QuestionRepo;
import com.blum.votesystem.repo.UserRepo;
import com.blum.votesystem.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class GeneralController {
    @Autowired
    MyUserDetailsService userDetailsService;
    @Autowired
    UserRepo userRepo;
    @Autowired
    QuestionRepo questionRepo;

    public UserEntity getUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("questions", questionRepo.findAll());

        return "home";
    }

    @RequestMapping("/admin")
    public String admin(HttpServletRequest request) {
        return "admin";
    }

    @RequestMapping("/profile")
    public String profile(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();

        model.addAttribute("user", userRepo.findByEmail(email));
        return "profile";
    }

    @RequestMapping("/log")
    public String log(HttpServletRequest request) {
        return "log";
    }
}
