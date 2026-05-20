package com.edutrack.persistence.crud;

import com.edutrack.persistence.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCrudRepository extends JpaRepository<Student, Long> {
}
