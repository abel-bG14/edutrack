package com.edutrack.web.controller;

import com.edutrack.domain.service.CourseService;
import com.edutrack.persistence.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")

public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAll() {
        return courseService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourse(@PathVariable Long id) {
        return courseService.getCourse(id);
    }

    @PostMapping
    public Course save(@RequestBody Course course) {
        return courseService.save(course);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        return courseService.delete(id);
    }
}
