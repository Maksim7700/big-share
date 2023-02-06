package com.bigshare.Bigshare.services;

import com.bigshare.Bigshare.models.QuestionnaireModel;
import com.bigshare.Bigshare.repositories.QuestionnaireModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuestionnaireModelService {

    private final QuestionnaireModelRepository questionnaireModelRepository;

    @Autowired
    public QuestionnaireModelService(QuestionnaireModelRepository questionnaireModelRepository) {
        this.questionnaireModelRepository = questionnaireModelRepository;
    }

    public ResponseEntity<String> addQuestionnaire(QuestionnaireModel questionnaire) {
        try {
            questionnaireModelRepository.save(questionnaire);
        } catch (Exception e) {
            return new ResponseEntity<>("500",HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity<>("OK",HttpStatus.OK);
    }
}
