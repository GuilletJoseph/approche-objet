package entites;

public class Salarie {

	private String nom;
	private String prenom;
	private double salaire;
	public Salarie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Salarie(String nom, String prenom, double salaire) {
		super();
		
		System.out.println("Appel de classe salaire ");
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
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
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	public void affiche() {
		
		System.out.println("Classe salaire "+nom+ " " +prenom+" "+salaire);
	}
	
}
