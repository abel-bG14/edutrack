package com.edutrack.web.controller;

import com.edutrack.domain.service.GradeService;
import com.edutrack.persistence.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/grades")

public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping
    public List<Grade> getAll() {
        return gradeService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Grade> getGrade(@PathVariable Long id) {
        return gradeService.getGrade(id);
    }

    @PostMapping
    public Grade save(@RequestBody Grade grade) {
        return gradeService.save(grade);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        return gradeService.delete(id);
    }
}
