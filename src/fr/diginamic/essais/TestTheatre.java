package fr.diginamic.essais;

import entites.Theatre;
import java.util.Scanner;



public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Theatre th= new Theatre ("Grande Theatre", 60);
		th.affiche();
		Scanner scanner = new Scanner(System.in) ;	
		
		do {
			System.out.println("Ajouter nombre des personnes");
			th.setNbPersonne(scanner.nextInt());	
			System.out.println("Ajouter prix");
			th.setPrix(scanner.nextInt());	
			th.inscrire();
		}while(th.getCombReste()>0);	
		th.affichePlein();
		scanner.close(); 
		}
	}


