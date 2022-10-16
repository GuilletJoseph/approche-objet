package fr.diginamic.banque.entites;

public class Compte {
 private int numeroCompte;
 private int soldeCompte;
 
 
public Compte(int numeroCompte, int soldeCompte) {
	super();
	this.numeroCompte = numeroCompte;
	this.soldeCompte = soldeCompte;
}
 
 public void Affiche() {
	 System.out.println(numeroCompte+soldeCompte);
	 
 }
 
 
 
}
