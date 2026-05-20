package com.edutrack.persistence.crud;

import com.edutrack.persistence.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentCrudRepository extends JpaRepository<Enrollment, Long> {
}
