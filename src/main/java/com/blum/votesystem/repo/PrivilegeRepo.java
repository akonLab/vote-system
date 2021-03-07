package com.blum.votesystem.repo;

import com.blum.votesystem.models.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepo extends JpaRepository<Privilege,Long> {
    Privilege findByName(String name);

    @Override
    void delete(Privilege privilege);
}

