package com.bigshare.Bigshare.controllers;


import com.bigshare.Bigshare.models.QuestionnaireModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestionnaireController {

    private final JavaMailSender javaMailSender;

    @Autowired
    public QuestionnaireController(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @PostMapping(value = "/questionnaire", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin("*")
    public ResponseEntity<String> postQuestionnaire(@RequestBody QuestionnaireModel questionnaireModel) {
        sendEmail(questionnaireModel);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private void sendEmail(QuestionnaireModel questionnaireModel) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("no-reply@gmail.com");
        simpleMailMessage.setTo("bigshare@bigshare-agency.com");
        simpleMailMessage.setSubject("questionnaireRequest");
        simpleMailMessage.setText(questionnaireModel.toString());
        javaMailSender.send(simpleMailMessage);
    }

    @GetMapping(value = "/get")
    public String get() {
        return "GET";
    }
}
