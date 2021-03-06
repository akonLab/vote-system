package com.blum.votesystem.repo;

import com.blum.votesystem.models.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Integer> {
}
