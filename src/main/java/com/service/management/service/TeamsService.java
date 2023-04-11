package com.service.management.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.management.model.Teams;
import com.service.management.repository.TeamsRepository;

import lombok.Data;

@Data
@Service
public class TeamsService  {
	
	@Autowired
	private TeamsRepository teamsRepository;
	
	public Iterable<Teams> getAllTeams() {
		return teamsRepository.findAll();
	}
	
	public Teams saveTeams(Teams team) {
		
		return teamsRepository.save(team);
	}
	
	public Optional<Teams> getTeamsById(int idTeam) {
		
		return teamsRepository.findById(idTeam);
	}
	
	public String deleteTeams(int idTeam) {
		
		teamsRepository.deleteById(idTeam);
		return "Team removed" + idTeam;
	}
	
	
  
    




}
