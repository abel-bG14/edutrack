package com.edutrack.domain.repository;

import com.edutrack.persistence.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseRepository {

    List<Course> getAll();

    Optional<Course> getCourse(Long id);

    Course save(Course course);

    void delete(Long id);
}
