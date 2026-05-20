package com.edutrack.persistence;

import com.edutrack.domain.repository.GradeRepository;
import com.edutrack.persistence.crud.GradeCrudRepository;
import com.edutrack.persistence.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class GradeRepositoryImpl implements GradeRepository {

    @Autowired
    private GradeCrudRepository gradeCrudRepository;

    @Override
    public List<Grade> getAll() {

        List<Grade> grades = new ArrayList<>();

        gradeCrudRepository.findAll().forEach(grades::add);

        return grades;
    }

    @Override
    public Optional<Grade> getGrade(Long id) {
        return gradeCrudRepository.findById(id);
    }

    @Override
    public Grade save(Grade grade) {
        return gradeCrudRepository.save(grade);
    }

    @Override
    public void delete(Long id) {
        gradeCrudRepository.deleteById(id);
    }
}
