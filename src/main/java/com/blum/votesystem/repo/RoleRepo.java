package com.blum.votesystem.repo;

import com.blum.votesystem.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);

    @Override
    void delete(Role role);
}
