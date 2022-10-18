package fr.diginamic.maison;

public class Piece {

	
	
	private int etage;
	private double superficie;
	protected int type;
	
	
	public Piece(int etage, double superficie, int type) {
		super();
		this.etage = etage;
		this.superficie = superficie;
		this.type=type;
	}
	
	
	
	public int getEtage() {
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
