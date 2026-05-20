package com.edutrack.domain.repository;

import com.edutrack.persistence.entity.Grade;

import java.util.List;
import java.util.Optional;

public interface GradeRepository {

    List<Grade> getAll();

    Optional<Grade> getGrade(Long id);

    Grade save(Grade grade);

    void delete(Long id);
}
