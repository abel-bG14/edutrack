package com.edutrack.domain.service;

import com.edutrack.domain.repository.UserRepository;
import com.edutrack.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAll() {
        return userRepository.getAll();
    }

    public Optional<UserEntity> getUser(Long id) {
        return userRepository.getUser(id);
    }

    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public boolean delete(Long id) {
        return getUser(id).map(user -> {
            userRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
