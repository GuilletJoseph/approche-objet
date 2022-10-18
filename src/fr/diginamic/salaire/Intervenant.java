package fr.diginamic.salaire;

public abstract class Intervenant {
	
	
protected String nom;
protected String prenom;
	
	public Intervenant(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}
	public abstract void getSalaire();
	public  void afficherDonnees() {
		System.out.println(nom+prenom);
		
	}
	
}
