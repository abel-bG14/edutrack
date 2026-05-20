package com.edutrack.domain.repository;

import com.edutrack.persistence.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleRepository {

    List<Role> getAll();

    Optional<Role> getRole(Long id);

    Role save(Role role);

    void delete(Long id);
}
