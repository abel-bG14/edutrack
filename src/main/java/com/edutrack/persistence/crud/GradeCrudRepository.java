package com.edutrack.persistence.crud;

import com.edutrack.persistence.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeCrudRepository extends JpaRepository<Grade, Long> {
}
