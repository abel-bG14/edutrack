package com.edutrack.domain.service;

import com.edutrack.domain.repository.TeacherRepository;
import com.edutrack.persistence.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    public Optional<Teacher> getTeacher(Long id) {
        return teacherRepository.getTeacher(id);
    }

    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public boolean delete(Long id) {

        return getTeacher(id).map(teacher -> {
            teacherRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
