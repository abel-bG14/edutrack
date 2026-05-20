package com.edutrack.persistence;

import com.edutrack.domain.repository.RoleRepository;
import com.edutrack.persistence.crud.RoleCrudRepository;
import com.edutrack.persistence.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository

public class RoleRepositoryImpl implements RoleRepository {

    @Autowired
    private RoleCrudRepository roleCrudRepository;

    @Override
    public List<Role> getAll() {

        List<Role> roles = new ArrayList<>();

        roleCrudRepository.findAll().forEach(roles::add);

        return roles;
    }

    @Override
    public Optional<Role> getRole(Long id) {
        return roleCrudRepository.findById(id);
    }

    @Override
    public Role save(Role role) {
        return roleCrudRepository.save(role);
    }

    @Override
    public void delete(Long id) {
        roleCrudRepository.deleteById(id);
    }


}
