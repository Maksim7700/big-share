package com.bigshare.Bigshare.repositories;

import com.bigshare.Bigshare.models.QuestionnaireModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionnaireModelRepository extends JpaRepository<QuestionnaireModel, Long> {
}
