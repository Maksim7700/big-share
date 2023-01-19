package com.bigshare.Bigshare.controllers;


import com.bigshare.Bigshare.models.MailModel;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionnaireController {

    private final JavaMailSender javaMailSender;

    public QuestionnaireController(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @PostMapping("/questionnaire")
    public void questionnaireRequest() {
        MailModel mailModel = new MailModel();
        mailModel.setComment("Comment");
        mailModel.setName("name");
        mailModel.setCompany("bighsare");
        mailModel.setPhone("030420304");
        
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("no-reply@gmail.com");
        simpleMailMessage.setTo("bigshareua@gmail.com");
        simpleMailMessage.setSubject("questionnaireRequest");
        simpleMailMessage.setText(mailModel.toString());
        javaMailSender.send(simpleMailMessage);
    }
}
