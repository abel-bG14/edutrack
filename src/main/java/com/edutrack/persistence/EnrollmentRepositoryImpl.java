package com.edutrack.persistence;

import com.edutrack.domain.repository.EnrollmentRepository;
import com.edutrack.persistence.crud.EnrollmentCrudRepository;
import com.edutrack.persistence.entity.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EnrollmentRepositoryImpl implements EnrollmentRepository {

    @Autowired
    private EnrollmentCrudRepository enrollmentCrudRepository;

    @Override
    public List<Enrollment> getAll() {

        List<Enrollment> enrollments = new ArrayList<>();

        enrollmentCrudRepository.findAll().forEach(enrollments::add);

        return enrollments;
    }

    @Override
    public Optional<Enrollment> getEnrollment(Long id) {
        return enrollmentCrudRepository.findById(id);
    }

    @Override
    public Enrollment save(Enrollment enrollment) {
        return enrollmentCrudRepository.save(enrollment);
    }

    @Override
    public void delete(Long id) {
        enrollmentCrudRepository.deleteById(id);
    }
}
