package com.edutrack.persistence;

import com.edutrack.domain.repository.TeacherRepository;
import com.edutrack.persistence.crud.TeacherCrudRepository;
import com.edutrack.persistence.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TeacherRepositoryImpl implements TeacherRepository {

    @Autowired
    private TeacherCrudRepository teacherCrudRepository;

    @Override
    public List<Teacher> getAll() {

        List<Teacher> teachers = new ArrayList<>();

        teacherCrudRepository.findAll().forEach(teachers::add);

        return teachers;
    }

    @Override
    public Optional<Teacher> getTeacher(Long id) {
        return teacherCrudRepository.findById(id);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherCrudRepository.save(teacher);
    }

    @Override
    public void delete(Long id) {
        teacherCrudRepository.deleteById(id);
    }
}
