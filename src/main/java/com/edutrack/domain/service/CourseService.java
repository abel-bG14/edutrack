package com.edutrack.domain.service;

import com.edutrack.domain.repository.CourseRepository;
import com.edutrack.persistence.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAll() {
        return courseRepository.getAll();
    }

    public Optional<Course> getCourse(Long id) {
        return courseRepository.getCourse(id);
    }

    public Course save(Course course) {
        return courseRepository.save(course);
    }

    public boolean delete(Long id) {

        return getCourse(id).map(course -> {
            courseRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
