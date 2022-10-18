package fr.diginamic.formes;

public class Carre  extends Rectangle{
	

	int longeur;


	public Carre(int longeur) {
		super(longeur, longeur);
		this.longeur = longeur;
	}


	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return    4*longeur;
	}
	
	

}
