package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cercle cercle=new Cercle(2) ;
Carre carre=new Carre(3);
Rectangle rectangle=new Rectangle(2,5);


AffichageForme.affiche(rectangle);
AffichageForme.affiche(cercle);
AffichageForme.affiche(carre);


}
}


