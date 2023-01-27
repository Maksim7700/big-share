package com.bigshare.Bigshare.services;

import com.bigshare.Bigshare.models.Questionnaire;
import com.bigshare.Bigshare.models.QuestionnaireModel;
import com.bigshare.Bigshare.repositories.QuestionnaireModelRepository;
import com.bigshare.Bigshare.repositories.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuestionnaireModelService {

    private final QuestionnaireModelRepository questionnaireModelRepository;
    private final QuestionnaireRepository questionnaireRepository;

    @Autowired
    public QuestionnaireModelService(QuestionnaireModelRepository questionnaireModelRepository, QuestionnaireRepository questionnaireRepository) {
        this.questionnaireModelRepository = questionnaireModelRepository;
        this.questionnaireRepository = questionnaireRepository;
    }

    public ResponseEntity<String> addQuestionnaire(QuestionnaireModel questionnaire) {
        try {
            questionnaireRepository.save(questionnaire.getQuestionnaire());;
            questionnaireModelRepository.save(questionnaire);
            return new ResponseEntity<>("OK",HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("500",HttpStatus.EXPECTATION_FAILED);
        }
    }
}
