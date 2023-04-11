package com.service.management.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.management.model.Players;
import com.service.management.repository.PlayersRepository;

import lombok.Data;

@Data
@Service
public class PlayersService {
	
	@Autowired
	private static PlayersRepository playersRepo;
	
	public Iterable<Players> getAllPlayers() {
		return playersRepo.findAll();
	}
	
	public Players savePlayer(Players player) {
		
		return playersRepo.save(player);
	}
	
	public Optional<Players> getPlayerById(int idPlayer) {
		
		return playersRepo.findById(idPlayer);
	}
	
	public String deletePlayers(int idPlayer) {
		
		playersRepo.deleteById(idPlayer);
		return "player removed" + idPlayer;
	}
	

	
	
	

}
