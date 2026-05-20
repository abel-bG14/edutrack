package com.edutrack.domain.repository;

import com.edutrack.persistence.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherRepository {

    List<Teacher> getAll();

    Optional<Teacher> getTeacher(Long id);

    Teacher save(Teacher teacher);

    void delete(Long id);
}
