package entites;

public class Theatre {

	
	
	private String nom;
	private int capacite;
	private int totalClientIns;
	private int recetteTotale;
	private int nbPersonne;
	private int prix;
	private int combReste;
	
	
	
	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Theatre(String nom, int capacite) {
		super();
		this.nom = nom;
		this.capacite = capacite;
	}
	
	
	public int getNbPersonne() {
		return nbPersonne;
	}

	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	
	
	public void setCombReste(int combReste ) {
		this.combReste=combReste;
	}
	
	public int getCombReste() {
		return capacite-totalClientIns;
	}
	public void affiche() {
		System.out.println(nom + " "+capacite+" persone");
		
		
	}
	public void affichePlein() {
		
		System.out.println("Le teatre "+ nom +" est plein");
		
	}
	
	
	public void inscrire() {
		recetteTotale=recetteTotale+(prix*nbPersonne);
		totalClientIns=totalClientIns+nbPersonne;
		this.combReste=capacite-totalClientIns;
		System.out.println("total clients incrits "+totalClientIns+" recette totale "+recetteTotale+" euros");
		System.out.println("Il reste des "+ combReste+" Ajouter:");
		
		
	}
	
	
	
	
	}
	
	
