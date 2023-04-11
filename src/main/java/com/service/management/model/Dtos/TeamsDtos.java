package com.service.management.model.Dtos;

import java.util.List;

import org.hibernate.validator.constraints.*;

import com.service.management.model.Players;
import com.service.management.model.Teams;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;
import lombok.Data;

import javax.persistence.*;


@Data
public class TeamsDtos {
	

	@NotEmpty(message = "The team's name is required.")
	@Size(min = 2, max = 100, message = "The length of full name must be between 2 and 100 characters.")
	private String nameTeam;
	
	@NotEmpty(message = "The team's acronym is required.")
	@Size(min = 1, message = "The length of acronym must be at less 1 character.")
	private String acronym;
		
	private double budget;
	
	@Max(value=20, message="must be equal or less than 20 players")
	@OneToMany(mappedBy = "team")
	private List<Players> playerList;
	
	public Teams toTeams() {
		return new Teams();
	}

}
