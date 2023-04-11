package com.service.management.model.Dtos;

import org.hibernate.validator.constraints.NotEmpty;

import com.service.management.constraints.NumberPlayer;
import com.service.management.model.Players;
import com.service.management.model.Teams;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PlayersDtos {
	
	@NotEmpty(message = "The player's name is required.")
	@Size(min = 2, max = 100, message = "The length of full lastname must be between 2 and 100 characters.")
	private String lastNamePlayer;
	
	@NotEmpty(message = "The player's name is required.")
	@Size(min = 2, max = 100, message = "The length of full firstname must be between 2 and 100 characters.")
	private String firstNamePlayer;

	@NumberPlayer(Values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 })
	private int numberPlayer;

	@NotEmpty(message = "The player must be attached at a team.")
	private Teams team;
	
	
	public Players toPlayers() {
		return new Players();
	}

}
