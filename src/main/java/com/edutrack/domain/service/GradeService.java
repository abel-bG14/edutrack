package com.edutrack.domain.service;

import com.edutrack.domain.repository.GradeRepository;
import com.edutrack.persistence.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    public List<Grade> getAll() {
        return gradeRepository.getAll();
    }

    public Optional<Grade> getGrade(Long id) {
        return gradeRepository.getGrade(id);
    }

    public Grade save(Grade grade) {
        return gradeRepository.save(grade);
    }

    public boolean delete(Long id) {

        return getGrade(id).map(grade -> {
            gradeRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
