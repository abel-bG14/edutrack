package com.edutrack.web.controller;

import com.edutrack.domain.service.RoleService;
import com.edutrack.persistence.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles")

public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> getAll() {
        return roleService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Role> getRole(@PathVariable Long id) {
        return roleService.getRole(id);
    }

    @PostMapping
    public Role save(@RequestBody Role role) {
        return roleService.save(role);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        return roleService.delete(id);
    }
}
