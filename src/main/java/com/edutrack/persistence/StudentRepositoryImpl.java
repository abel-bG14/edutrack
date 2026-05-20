package com.edutrack.persistence;

import com.edutrack.domain.repository.StudentRepository;
import com.edutrack.persistence.crud.StudentCrudRepository;
import com.edutrack.persistence.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private StudentCrudRepository studentCrudRepository;

    @Override
    public List<Student> getAll() {

        List<Student> students = new ArrayList<>();

        studentCrudRepository.findAll().forEach(students::add);

        return students;
    }

    @Override
    public Optional<Student> getStudent(Long id) {
        return studentCrudRepository.findById(id);
    }

    @Override
    public Student save(Student student) {
        return studentCrudRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        studentCrudRepository.deleteById(id);
    }
}
