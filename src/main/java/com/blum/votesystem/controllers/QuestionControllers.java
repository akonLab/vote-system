package com.blum.votesystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.blum.votesystem.models.QuestionEntity;
import com.blum.votesystem.repo.QuestionRepo;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/question")
public class QuestionControllers {
    @Autowired
     QuestionRepo questionRepo;

    @ModelAttribute("allQuestion")
    public Iterable<QuestionEntity> showAll() {
        return questionRepo.findAll();
    }

    @PostMapping("add")
    public String add(HttpServletRequest request) {
        QuestionEntity question = new QuestionEntity(
                request.getParameter("question"),
                request.getParameter("ans1"),
                request.getParameter("ans2"),
                null,
                null,
                null
        );
        questionRepo.save(question);

        return "home";
    }

    @PostMapping("edit")
    public String edit(HttpServletRequest request) {
        QuestionEntity question = new QuestionEntity(
                Integer.parseInt(request.getParameter("id")),
                request.getParameter("question"),
                request.getParameter("ans1"),
                request.getParameter("ans2"),
                Integer.parseInt(request.getParameter("count")),
                request.getParameter("ans1_count"),
                request.getParameter("ans2_count")
        );
        questionRepo.save(question);

        return "home";
    }

    @PostMapping("remove")
    public String remove(HttpServletRequest request) {
        questionRepo.deleteById(Integer.valueOf(request.getParameter("id")));

        return "home";
    }
}

