package com.edutrack.domain.service;

import com.edutrack.domain.repository.EvaluationRepository;
import com.edutrack.persistence.entity.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluationService {

    @Autowired
    private EvaluationRepository evaluationRepository;

    public List<Evaluation> getAll() {
        return evaluationRepository.getAll();
    }

    public Optional<Evaluation> getEvaluation(Long id) {
        return evaluationRepository.getEvaluation(id);
    }

    public Evaluation save(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    public boolean delete(Long id) {

        return getEvaluation(id).map(evaluation -> {
            evaluationRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
