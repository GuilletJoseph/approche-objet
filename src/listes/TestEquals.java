package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEquals {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Ville> liste1 = new ArrayList<Ville>();
        List<Ville> liste2 = new ArrayList<Ville>();
        Ville nice = new Ville("Nice", 343000);
        Ville carcassonne = new Ville("Carcassonne", 47800);
        Ville narbonne = new Ville("Narbonne", 53400 );
        Ville lyon = new Ville("Lyon", 484000);
        Ville foix = new Ville("Foix", 9700);
        Ville pau = new Ville("Pau", 77200);
        Ville marceille = new Ville("Marceille", 850700);
        Ville tarbes = new Ville("Tarbes", 40600);
        
        Collections.addAll(liste1, nice, carcassonne, narbonne, lyon, foix, pau, marceille, tarbes );
        Collections.addAll(liste2, nice, carcassonne, narbonne, lyon, foix, pau, marceille, tarbes );
        
        System.out.println(liste1.equals(liste2));
        System.out.println(liste1==liste2);
    }

}
