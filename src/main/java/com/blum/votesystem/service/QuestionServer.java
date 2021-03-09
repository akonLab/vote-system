package com.blum.votesystem.service;

import com.blum.votesystem.models.QuestionEntity;
import com.blum.votesystem.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class QuestionServer {
    @Autowired
    QuestionRepo questionRepo;

    public List<Integer> getUserListOfAnswer(String ans_count) {
        List<Integer> listOfUserId = new ArrayList<>();
        for (String str : ans_count.split(" ")) {
            listOfUserId.add(Integer.parseInt(str));
        }
        return listOfUserId;
    }

    public Integer getCount(String ans_count) {
        if (ans_count.trim().equals(" ")||ans_count.trim().equals("")) return 0;
        return ans_count.trim().split(" ").length;
    }

    public Double getProcent(String part, Integer general) {
        part = part.trim();
        Integer partCount;

        if (part.split(" ").length == 0 || general == 0) {
            return 0.0;
        }

        if (!part.equals(" ") || !part.equals(' ') || part != null || general != null) {
            partCount = getUserListOfAnswer(part).size();
            if (partCount == 0) {
                return 0.0;
            }
        } else {
            return 0.0;
        }

        return (double) (partCount * 100 / general + 1);
    }

}
