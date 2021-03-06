package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collation = "EtatCmd")
public class EtatCmd {
	
	@Id
	private String idEtat; 
	private String descEtat; 
	@DBRef
	private Commande commande;
	

}
