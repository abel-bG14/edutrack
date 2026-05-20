package com.edutrack.persistence;

import com.edutrack.domain.repository.UserRepository;
import com.edutrack.persistence.crud.UserCrudRepository;
import com.edutrack.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserCrudRepository userCrudRepository;

    @Override
    public List<UserEntity> getAll() {
        return (List<UserEntity>) userCrudRepository.findAll();
    }

    @Override
    public Optional<UserEntity> getUser(Long id) {
        return userCrudRepository.findById(id);
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userCrudRepository.save(userEntity);
    }

    @Override
    public void delete(Long id) {
        userCrudRepository.deleteById(id);
    }
}
