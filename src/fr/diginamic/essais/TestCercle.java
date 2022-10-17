package fr.diginamic.essais;

import fr.diginamic.banque.entites.Circle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle=new Circle(5);
		
		System.out.println("Surface de circle "+circle.getSurface());
		System.out.println("Perimetre de circle "+circle.getPerim());
		
		CercleFactory.getCircle(6.0);
	}


}
