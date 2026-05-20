package com.edutrack.domain.repository;

import com.edutrack.persistence.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    List<Student> getAll();

    Optional<Student> getStudent(Long id);

    Student save(Student student);

    void delete(Long id);
}
