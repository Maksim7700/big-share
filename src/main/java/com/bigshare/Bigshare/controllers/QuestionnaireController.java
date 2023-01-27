package com.bigshare.Bigshare.controllers;


import com.bigshare.Bigshare.models.QuestionnaireModel;
import com.bigshare.Bigshare.services.QuestionnaireModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestionnaireController {

    private final QuestionnaireModelService questionnaireService;

    @Autowired
    public QuestionnaireController(QuestionnaireModelService questionnaireService) {
        this.questionnaireService = questionnaireService;
    }

    @PostMapping(value = "/questionnaire", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin("*")
    public ResponseEntity<String> postQuestionnaire(@RequestBody QuestionnaireModel questionnaireModel) {
        return questionnaireService.addQuestionnaire(questionnaireModel);
    }


    @GetMapping(value = "/get")
    public String get() {
        return "PUT";
    }
}
