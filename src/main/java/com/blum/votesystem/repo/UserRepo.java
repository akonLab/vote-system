package com.blum.votesystem.repo;

import com.blum.votesystem.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    UserEntity findByEmail(String email);

    @Override
    void delete(UserEntity user);
}
