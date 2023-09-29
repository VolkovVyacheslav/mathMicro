package com.volkov.mathmicro;


import com.volkov.mathmicro.model.Question;
import com.volkov.mathmicro.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MathController {

    @Autowired
    private MathService mathService;

    @GetMapping("/questions")
    public List<Question> getRandomQuestions(@RequestParam("amount") int amount){
        List<Question> questions = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            questions.add(mathService.getRandom());
        }
        return questions;
    }
}
