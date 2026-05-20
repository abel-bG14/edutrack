package com.edutrack.domain.service;

import com.edutrack.domain.repository.EnrollmentRepository;
import com.edutrack.persistence.entity.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Enrollment> getAll() {
        return enrollmentRepository.getAll();
    }

    public Optional<Enrollment> getEnrollment(Long id) {
        return enrollmentRepository.getEnrollment(id);
    }

    public Enrollment save(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public boolean delete(Long id) {

        return getEnrollment(id).map(enrollment -> {
            enrollmentRepository.delete(id);
            return true;
        }).orElse(false);
    }

}
