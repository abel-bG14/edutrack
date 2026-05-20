package com.edutrack.web.controller;

import com.edutrack.domain.service.EnrollmentService;
import com.edutrack.persistence.entity.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enrollments")

public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping
    public List<Enrollment> getAll() {
        return enrollmentService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Enrollment> getEnrollment(@PathVariable Long id) {
        return enrollmentService.getEnrollment(id);
    }

    @PostMapping
    public Enrollment save(@RequestBody Enrollment enrollment) {
        return enrollmentService.save(enrollment);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        return enrollmentService.delete(id);
    }
}
