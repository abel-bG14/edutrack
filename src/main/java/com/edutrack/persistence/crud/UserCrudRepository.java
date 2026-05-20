package com.edutrack.persistence.crud;

import com.edutrack.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCrudRepository extends JpaRepository<UserEntity, Long> {
}
