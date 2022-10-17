package entites;

public class Theatre {

	
	
	private String nom;
	private int capacite;
	private int totalClientIns;
	private int recetteTotale;
	
	
	
	
	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Theatre(String nom, int capacite) {
		super();
		this.nom = nom;
		this.capacite = capacite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public int getTotalClientIns() {
		return totalClientIns;
	}

	public void setTotalClientIns(int totalClientIns) {
		this.totalClientIns = totalClientIns;
	}

	public int getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(int recetteTotale) {
		this.recetteTotale = recetteTotale;
	}
	
	public int getCombReste() {
		return capacite-totalClientIns;
	}
	public void affiche() {
		System.out.println(nom+capacite);
		
		
	}
	
	
	
	public void inscrire(int nbIns, int prix) {
		recetteTotale=recetteTotale+(prix*nbIns);
		totalClientIns=totalClientIns+nbIns;
		int restPl=capacite-totalClientIns;
		System.out.println("total clients incrits "+totalClientIns+" recette totale "+recetteTotale);
		System.out.println("Il reste des "+ restPl+"Ajoutez:");
		//System.out.println("Le teatre "+ nom +" est plein");
		
	}
	
	
	
	
	}
	
	
}
