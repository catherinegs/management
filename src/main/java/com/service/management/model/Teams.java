package com.service.management.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
 

@Data
@Entity
@Table(name="teams")
public class Teams {

	// instance variables 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int idTeam;
	
	@Column(length = 100, nullable = false)
	private String nameTeam;
	
	@Column(length = 10, nullable = false)
	private String acronym;
	
	@Column(length = 50, nullable = false)
	private double budget;
	
	@OneToMany(mappedBy = "team")
	private List<Players> playerList;
	

    	
	
}
