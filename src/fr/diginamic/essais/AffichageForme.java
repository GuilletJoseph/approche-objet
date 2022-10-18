package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public  static void affiche (Forme forme) {
		double k= forme.calculerPerimetre();
		double f=forme.calculerSurface();

	
	System.out.println("perimetre-"+k+", surface-" + f);
	}

}
