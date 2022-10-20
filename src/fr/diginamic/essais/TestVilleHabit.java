package fr.diginamic.essais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import listes.Ville;
import listes.VilleServ;

public class TestVilleHabit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		List<Ville> liste1 = new ArrayList<Ville>();
		Ville nice = new Ville("Nice", 343000);
		Ville carcassonne = new Ville("Carcassonne", 47800);
		Ville narbonne = new Ville("Narbonne", 53400 );
		Ville lyon = new Ville("Lyon", 484000);
		Ville foix = new Ville("Foix", 9700);
		Ville pau = new Ville("Pau", 77200);
		Ville marceille = new Ville("Marceille", 850700);
		Ville tarbes = new Ville("Tarbes", 40600);
		
		Collections.addAll(liste1, nice, carcassonne, narbonne, lyon, foix, pau, marceille, tarbes );
		
		VilleServ villeservice =new VilleServ();
		
		
		villeservice.setList(liste1);
		System.out.println("List avant de changement");
		villeservice.afficheList();
		System.out.println(" ");
		System.out.println("Ville plus de habitants");
		villeservice.recherchePlus();
		System.out.println(" ");
		villeservice.supprimeM();
		villeservice.modifierPlus100();
		System.out.println("List apres de changement");
		villeservice.afficheList();
		
		
		
		
	}

}
