package com.service.management.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="players")
public class Players {
	// instance variables 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int idPlayers;
	@Column
	private String lastNamePlayer;
	@Column
	private String firstNamePlayer;
	@Column
	private int numberPlayer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Teams team;

}
