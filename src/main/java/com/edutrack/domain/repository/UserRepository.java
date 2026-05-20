package com.edutrack.domain.repository;

import com.edutrack.persistence.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    List<UserEntity> getAll();

    Optional<UserEntity> getUser(Long id);

    UserEntity save(UserEntity userEntity);

    void delete(Long id);

}
