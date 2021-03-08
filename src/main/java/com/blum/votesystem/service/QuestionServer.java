package com.blum.votesystem.service;

import com.blum.votesystem.models.QuestionEntity;
import com.blum.votesystem.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class QuestionServer {
    @Autowired
    QuestionRepo questionRepo;

    public List<Integer> getUserListOfAnswer(QuestionEntity question) {
        List<Integer> listOfUserId = new ArrayList<>();
        for (String str : question.getAns1_count().split(" ")) {
            listOfUserId.add(Integer.parseInt(str));
        }
        return listOfUserId;
    }

    Double getProcent(Integer part, Integer general) {
        return (double) (part * 100 / general);
    }

}
