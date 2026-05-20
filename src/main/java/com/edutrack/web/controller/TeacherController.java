package com.edutrack.web.controller;

import com.edutrack.domain.service.TeacherService;
import com.edutrack.persistence.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teachers")

public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Teacher> getTeacher(@PathVariable Long id) {
        return teacherService.getTeacher(id);
    }

    @PostMapping
    public Teacher save(@RequestBody Teacher teacher) {
        return teacherService.save(teacher);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        return teacherService.delete(id);
    }
}
