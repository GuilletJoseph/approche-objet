package listes;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.testenumeration.Continent;

public class Ville implements Comparable<Ville> {

	
	
	
private String nom;
private int nbHabit;
private Continent continent;


public Ville(String nom, int nbHabit, Continent continent) {
	super();
	this.setNom(nom);
	this.setNbHabit(nbHabit);
	this.continent=continent;
	
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



public Continent getContinent() {
    return continent;
}

public void setContinent(Continent continent) {
    this.continent = continent;
}

@Override
public int compareTo(Ville o) {
	// TODO Auto-generated method stub
	if (this.nbHabit == o.nbHabit) {
        return 0;
    } else if (this.nbHabit < o.nbHabit) {
        return -1;
    } else {
        return 1;
    }
}		
}	


