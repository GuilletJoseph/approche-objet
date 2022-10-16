package entites2;

import entites.AdressePostale;

public class Personne {
	
	private String nom;
	private String prenom;
	
	
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}



	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}

	

	public void Affiche () {		
		System.out.println(nom.toUpperCase()+"  "+ prenom);		
	}

	
	public void Affiche2 () {		
		System.out.println(nom.toUpperCase()+"  " + prenom);	
		adressePostale.getAdressePostale();
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public AdressePostale getAdressePostale() {
		return adressePostale;
	}



	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}

	
	
	
	
}
