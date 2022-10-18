package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	
	
	
	
	
	private int montant;
	private int nbJours; 
	
	public Pigiste(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
		
		
		this.montant=75;
		this.nbJours=5;
	}
	
	
	@Override
	
	public void getSalaire() {
		// TODO Auto-generated method stub
		
		System.out.println(nom+" "+prenom+" "+montant+" "+nbJours);
		
	}



}


