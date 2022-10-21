package tri;

import java.util.Comparator;

import listes.Ville;

public class HabitComparator implements Comparator<Ville> {
 
    public int compare(Ville h1, Ville h2) {
    	
    	int result = h1.getNom().compareTo(h2.getNom());
    	return result;
    }
    
}
