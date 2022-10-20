package listes;

import java.util.ArrayList;
import java.util.List;

public class Ville {

	
	
	
private String nom;
private int nbHabit;


public Ville(String nom, int nbHabit) {
	super();
	this.setNom(nom);
	this.setNbHabit(nbHabit);
	
}


public int getNbHabit() {
	return nbHabit;
}


public void setNbHabit(int nbHabit) {
	this.nbHabit = nbHabit;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}		
}	


