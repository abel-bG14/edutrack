package com.edutrack.persistence.crud;

import com.edutrack.persistence.entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationCrudRepository extends JpaRepository<Evaluation, Long> {
}
