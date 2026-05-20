package com.edutrack.web.controller;

import com.edutrack.domain.service.EvaluationService;
import com.edutrack.persistence.entity.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/evaluations")

public class EvaluationController {

    @Autowired
    private EvaluationService evaluationService;

    @GetMapping
    public List<Evaluation> getAll() {
        return evaluationService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Evaluation> getEvaluation(@PathVariable Long id) {
        return evaluationService.getEvaluation(id);
    }

    @PostMapping
    public Evaluation save(@RequestBody Evaluation evaluation) {
        return evaluationService.save(evaluation);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        return evaluationService.delete(id);
    }
}
