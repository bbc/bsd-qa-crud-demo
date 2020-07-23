package com.crudexample.cruddemo.repository;

import com.crudexample.cruddemo.model.SearchChanges;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface SearchChangesRepository extends CrudRepository<SearchChanges, String> {
}
