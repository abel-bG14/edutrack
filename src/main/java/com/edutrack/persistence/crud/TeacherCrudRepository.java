package com.edutrack.persistence.crud;

import com.edutrack.persistence.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherCrudRepository extends JpaRepository<Teacher, Long> {
}
