package com.service.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.service.management.model.Players;

@Repository
public interface PlayersRepository extends CrudRepository<Players, Integer> {

}
