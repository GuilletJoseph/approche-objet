package fr.diginamic.utils;

import fr.diginamic.banque.entites.Circle;

public class CercleFactory {

	
	
	public static void getCircle (double c) {
		Circle circle=new Circle(c);
		System.out.println("Le cercle ete cree dont perimetre: " + circle.getPerim()+"et surface "+circle.getSurface());
		
		
		
	}
}
