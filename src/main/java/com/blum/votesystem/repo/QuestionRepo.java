package com.blum.votesystem.repo;

import com.blum.votesystem.models.QuestionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends CrudRepository<QuestionEntity, Integer> {
}
