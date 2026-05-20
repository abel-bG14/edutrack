package com.edutrack.web.controller;

import com.edutrack.domain.service.UserService;
import com.edutrack.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<UserEntity> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping
    public UserEntity save(@RequestBody UserEntity userEntity) {
        return userService.save(userEntity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        return userService.delete(id);
    }
}
