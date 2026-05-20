package com.edutrack.persistence.crud;

import com.edutrack.persistence.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseCrudRepository extends JpaRepository<Course, Long> {
}
