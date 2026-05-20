package com.edutrack.domain.service;

import com.edutrack.domain.repository.StudentRepository;
import com.edutrack.persistence.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    public Optional<Student> getStudent(Long id) {
        return studentRepository.getStudent(id);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public boolean delete(Long id) {

        return getStudent(id).map(student -> {
            studentRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
