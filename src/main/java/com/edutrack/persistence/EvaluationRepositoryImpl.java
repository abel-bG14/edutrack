package com.edutrack.persistence;

import com.edutrack.domain.repository.EvaluationRepository;
import com.edutrack.persistence.crud.EvaluationCrudRepository;
import com.edutrack.persistence.entity.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EvaluationRepositoryImpl implements EvaluationRepository {

    @Autowired
    private EvaluationCrudRepository evaluationCrudRepository;

    @Override
    public List<Evaluation> getAll() {

        List<Evaluation> evaluations = new ArrayList<>();

        evaluationCrudRepository.findAll().forEach(evaluations::add);

        return evaluations;
    }

    @Override
    public Optional<Evaluation> getEvaluation(Long id) {
        return evaluationCrudRepository.findById(id);
    }

    @Override
    public Evaluation save(Evaluation evaluation) {
        return evaluationCrudRepository.save(evaluation);
    }

    @Override
    public void delete(Long id) {
        evaluationCrudRepository.deleteById(id);
    }
}
