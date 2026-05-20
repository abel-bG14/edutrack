package com.edutrack.domain.service;

import com.edutrack.domain.repository.RoleRepository;
import com.edutrack.persistence.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAll() {
        return roleRepository.getAll();
    }

    public Optional<Role> getRole(Long id) {
        return roleRepository.getRole(id);
    }

    public Role save(Role role){
        return roleRepository.save(role);
    }

    public boolean delete(Long id) {
        return getRole(id).map(role -> {
            roleRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
