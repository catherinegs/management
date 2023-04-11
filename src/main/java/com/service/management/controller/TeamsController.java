package com.service.management.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.management.service.TeamsService;
import com.service.management.model.Teams;

@RestController
@RequestMapping("/foot")
public class TeamsController {
	
	@Autowired
	TeamsService teamService;
	
	@RequestMapping("/teams")
	public Iterable<Teams> getAllTeams() {
		return teamService.getAllTeams();
	}
	
	

	


}
