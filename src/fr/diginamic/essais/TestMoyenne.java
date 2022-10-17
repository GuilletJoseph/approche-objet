package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
	public static void main(String[] args) {
		CalculMoyenne calculm=new CalculMoyenne(4,5);
		CalculMoyenne.ajout();
		CalculMoyenne.ajout();
		CalculMoyenne.affiche();
	}
}
