package com.service.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.service.management.model.Teams;

@Repository
public interface TeamsRepository extends CrudRepository<Teams, Integer> {


}
