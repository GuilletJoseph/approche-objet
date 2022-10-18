package fr.diginamic.formes;

public class Rectangle extends Forme {

	int longeur;
	int largeur;



	public Rectangle(int longeur, int largeur) {
		super();
		this.longeur = longeur;
		this.largeur = largeur;
	}

	
	
	public int getLongeur() {
		return longeur;
	}



	public void setLongeur(int longeur) {
		this.longeur = longeur;
	}



	public int getLargeur() {
		return largeur;
	}



	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}



	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
	
		return longeur*largeur;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return    2*(longeur+largeur);
	}

}
