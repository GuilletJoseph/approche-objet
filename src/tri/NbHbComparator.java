package tri;

import java.util.Comparator;

import listes.Ville;

public class NbHbComparator implements Comparator<Ville> {
 
    public int compare(Ville h1, Ville h2) {
    	
    	
        if (h1.getNbHabit() == h2.getNbHabit()) {
            return 0;
        }
        if (h1.getNbHabit() > h2.getNbHabit()) {
            return 1;
        }
        else {
            return -1;
        }
    }
    
}

