package com.edutrack.persistence.crud;

import com.edutrack.persistence.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleCrudRepository extends JpaRepository<Role, Long> {
}
