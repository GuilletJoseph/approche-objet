package fr.diginamic.formes;

public class Cercle  extends Forme{

	private double rayon;
	


	public Cercle(int rayon) {
		super();
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		
		return  Math.PI * (rayon * rayon);
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return  Math.PI * 2*rayon;
		
	}

}
