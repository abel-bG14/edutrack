package com.edutrack.domain.repository;

import com.edutrack.persistence.entity.Enrollment;

import java.util.List;
import java.util.Optional;

public interface EnrollmentRepository {

    List<Enrollment> getAll();

    Optional<Enrollment> getEnrollment(Long id);

    Enrollment save(Enrollment enrollment);

    void delete(Long id);
}
