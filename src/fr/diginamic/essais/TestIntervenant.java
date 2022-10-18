package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Salarie salarie=new Salarie("Guillet", "Joseph","CDD");
Pigiste pigiste=new Pigiste("Guillet", "Elnur");


salarie.getSalaire();
pigiste.getSalaire();

	}

}
