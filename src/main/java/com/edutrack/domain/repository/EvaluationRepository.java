package com.edutrack.domain.repository;

import com.edutrack.persistence.entity.Evaluation;

import java.util.List;
import java.util.Optional;

public interface EvaluationRepository {

    List<Evaluation> getAll();

    Optional<Evaluation> getEvaluation(Long id);

    Evaluation save(Evaluation evaluation);

    void delete(Long id);
}
