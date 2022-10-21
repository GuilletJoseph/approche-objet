package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import listes.Ville;

public class TriVille{
	public static void main(String[] args) {
		 //Avec TreeSet compare
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
	 System.out.println("Le list pas compare par le nombre des habitants");
	        for (Ville v: liste1) {
	            System.out.println(v.getNom()+" "+v.getNbHabit());
	        }
	        
	        
	        //1-mier method Comparartor
	         HabitComparator habitcomparator = new HabitComparator();
	        //liste1.sort(habitcomparator);
	        
	        // 2eme method  comparable
	        
	        // Collections.sort(liste1);
	        
	        //3-eme 
	         
	         Collections.sort(liste1, habitcomparator);
	        
	
	 
	 
	        System.out.println("method sort: nom de Ville");
	        for (Ville v: liste1) {
	        	System.out.println(v.getNom()+" "+v.getNbHabit());
	        }
	        
	        NbHbComparator nbhbcomparator = new NbHbComparator();
	        
	        liste1.sort(nbhbcomparator);
	        System.out.println("method sort: nombre habitants");
	        for (Ville v: liste1) {
	        	System.out.println(v.getNom()+" "+v.getNbHabit());
	        }
	        
	        
	    }
		
		
		}
