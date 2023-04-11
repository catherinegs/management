package com.service.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.management.model.Players;
import com.service.management.service.PlayersService;

@RestController
@RequestMapping("/foot")
public class PlayersController {
	
	@Autowired
	PlayersService playerService;
	
	@RequestMapping("/players")
	public Iterable<Players> getAllPlayers() {
		return playerService.getAllPlayers();
	}
	

	
	

}
