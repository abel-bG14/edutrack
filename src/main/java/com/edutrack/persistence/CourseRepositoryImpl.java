package com.edutrack.persistence;

import com.edutrack.domain.repository.CourseRepository;
import com.edutrack.persistence.crud.CourseCrudRepository;
import com.edutrack.persistence.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    @Autowired
    private CourseCrudRepository courseCrudRepository;

    @Override
    public List<Course> getAll() {

        List<Course> courses = new ArrayList<>();

        courseCrudRepository.findAll().forEach(courses::add);

        return courses;
    }

    @Override
    public Optional<Course> getCourse(Long id) {
        return courseCrudRepository.findById(id);
    }

    @Override
    public Course save(Course course) {
        return courseCrudRepository.save(course);
    }

    @Override
    public void delete(Long id) {
        courseCrudRepository.deleteById(id);
    }
}
